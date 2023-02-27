package Modelo;

import DAO.AdministrarFK;

public class Productos_Entrantes {
    
    private int IDProductoEntrante;
    private int IDProducto; //Llave foranea
    private int IDTipoProducto; //Llave foranea
    private int IDUbicacion; //Llave foranea
    private int Cantidad; 
    private String Fecha;
    private String Indicador;
    
    public Productos_Entrantes(){};

    public int getIDProductoEntrante() { return IDProductoEntrante; }

    public void setIDProductoEntrante(int IDProductoEntrante) { this.IDProductoEntrante = IDProductoEntrante; }

    public int getIDProducto() { return IDProducto; }

    public void setIDProducto(int IDProducto) { this.IDProducto = IDProducto; }

    public int getIDTipoProducto() { return IDTipoProducto; }

    public void setIDTipoProducto(int IDTipoProducto) { this.IDTipoProducto = IDTipoProducto; }

    public int getIDUbicacion() { return IDUbicacion; }

    public void setIDUbicacion(int IDUbicacion) { this.IDUbicacion = IDUbicacion; }

    public int getCantidad() { return Cantidad; }

    public void setCantidad(int Cantidad) { this.Cantidad = Cantidad; }

    public String getFecha() { return Fecha; }

    public void setFecha(String Fecha) { this.Fecha = Fecha; }

    public String getIndicador() { return Indicador; }

    public void setIndicador(String Indicador) { this.Indicador = Indicador; }
    
    public Object [] Fila (int num){
        AdministrarFK fk1 = new AdministrarFK();
        String Producto = fk1.RecuperarNombre(fk1.consultarProducto, IDProducto);
        AdministrarFK fk2 = new AdministrarFK();
        String TipoProducto = fk2.RecuperarNombre(fk2.consultarTipoProducto, IDTipoProducto);
        AdministrarFK fk3 = new AdministrarFK();
        String Ubicacion = fk3.RecuperarNombre(fk3.consultarUbicacion, IDUbicacion);
        Object Fila [] = {num, IDProductoEntrante, Producto, TipoProducto, Ubicacion, Cantidad, Fecha, Indicador};
        return Fila;
    }
}
