package Formatos;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class CentrarFormulario {
    public static void CPanel(JDesktopPane panel,JInternalFrame interalframe){
        Dimension desktopSize = panel.getSize();
        Dimension jifSize = interalframe.getSize();
        interalframe.setLocation((desktopSize.width - jifSize.width)/2+157,
                         (desktopSize.height - jifSize.height)/2-1);
    }
}
