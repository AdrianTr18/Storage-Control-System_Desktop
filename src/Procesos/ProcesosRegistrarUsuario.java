package Procesos;

import DAO.AdministrarFK;
import DAO.DAO_ActualizarCombos;
import Modelo.Usuarios;
import Vista.JFrmRegistrarUsuario;

public class ProcesosRegistrarUsuario {
    
    public static void Presentacion(JFrmRegistrarUsuario frmusuario){
        frmusuario.jtxtNombre.setOpaque(false);
        frmusuario.jtxtApellidoPaterno.setOpaque(false);
        frmusuario.jtxtApellidoMaterno.setOpaque(false);
        frmusuario.jtxtContraseña.setOpaque(false);
        frmusuario.jtxtCorreo.setOpaque(false);
        frmusuario.jtxtUsuario.setOpaque(false);
        frmusuario.jcbxGenero.setOpaque(false);
        frmusuario.jtxtNombre.requestFocus();
        DAO_ActualizarCombos ac = new DAO_ActualizarCombos();
        ac.ActualizarCombos(frmusuario.jcbxGenero, ac.Consultacombosexo);
    }
    
    public static void LimpiarEntradas(JFrmRegistrarUsuario frmusuario){
        frmusuario.jtxtNombre.setText("");
        frmusuario.jtxtApellidoPaterno.setText("");
        frmusuario.jtxtApellidoMaterno.setText("");
        frmusuario.jtxtContraseña.setText("");
        frmusuario.jtxtCorreo.setText("");
        frmusuario.jtxtUsuario.setText("");
    }
    
    public static Usuarios CrearUsuario(JFrmRegistrarUsuario frmusuario){
        Usuarios usu = new Usuarios();
        usu.setNombre(frmusuario.jtxtNombre.getText());
        usu.setApellidoPaterno(frmusuario.jtxtApellidoMaterno.getText());
        usu.setApellidoMaterno(frmusuario.jtxtApellidoMaterno.getText());
        usu.setCorreo(frmusuario.jtxtCorreo.getText());
        usu.setUsuario(frmusuario.jtxtUsuario.getText());
        usu.setContrasenia(frmusuario.jtxtContraseña.getText());
        AdministrarFK fk = new AdministrarFK();
        usu.setIDsexo(fk.RecuperarID(fk.consultarIDSexo, frmusuario.jcbxGenero.getSelectedItem().toString()));
        return usu;
    }
}
