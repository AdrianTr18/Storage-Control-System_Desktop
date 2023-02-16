package Main;

import Controlador.ControladorIniciarSesion;
import Vista.JFrmInicioSesion;

public class Principal {

    public static ControladorIniciarSesion coninicio;
    public static JFrmInicioSesion frminicio;
    
    
    public static void main(String[] args) {
        
        frminicio = new JFrmInicioSesion();
        coninicio = new ControladorIniciarSesion(frminicio);
    }
}
 