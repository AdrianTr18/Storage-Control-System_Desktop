package Controlador;

import DAO.DAO_Usuarios;
import Main.Principal;
import Modelo.Usuarios;
import Procesos.ProcesosRegistrarUsuario;
import Vista.JFrmInicioSesion;
import Vista.JFrmRegistrarUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistrarUsuario implements ActionListener{
    //Variable
    JFrmRegistrarUsuario vista;
    DAO_Usuarios crud;
    Usuarios usu;
    //Constructor
    public ControladorRegistrarUsuario(JFrmRegistrarUsuario frmusuario){
        vista=frmusuario;
        vista.jbtnRegistrar.addActionListener(this);
        vista.jbtnRegresoInicio.addActionListener(this);
        ProcesosRegistrarUsuario.Presentacion(frmusuario);
        frmusuario.setLocationRelativeTo(null);
        frmusuario.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jbtnRegistrar){
            //Aquí va el método DAO para registrar el usuario
            usu = ProcesosRegistrarUsuario.CrearUsuario(vista);
            crud = new DAO_Usuarios();
            crud.RegistrarUsuario(usu);
            //Se regresa al inicio de sesión para ingresar con el usuario registrado
            Principal.frminicio = new JFrmInicioSesion();
            Principal.coninicio = new ControladorIniciarSesion(Principal.frminicio);
            Principal.frminicio.setVisible(true);
            vista.dispose();
        }
        
        if(e.getSource() == vista.jbtnRegresoInicio){
            JFrmInicioSesion jfrminicio = new JFrmInicioSesion();
            ControladorIniciarSesion controlador = new ControladorIniciarSesion(jfrminicio);
            jfrminicio.setVisible(true);
            vista.dispose();
        }
    }
}
