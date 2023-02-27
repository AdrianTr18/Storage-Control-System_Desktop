package DAO;

import Formatos.Mensajes;

public class AdministrarFK extends ConexionDB{
    //Consultas
    public String consultarSexo = "Select Tipo from Sexo where IDSexo = ?;";
    public String consultarIDSexo = "Select IDSexo from Sexo where Tipo = ?;";
    public String consultarProducto = "Select Nombre from Productos where IDProducto = ? and Indicador = 'S';";
    public String consultarIDProducto = "Select IDProducto from Productos where nombre = ? and indicador = 'S';";
    public String consultarTipoProducto = "Select Tipo from Tipos_Producto where IDTipo_producto = ? and Indicador = 'S';";
    public String consultarIDTipoProducto = "Select IDTipo_Producto from Tipos_producto where Tipo = ? and Indicador = 'S';";
    public String consultarUbicacion = "Select Ubicacion from ubicacion_productos where IDUbicacion_productos = ? and indicador = 'S';";
    public String consultarIDUbicacion = "Select IDUbicacion_productos from Ubicacion_productos where Ubicacion = ? and Indicador = 'S';";
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
