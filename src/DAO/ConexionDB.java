package DAO;

import java.sql.*;
import Formatos.*;

public class ConexionDB implements ParametrosConexion{
    //Atributos
    Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData mdata;
    //Constructor para la conexion
    public ConexionDB(){
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(RUTA, USUARIO, PASSWORD);
            st = conexion.createStatement();
        } catch (Exception ex) {
            Mensajes.showMessage("Error al establecer la conexión con la base de datos "+ex.toString());
        }
    } 
}
