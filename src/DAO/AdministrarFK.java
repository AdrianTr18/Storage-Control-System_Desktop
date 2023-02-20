package DAO;

import Formatos.Mensajes;

public class AdministrarFK extends ConexionDB{
    //Consultas
    public String consultarSexo = "Select Tipo from Sexo where IDSexo = ?;";
    public String consultarIDSexo = "Select s.IDSexo from Sexo s where s.Tipo = ?;";
    //Constructor
    public AdministrarFK(){};
    //Métodos
    public String RecuperarNombre(String consulta, int parametro){
        String nombre = "";
        try {
            ps = conexion.prepareStatement(consulta);
            ps.setInt(1, parametro);
            rs = ps.executeQuery();
            if(rs.next()){
                nombre = rs.getString(1);
            }
        } catch (Exception e) {
            Mensajes.showMessage("ERROR no se puede recuperar los nombres. "+e.toString());
        }
        return nombre;
    }
    //Método para recuperar el ID
    public int RecuperarID(String consulta, String parametro){
        int id = 0;
        try {
            ps = conexion.prepareStatement(consulta);
            ps.setString(1, parametro);
            rs = ps.executeQuery();
            if(rs.next()){
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            Mensajes.showMessage("ERROR no se puede recuperar el ID. "+e.toString());
        }
        return id;
    }
}
