package Vista;

public class JFrmMenuPrincipal extends javax.swing.JFrame {

    public JFrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jpnlInicio = new LIB.FSGradientPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnInicio = new javax.swing.JMenu();
        jmiInicio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiProductosEntrantes = new javax.swing.JMenuItem();
        jmiProductosSalientes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmnSalir = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jdpPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jpnlInicio.setFSEndColor(new java.awt.Color(109, 213, 250));
        jpnlInicio.setFSStartColor(new java.awt.Color(66, 134, 244));

        javax.swing.GroupLayout jpnlInicioLayout = new javax.swing.GroupLayout(jpnlInicio);
        jpnlInicio.setLayout(jpnlInicioLayout);
        jpnlInicioLayout.setHorizontalGroup(
            jpnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );
        jpnlInicioLayout.setVerticalGroup(
            jpnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );

        jdpPrincipal.setLayer(jpnlInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addComponent(jpnlInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1161, Short.MAX_VALUE))
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(null);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jmnInicio.setText("Inicio");
        jmnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jmiInicio.setText("Inicio");
        jmiInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmnInicio.add(jmiInicio);

        jMenuBar1.add(jmnInicio);

        jMenu2.setText("Registro");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jmiProductosEntrantes.setText("Registro de Productos Entrates");
        jmiProductosEntrantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jmiProductosEntrantes);

        jmiProductosSalientes.setText("Registro de Productos Salientes");
        jMenu2.add(jmiProductosSalientes);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Almacén");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(jMenu1);

        jmnSalir.setText("Salir");
        jmnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jmiSalir.setText("Salir");
        jmnSalir.add(jmiSalir);

        jMenuBar1.add(jmnSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
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
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JDesktopPane jdpPrincipal;
    public javax.swing.JMenuItem jmiInicio;
    public javax.swing.JMenuItem jmiProductosEntrantes;
    public javax.swing.JMenuItem jmiProductosSalientes;
    public javax.swing.JMenuItem jmiSalir;
    public javax.swing.JMenu jmnInicio;
    private javax.swing.JMenu jmnSalir;
    public LIB.FSGradientPanel jpnlInicio;
    // End of variables declaration//GEN-END:variables
}
