package Modelo;

import DAO.AdministrarFK;

public class Usuarios {
    //Variables
    int IDusuario; //Llave principal
    String nombre;
    String apellido_paterno;
    String apellido_materno;
    String correo;
    String usuario;
    String contrasenia;
    int IDsexo; //Llave foranea
    String indicador;
    //Constructor
    public Usuarios(){}
    //Métodos

    public int getIDusuario() { return IDusuario; }

    public void setIDusuario(int IDusuario) { this.IDusuario = IDusuario; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidoPaterno() { return apellido_paterno; }

    public void setApellidoPaterno(String apellido_pat) { this.apellido_paterno = apellido_pat; }

    public String getApellidoMaterno() { return apellido_materno; }
    
    public void setApellidoMaterno(String apellido_mat) { this.apellido_materno = apellido_mat; }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) { this.correo = correo; }

    public String getUsuario() { return usuario; }

    public void setUsuario(String usuario) { this.usuario = usuario; }
    
    public String getContrasenia() { return contrasenia; }

    public void setContrasenia(String contrasenia) { this.contrasenia = contrasenia; }

    public int getIDsexo() { return IDsexo; }

    public void setIDsexo(int IDsexo) { this.IDsexo = IDsexo; }

    public String getIndicador() { return indicador; }

    public void setIndicador(String indicador) { this.indicador = indicador; }
    
    public Object [] Fila (int num){
        AdministrarFK fk = new AdministrarFK();
        String Sexo = fk.RecuperarNombre(fk.consultarSexo, IDsexo);
        Object Fila [] = {num, IDusuario, nombre, apellido_paterno, apellido_materno, correo, usuario,contrasenia, Sexo, indicador};
        return Fila;
    }
}
