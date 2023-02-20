package DAO;

import Formatos.Mensajes;
import Modelo.Usuarios;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DAO_Usuarios extends ConexionDB{
    //Constructor
    public DAO_Usuarios(){};
    //Métodos
    public void RegistrarUsuario(Usuarios usu){
        try {
            //Preparamos la consulta
            ps = conexion.prepareStatement("Insert into Usuarios (nombre, apellido_paterno, apellido_materno, correo, usuario, contrasenia, IDSexo, indicador) "
                    + "values (?, ?, ?, ?, ?, ?, ?, 'S');");
            //Actualizamos
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getApellidoPaterno());
            ps.setString(3, usu.getApellidoMaterno());
            ps.setString(4, usu.getCorreo());
            ps.setString(5, usu.getUsuario());
            ps.setString(6, usu.getContrasenia());
            ps.setInt(7, usu.getIDsexo());
            //Ejecutamos la orden
            ps.executeUpdate();
            Mensajes.showMessage("¡Usuario regsitrado con éxito!");
            conexion.close();
        } catch (Exception e) {
            Mensajes.showMessage("ERROR No se pudo registrar el usuario "+e.toString());
        }
    }
    
    public Boolean ValidarUsuario(JTextField usuario, JPasswordField contrasenia){
        try {
            ps = conexion.prepareStatement("Select * from Usuarios u where u.usuario = ? and u.contrasenia = ?;");
            ps.setString(1, usuario.getText());
            ps.setString(2, String.valueOf(contrasenia.getPassword()));
            rs = ps.executeQuery();
            if(rs.next()){
                Mensajes.showMessage("¡Bienvenido "+ usuario.getText()+"!");
                return true;
            }else{
                Mensajes.showMessage("Usuario o contraseña incorrecta.");
                return false;
            }
        } catch (Exception e) {
            Mensajes.showMessage("ERROR no se pudo validar el usuario o la contraseña "+ e.toString());
        }
        return false;
    }
}
