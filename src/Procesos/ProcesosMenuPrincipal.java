package Procesos;

import DAO.DAO_Usuarios;
import Main.Principal;
import Vista.JFrmMenuPrincipal;

public class ProcesosMenuPrincipal {

    static DAO_Usuarios usua;
    
    public static void Presentacion(JFrmMenuPrincipal frmprincipal){
        frmprincipal.setLocationRelativeTo(null);
        frmprincipal.setVisible(true);
        frmprincipal.setTitle("Sistema de Control de Almacenamiento");
        usua = new DAO_Usuarios();
        String nombre = usua.RecuperarNombre(Principal.frminicio.jtxtUsuario);
        frmprincipal.jlblNombreUser.setText("¡Bienvenido, "+nombre+"!");
    }
}
