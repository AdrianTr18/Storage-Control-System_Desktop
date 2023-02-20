package Main;

import Controlador.ControladorIniciarSesion;
import Controlador.ControladorRegistrarUsuario;
import Vista.JFrmInicioSesion;
import Vista.JFrmRegistrarUsuario;

public class Principal {

    public static ControladorIniciarSesion coninicio;
    public static JFrmInicioSesion frminicio;
    
    public static ControladorRegistrarUsuario conuregusu;
    public static JFrmRegistrarUsuario frmregusu;
    
    public static void main(String[] args) {
        
        frminicio = new JFrmInicioSesion();
        coninicio = new ControladorIniciarSesion(frminicio);
    }
}
 