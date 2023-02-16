package Controlador;

import Procesos.ProcesosIniciarSesion;
import Vista.JFrmInicioSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorIniciarSesion implements ActionListener{
    //Variables
    JFrmInicioSesion vista;
    //Constructor
    public ControladorIniciarSesion(JFrmInicioSesion frminicio){
        vista=frminicio;
        vista.jbtnLogin.addActionListener(this);
        vista.jbtnSalir.addActionListener(this);
        vista.jbtnContraseña.addActionListener(this);
        vista.jbtnRegistrar.addActionListener(this);
        frminicio.setLocationRelativeTo(null);
        ProcesosIniciarSesion.Presentacion(frminicio);
        frminicio.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jbtnLogin){
            
        }
        
        if(e.getSource() == vista.jbtnContraseña){
            
        }
        
        if(e.getSource() == vista.jbtnRegistrar){
            
        }
        
        if(e.getSource() == vista.jbtnSalir){
            System.exit(0);
        }
    }
}
