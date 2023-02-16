package Modelo;

public class Usuarios {
    //Variables
    int IDusuario; //Llave principal
    String nombre;
    String apellido;
    String correo;
    String usuario;
    int IDsexo; //Llave foranea
    String indicador;
    //Constructor
    public Usuarios(){}
    //Métodos

    public int getIDusuario() { return IDusuario; }

    public void setIDusuario(int IDusuario) { this.IDusuario = IDusuario; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) { this.correo = correo; }

    public String getUsuario() { return usuario; }

    public void setUsuario(String usuario) { this.usuario = usuario; }

    public int getIDsexo() { return IDsexo; }

    public void setIDsexo(int IDsexo) { this.IDsexo = IDsexo; }

    public String getIndicador() { return indicador; }

    public void setIndicador(String indicador) { this.indicador = indicador; }
    
    public Object [] Fila (int num){
        Object Fila [] = {num, IDusuario, nombre, apellido, correo, usuario, IDsexo, indicador};
        return Fila;
    }
}
