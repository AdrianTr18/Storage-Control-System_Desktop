package Controlador;

import Procesos.ProcesosMenuPrincipal;
import Vista.JFrmMenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMenuPrincipal implements ActionListener{
    //Variables
    JFrmMenuPrincipal vista;
    //Construtor
    public ControladorMenuPrincipal(JFrmMenuPrincipal frmmenu){
        vista = frmmenu;
        vista.jmiInicio.addActionListener(this);
        vista.jmiSalir.addActionListener(this);
        ProcesosMenuPrincipal.Presentacion(frmmenu);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jmiInicio){
            vista.jpnlInicio.setVisible(true);
        }
        
        if(e.getSource() == vista.jmiSalir){
            System.exit(0);
        }
    }
    
}
