package Procesos;

import Vista.JFrmInicioSesion;

public class ProcesosIniciarSesion {
    //Metodos
    public static void Presentacion(JFrmInicioSesion frminicio){
        frminicio.setTitle("Inicio de Sesión");
        frminicio.jpsfContraseña.setOpaque(false);
        frminicio.jtxtUsuario.setOpaque(false);
        frminicio.jbtnRegistrar.setText("¿Eres nuevo? Regístrate");
        frminicio.jbtnSalir.setOpaque(false);
        frminicio.jtxtUsuario.requestFocus();
    }    
}
