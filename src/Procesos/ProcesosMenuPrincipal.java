package Procesos;

import Vista.JFrmMenuPrincipal;
import javax.swing.JFrame;

public class ProcesosMenuPrincipal {
    
    public static void Presentacion(JFrmMenuPrincipal frmprincipal){
        frmprincipal.setLocationRelativeTo(null);
        frmprincipal.setVisible(true);
        //frmprincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
