package Controlador;

import Procesos.ProcesosProductosSalientes;
import Vista.JIFrmProductosSalientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorProductosSalientes implements ActionListener{
   
    JIFrmProductosSalientes vista;
    
    public ControladorProductosSalientes(JIFrmProductosSalientes frmproductos){
        vista = frmproductos;
        ProcesosProductosSalientes.Presentacion(frmproductos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
