package Procesos;

import Vista.JFrmMenuPrincipal;
import javax.swing.JFrame;

public class ProcesosMenuPrincipal {
    
    public static void Presentacion(JFrmMenuPrincipal frmprincipal){
        frmprincipal.setLocationRelativeTo(null);
        frmprincipal.setVisible(true);
        frmprincipal.setTitle("Sistema de Control de Almacenamiento");
        //frmprincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
