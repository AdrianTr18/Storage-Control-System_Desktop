package Vista;

public class JFrmInicioSesion extends javax.swing.JFrame {
        
    public JFrmInicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fSGradientPanel1 = new LIB.FSGradientPanel();
        jpnlDatos = new LIB.JPanelTransparente();
        jlblLogin = new javax.swing.JLabel();
        jPanelTransparente2 = new LIB.JPanelTransparente();
        jlblIconoUser = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jPanelTransparente3 = new LIB.JPanelTransparente();
        jlblIconoContraseña = new javax.swing.JLabel();
        jpsfContraseña = new javax.swing.JPasswordField();
        jbtnLogin = new javax.swing.JButton();
        jbtnContraseña = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jbtnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        fSGradientPanel1.setFSEndColor(new java.awt.Color(66, 134, 244));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(44, 62, 80));
        fSGradientPanel1.setFocusable(false);

        jpnlDatos.setColorPrimario(new java.awt.Color(32, 66, 130));
        jpnlDatos.setTran(0.3F);
        jpnlDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlblLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogin.setText("Login");
        jpnlDatos.add(jlblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 338, 50));

        jPanelTransparente2.setForeground(new java.awt.Color(189, 195, 199));
        jPanelTransparente2.setColorPrimario(new java.awt.Color(189, 195, 199));
        jPanelTransparente2.setColorSecundario(new java.awt.Color(189, 195, 199));
        jPanelTransparente2.setTran(0.4F);
        jPanelTransparente2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblIconoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblIconoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N
        jPanelTransparente2.add(jlblIconoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 50));

        jtxtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jtxtUsuario.setBorder(null);
        jPanelTransparente2.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 12, 150, 30));

        jpnlDatos.add(jPanelTransparente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 240, -1));

        jPanelTransparente3.setColorPrimario(new java.awt.Color(189, 195, 199));
        jPanelTransparente3.setColorSecundario(new java.awt.Color(189, 195, 199));
        jPanelTransparente3.setTran(0.4F);
        jPanelTransparente3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblIconoContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblIconoContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contrasenia.png"))); // NOI18N
        jPanelTransparente3.add(jlblIconoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 50));

        jpsfContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jpsfContraseña.setBorder(null);
        jPanelTransparente3.add(jpsfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 30));

        jpnlDatos.add(jPanelTransparente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 238, 50));

        jbtnLogin.setBackground(new java.awt.Color(77, 143, 255));
        jbtnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLogin.setText("LOGIN");
        jbtnLogin.setBorder(null);
        jbtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnLogin.setFocusPainted(false);
        jpnlDatos.add(jbtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 210, 45));

        jbtnContraseña.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jbtnContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jbtnContraseña.setText("¿Olvidaste tu contraseña?");
        jbtnContraseña.setBorder(null);
        jbtnContraseña.setBorderPainted(false);
        jbtnContraseña.setContentAreaFilled(false);
        jbtnContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnContraseña.setFocusPainted(false);
        jpnlDatos.add(jbtnContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 190, 30));

        jbtnSalir.setBackground(new java.awt.Color(62, 123, 219));
        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir (Equis).png"))); // NOI18N
        jbtnSalir.setBorder(null);
        jbtnSalir.setContentAreaFilled(false);
        jbtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnSalir.setFocusPainted(false);

        jbtnRegistrar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setText("Registrate");
        jbtnRegistrar.setBorder(null);
        jbtnRegistrar.setBorderPainted(false);
        jbtnRegistrar.setContentAreaFilled(false);
        jbtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistrar.setFocusPainted(false);

        javax.swing.GroupLayout fSGradientPanel1Layout = new javax.swing.GroupLayout(fSGradientPanel1);
        fSGradientPanel1.setLayout(fSGradientPanel1Layout);
        fSGradientPanel1Layout.setHorizontalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fSGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnSalir))
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jpnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 315, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fSGradientPanel1Layout.setVerticalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnSalir)
                .addGap(37, 37, 37)
                .addComponent(jpnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmInicioSesion().setVisible(true);
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSGradientPanel fSGradientPanel1;
    private LIB.JPanelTransparente jPanelTransparente2;
    private LIB.JPanelTransparente jPanelTransparente3;
    public javax.swing.JButton jbtnContraseña;
    public javax.swing.JButton jbtnLogin;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlblIconoContraseña;
    private javax.swing.JLabel jlblIconoUser;
    private javax.swing.JLabel jlblLogin;
    private LIB.JPanelTransparente jpnlDatos;
    public javax.swing.JPasswordField jpsfContraseña;
    public javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
