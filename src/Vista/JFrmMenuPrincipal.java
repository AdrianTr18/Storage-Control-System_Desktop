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
        jlblImagenUser = new javax.swing.JLabel();
        jlblNombreUser = new javax.swing.JLabel();
        jPanelTransparente1 = new LIB.JPanelTransparente();
        jLabel1 = new javax.swing.JLabel();
        jbtnChrome = new Conexión_De_botones.Botones_Link();
        jbtnGmail = new Conexión_De_botones.Botones_Link();
        jbtnOutlook = new Conexión_De_botones.Botones_Link();
        jbtnCalculadora = new Conexión_De_botones.Botones_Link();
        jbtnExplorador = new Conexión_De_botones.Botones_Link();
        jbtnNotepad = new Conexión_De_botones.Botones_Link();
        jbtnExcel = new Conexión_De_botones.Botones_Link();
        jbtnWord = new Conexión_De_botones.Botones_Link();
        jbtnDrive = new Conexión_De_botones.Botones_Link();
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

        jlblImagenUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblImagenUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioFoto.png"))); // NOI18N

        jlblNombreUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblNombreUser.setForeground(new java.awt.Color(255, 255, 255));
        jlblNombreUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNombreUser.setText("¡Bienvenido, Nombre!");

        jPanelTransparente1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTransparente1.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTransparente1.setColorPrimario(new java.awt.Color(255, 255, 255));
        jPanelTransparente1.setColorSecundario(new java.awt.Color(255, 255, 255));
        jPanelTransparente1.setTran(0.4F);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Accesos Rápidos");

        jbtnChrome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnChrome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Chrome.png"))); // NOI18N
        jbtnChrome.setToolTipText("Google Chrome");
        jbtnChrome.setLink("https://www.google.com/");

        jbtnGmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnGmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gmail.png"))); // NOI18N
        jbtnGmail.setToolTipText("Gmail");
        jbtnGmail.setLink("https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser");

        jbtnOutlook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnOutlook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Outlook.png"))); // NOI18N
        jbtnOutlook.setToolTipText("Outlook");
        jbtnOutlook.setLink("https://outlook.live.com/");

        jbtnCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculadora.png"))); // NOI18N
        jbtnCalculadora.setToolTipText("Calculadora");
        jbtnCalculadora.setLink("calc");

        jbtnExplorador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnExplorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/File Explorer.png"))); // NOI18N
        jbtnExplorador.setToolTipText("Explorador de archivos");
        jbtnExplorador.setLink("explorer");

        jbtnNotepad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnNotepad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Notepad.png"))); // NOI18N
        jbtnNotepad.setToolTipText("Block de Notas");
        jbtnNotepad.setLink("notepad");

        jbtnExcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Google sheets.png"))); // NOI18N
        jbtnExcel.setToolTipText("Hojas de cálculo");
        jbtnExcel.setLink("https://docs.google.com/spreadsheets/u/0/");

        jbtnWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Google docs.png"))); // NOI18N
        jbtnWord.setToolTipText("Documentos de Google");
        jbtnWord.setLink("https://docs.google.com/document/u/0/");

        jbtnDrive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnDrive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Google Drive.png"))); // NOI18N
        jbtnDrive.setToolTipText("Google Drive");
        jbtnDrive.setLink("https://drive.google.com/drive/u/0/my-drive");

        javax.swing.GroupLayout jPanelTransparente1Layout = new javax.swing.GroupLayout(jPanelTransparente1);
        jPanelTransparente1.setLayout(jPanelTransparente1Layout);
        jPanelTransparente1Layout.setHorizontalGroup(
            jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbtnCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnChrome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                        .addComponent(jbtnExplorador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnNotepad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                        .addComponent(jbtnWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnDrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                        .addComponent(jbtnGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jbtnOutlook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTransparente1Layout.setVerticalGroup(
            jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnChrome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnOutlook, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnDrive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnExplorador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnNotepad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnlInicioLayout = new javax.swing.GroupLayout(jpnlInicio);
        jpnlInicio.setLayout(jpnlInicioLayout);
        jpnlInicioLayout.setHorizontalGroup(
            jpnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblNombreUser, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
            .addComponent(jlblImagenUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnlInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTransparente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnlInicioLayout.setVerticalGroup(
            jpnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlInicioLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jlblImagenUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelTransparente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jdpPrincipal.setLayer(jpnlInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addComponent(jpnlInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1152, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private LIB.JPanelTransparente jPanelTransparente1;
    private Conexión_De_botones.Botones_Link jbtnCalculadora;
    public Conexión_De_botones.Botones_Link jbtnChrome;
    private Conexión_De_botones.Botones_Link jbtnDrive;
    private Conexión_De_botones.Botones_Link jbtnExcel;
    private Conexión_De_botones.Botones_Link jbtnExplorador;
    public Conexión_De_botones.Botones_Link jbtnGmail;
    private Conexión_De_botones.Botones_Link jbtnNotepad;
    public Conexión_De_botones.Botones_Link jbtnOutlook;
    private Conexión_De_botones.Botones_Link jbtnWord;
    public javax.swing.JDesktopPane jdpPrincipal;
    public javax.swing.JLabel jlblImagenUser;
    public javax.swing.JLabel jlblNombreUser;
    public javax.swing.JMenuItem jmiInicio;
    public javax.swing.JMenuItem jmiProductosEntrantes;
    public javax.swing.JMenuItem jmiProductosSalientes;
    public javax.swing.JMenuItem jmiSalir;
    public javax.swing.JMenu jmnInicio;
    private javax.swing.JMenu jmnSalir;
    public LIB.FSGradientPanel jpnlInicio;
    // End of variables declaration//GEN-END:variables
}
