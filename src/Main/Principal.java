package Main;

import Controlador.*;
import Formatos.CambiarImagen;
import Modelo.Usuarios;
import Vista.*;

public class Principal {

    public static ControladorIniciarSesion coninicio;
    public static JFrmInicioSesion frminicio;
    
    public static ControladorRegistrarUsuario conuregusu;
    public static JFrmRegistrarUsuario frmregusu;
    
    public static ControladorMenuPrincipal conmenu;
    public static JFrmMenuPrincipal frmmenu;
    
    public static ControladorProductosEntrantes conproductosentrantes;
    public static JIFrmProductosEntrantes frmproductosentrantes;
    
    public static ControladorProductosSalientes conproductossalientes;
    public static JIFrmProductosSalientes frmproductossalientes;
    
    public static CambiarImagen img;
    
    public static Usuarios usu;
    
    public static void main(String[] args) {
        
        frminicio = new JFrmInicioSesion();
        coninicio = new ControladorIniciarSesion(frminicio);
    }
}
 