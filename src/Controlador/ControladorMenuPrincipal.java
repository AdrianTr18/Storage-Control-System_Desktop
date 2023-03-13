package Controlador;

import Formatos.CentrarFormulario;
import Main.Principal;
import Procesos.ProcesosMenuPrincipal;
import Vista.*;
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
        vista.jmiProductosEntrantes.addActionListener(this);
        vista.jmiProductosSalientes.addActionListener(this);
        vista.setIconImage(Principal.img.getIconImage());
        ProcesosMenuPrincipal.Presentacion(frmmenu);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.jmiInicio){
            vista.jpnlInicio.setVisible(true);
        }
        
        if(e.getSource() == vista.jmiProductosEntrantes){
            Principal.frmproductosentrantes = new JIFrmProductosEntrantes();
            Principal.conproductosentrantes = new ControladorProductosEntrantes(Principal.frmproductosentrantes);
            vista.jdpPrincipal.add(Principal.frmproductosentrantes);
            CentrarFormulario.CPanel(vista.jdpPrincipal, Principal.frmproductosentrantes);
            Principal.frmproductossalientes.dispose();
        }
        
        if(e.getSource() == vista.jmiProductosSalientes){
            Principal.frmproductossalientes = new JIFrmProductosSalientes();
            Principal.conproductossalientes = new ControladorProductosSalientes(Principal.frmproductossalientes);
            vista.jdpPrincipal.add(Principal.frmproductossalientes);
            CentrarFormulario.CPanel(vista.jdpPrincipal, Principal.frmproductossalientes);
            Principal.frmproductosentrantes.dispose();
        }
        
        if(e.getSource() == vista.jmiSalir){
            System.exit(0);
        }
    }
}
