package Procesos;

import Modelo.Productos_Salientes;
import Vista.JIFrmProductosSalientes;

public class ProcesosProductosSalientes {
    
    public static void Presentacion(JIFrmProductosSalientes f2){
        f2.setTitle("Registro de Productos Salientes");
        f2.setVisible(true);
    }
    
    public Productos_Salientes RegistrarProducto(JIFrmProductosSalientes f2){
        Productos_Salientes produc = new Productos_Salientes();
        return produc;
    }
}
