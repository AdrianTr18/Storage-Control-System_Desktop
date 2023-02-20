package DAO;

import Formatos.Mensajes;
import javax.swing.JComboBox;

public class DAO_ActualizarCombos extends ConexionDB{
    public DAO_ActualizarCombos(){};
    //Consultas
    public String Consultacombosexo = "Select s.Tipo from Sexo s order by 1;";
    //Métodos
    public void ActualizarCombos(JComboBox combo, String consulta){
        try {
            rs = st.executeQuery(consulta);
            while(rs.next()){
                combo.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            Mensajes.showMessage("ERROR no se pudo actualizar la información. "+e.toString());
        }
    }
}
