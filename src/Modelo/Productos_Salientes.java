package Modelo;

import DAO.AdministrarFK;

public class Productos_Salientes {
    
    private int IDProductoSaliente;
    private int IDProducto; //Llave Foranea
    private int IDTipoProducto; // Llave Foranea
    private int Cantidad;
    private String Descripcion;
    private String Fecha;
    private String Indicador;
    
    public Productos_Salientes(){};

    public int getIDProductoSaliente() { return IDProductoSaliente; }

    public void setIDProductoSaliente(int IDProductoSaliente) { this.IDProductoSaliente = IDProductoSaliente; }

    public int getIDProducto() { return IDProducto; }

    public void setIDProducto(int IDProducto) { this.IDProducto = IDProducto; }

    public int getIDTipoProducto() { return IDTipoProducto; }

    public void setIDTipoProducto(int IDTipoProducto) { this.IDTipoProducto = IDTipoProducto; }

    public int getCantidad() { return Cantidad; }

    public void setCantidad(int Cantidad) { this.Cantidad = Cantidad; }

    public String getDescripcion() { return Descripcion; }

    public void setDescripcion(String Descripcion) { this.Descripcion = Descripcion; }

    public String getFecha() { return Fecha; }

    public void setFecha(String Fecha) { this.Fecha = Fecha; }

    public String getIndicador() { return Indicador; }

    public void setIndicador(String Indicador) { this.Indicador = Indicador; }
    
    public Object [] Fila (int num){
        AdministrarFK fk1 = new AdministrarFK();
        String Producto = fk1.RecuperarNombre(fk1.consultarProducto, IDProducto);
        AdministrarFK fk2 = new AdministrarFK();
        String TipoProducto = fk2.RecuperarNombre(fk2.consultarTipoProducto, IDTipoProducto);
        Object Fila [] = {num, IDProductoSaliente, Producto, TipoProducto, Cantidad, Descripcion, Fecha, Indicador};
        return Fila;
    }
}
