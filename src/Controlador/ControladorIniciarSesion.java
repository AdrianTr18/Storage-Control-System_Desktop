package Controlador;

import DAO.DAO_Usuarios;
import Main.Principal;
import Modelo.Usuarios;
import Procesos.ProcesosIniciarSesion;
import Vista.JFrmInicioSesion;
import Vista.JFrmMenuPrincipal;
import Vista.JFrmRegistrarUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorIniciarSesion implements ActionListener{
    //Variables
    JFrmInicioSesion vista;
    DAO_Usuarios crud;
    Usuarios usu;
    //Constructor
    public ControladorIniciarSesion(JFrmInicioSesion frminicio){
        vista=frminicio;
        vista.jbtnLogin.addActionListener(this);
        vista.jbtnSalir.addActionListener(this);
        vista.jbtnContraseña.addActionListener(this);
        vista.jbtnRegistrar.addActionListener(this);
        frminicio.setLocationRelativeTo(null);
        vista.setIconImage(Principal.img.getIconImage());
        ProcesosIniciarSesion.Presentacion(frminicio);
        frminicio.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jbtnLogin){
            crud = new DAO_Usuarios();
            if(crud.ValidarUsuario( vista.jtxtUsuario, vista.jpsfContraseña) == true){
                System.out.println("Entraste a la interfaz principal");
                Principal.frmmenu = new JFrmMenuPrincipal();
                Principal.conmenu = new ControladorMenuPrincipal(Principal.frmmenu);
                vista.dispose();
            } else {
                System.out.println("No ingresaste a la interfaz principal");
            }
        }
        
        if(e.getSource() == vista.jbtnContraseña){
            
        }
        
        if(e.getSource() == vista.jbtnRegistrar){
            Principal.frmregusu = new JFrmRegistrarUsuario();
            Principal.conuregusu = new ControladorRegistrarUsuario(Principal.frmregusu);
            vista.dispose();
        }
        
        if(e.getSource() == vista.jbtnSalir){
            System.exit(0);
        }
    }
}
