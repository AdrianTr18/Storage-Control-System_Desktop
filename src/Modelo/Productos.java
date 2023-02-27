package Modelo;

public class Productos {
    private int IDProducto;
    private String nombre;
    private String indicador;
    
    public Productos(){};

    public int getIDProducto() { return IDProducto; }

    public void setIDProducto(int IDProducto) { this.IDProducto = IDProducto; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIndicador() { return indicador; }

    public void setIndicador(String indicador) { this.indicador = indicador; }
    
    public Object [] Fila (int num){
        Object Fila [] = {num, IDProducto, nombre, indicador};
        return Fila;
    }
}
