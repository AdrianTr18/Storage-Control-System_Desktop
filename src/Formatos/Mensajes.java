package Formatos;

import javax.swing.JOptionPane;

public class Mensajes {
    public static void showMessage(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
    public static String inputMessage(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    
    public static int ConfirmDialog(String titulo, String mensaje){
        return JOptionPane.showConfirmDialog(null,mensaje, titulo, JOptionPane.OK_CANCEL_OPTION);
    }
}
