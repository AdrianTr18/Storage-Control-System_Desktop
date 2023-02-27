package Main;

import Controlador.ControladorIniciarSesion;
import Controlador.ControladorMenuPrincipal;
import Controlador.ControladorRegistrarUsuario;
import Vista.JFrmInicioSesion;
import Vista.JFrmMenuPrincipal;
import Vista.JFrmRegistrarUsuario;

public class Principal {

    public static ControladorIniciarSesion coninicio;
    public static JFrmInicioSesion frminicio;
    
    public static ControladorRegistrarUsuario conuregusu;
    public static JFrmRegistrarUsuario frmregusu;
    
    public static ControladorMenuPrincipal conmenu;
    public static JFrmMenuPrincipal frmmenu;
    
    public static void main(String[] args) {
        
        frminicio = new JFrmInicioSesion();
        coninicio = new ControladorIniciarSesion(frminicio);
    }
}
 