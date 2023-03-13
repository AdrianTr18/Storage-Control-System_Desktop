package Controlador;

import Procesos.ProcesosProductosEntrantes;
import Vista.JIFrmProductosEntrantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorProductosEntrantes implements ActionListener{

    JIFrmProductosEntrantes vista;
    
    
    public ControladorProductosEntrantes(JIFrmProductosEntrantes frmProductosEntrantes){
        vista = frmProductosEntrantes;
        ProcesosProductosEntrantes.Presentacion(frmProductosEntrantes);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
    
}
