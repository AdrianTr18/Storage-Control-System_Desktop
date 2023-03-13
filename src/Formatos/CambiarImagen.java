package Formatos;

import java.awt.Image;
import java.awt.Toolkit;

public class CambiarImagen {
    
    public CambiarImagen(){};
    
    public static Image getIconImage(){
        Image setImage = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/IconoPrincipal.png"));
        return setImage;
    }
}
