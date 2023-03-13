package Procesos;

import Modelo.Productos_Entrantes;
import Vista.JIFrmProductosEntrantes;

public class ProcesosProductosEntrantes {
    
    public static void Presentacion(JIFrmProductosEntrantes f1){
        f1.setTitle("Registro de Productos Entrantes");
        f1.setVisible(true);
    }
    
    public static void LimpiarEntradas(JIFrmProductosEntrantes f1){
        
    }
        
    public static Productos_Entrantes CrearProductoEntrante(){
        Productos_Entrantes produ = new Productos_Entrantes();
        return produ;
    }
}
