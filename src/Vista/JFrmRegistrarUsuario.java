package Vista;

public class JFrmRegistrarUsuario extends javax.swing.JFrame {

    public JFrmRegistrarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fSGradientPanel1 = new LIB.FSGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnRegresoInicio = new javax.swing.JButton();
        jPanelTransparente1 = new LIB.JPanelTransparente();
        jlblImagen1 = new javax.swing.JLabel();
        jtxtContraseña = new javax.swing.JTextField();
        jPanelTransparente2 = new LIB.JPanelTransparente();
        jlblImagen2 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jPanelTransparente3 = new LIB.JPanelTransparente();
        jlblImagen3 = new javax.swing.JLabel();
        jtxtCorreo = new javax.swing.JTextField();
        jPanelTransparente5 = new LIB.JPanelTransparente();
        jlblImagen4 = new javax.swing.JLabel();
        jtxtApellidoMaterno = new javax.swing.JTextField();
        jPanelTransparente7 = new LIB.JPanelTransparente();
        jlblImagen5 = new javax.swing.JLabel();
        jtxtApellidoPaterno = new javax.swing.JTextField();
        jPanelTransparente8 = new LIB.JPanelTransparente();
        jlblImagen6 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jPanelTransparente9 = new LIB.JPanelTransparente();
        jlblImagen7 = new javax.swing.JLabel();
        jcbxGenero = new javax.swing.JComboBox<>();
        jlblNombre = new javax.swing.JLabel();
        jlblContraseña = new javax.swing.JLabel();
        jlblApellidoMaterno = new javax.swing.JLabel();
        jlblApellidoPaterno = new javax.swing.JLabel();
        jlblCorreo = new javax.swing.JLabel();
        jlblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        fSGradientPanel1.setFSEndColor(new java.awt.Color(109, 213, 250));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(41, 130, 185));
        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Regístrate!");
        fSGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 480, 50));

        jbtnRegistrar.setBackground(new java.awt.Color(46, 136, 190));
        jbtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.setBorder(null);
        jbtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistrar.setFocusPainted(false);
        fSGradientPanel1.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 270, 50));

        jbtnRegresoInicio.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jbtnRegresoInicio.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegresoInicio.setText("¿Ya tienes una cuenta?  ¡Inicia Sesión!");
        jbtnRegresoInicio.setBorder(null);
        jbtnRegresoInicio.setBorderPainted(false);
        jbtnRegresoInicio.setContentAreaFilled(false);
        jbtnRegresoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegresoInicio.setFocusPainted(false);
        fSGradientPanel1.add(jbtnRegresoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 300, 30));

        jPanelTransparente1.setColorPrimario(new java.awt.Color(255, 255, 255));
        jPanelTransparente1.setColorSecundario(new java.awt.Color(255, 255, 255));
        jPanelTransparente1.setTran(0.4F);

        jlblImagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contrasenia2.png"))); // NOI18N

        jtxtContraseña.setBorder(null);
        jtxtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtContraseñaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelTransparente1Layout = new javax.swing.GroupLayout(jPanelTransparente1);
        jPanelTransparente1.setLayout(jPanelTransparente1Layout);
        jPanelTransparente1Layout.setHorizontalGroup(
            jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlblImagen1)
                .addGap(18, 18, 18)
                .addComponent(jtxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanelTransparente1Layout.setVerticalGroup(
            jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jtxtContraseña))
                .addContainerGap())
        );

        fSGradientPanel1.add(jPanelTransparente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 330, 50));

        jPanelTransparente2.setColorPrimario(new java.awt.Color(255, 255, 255));
        jPanelTransparente2.setColorSecundario(new java.awt.Color(255, 255, 255));
        jPanelTransparente2.setTran(0.4F);

        jlblImagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario1.png"))); // NOI18N

        jtxtUsuario.setBorder(null);
        jtxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtUsuarioFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelTransparente2Layout = new javax.swing.GroupLayout(jPanelTransparente2);
        jPanelTransparente2.setLayout(jPanelTransparente2Layout);
        jPanelTransparente2Layout.setHorizontalGroup(
            jPanelTransparente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlblImagen2)
                .addGap(18, 18, 18)
                .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanelTransparente2Layout.setVerticalGroup(
            jPanelTransparente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTransparente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblImagen2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jtxtUsuario))
                .addContainerGap())
        );

        fSGradientPanel1.add(jPanelTransparente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 330, 50));

        jPanelTransparente3.setColorPrimario(new java.awt.Color(255, 255, 255));
        jPanelTransparente3.setColorSecundario(new java.awt.Color(255, 255, 255));
        jPanelTransparente3.setTran(0.4F);

        jlblImagen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/email.png"))); // NOI18N

        jtxtCorreo.setBorder(null);
        jtxtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtCorreoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelTransparente3Layout = new javax.swing.GroupLayout(jPanelTransparente3);
        jPanelTransparente3.setLayout(jPanelTransparente3Layout);
        jPanelTransparente3Layout.setHorizontalGroup(
            jPanelTransparente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlblImagen3)
                .addGap(18, 18, 18)
                .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanelTransparente3Layout.setVerticalGroup(
            jPanelTransparente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTransparente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblImagen3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jtxtCorreo))
                .addContainerGap())
        );

        fSGradientPanel1.add(jPanelTransparente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 330, 50));

        jPanelTransparente5.setColorPrimario(new java.awt.Color(255, 255, 255));
        jPanelTransparente5.setColorSecundario(new java.awt.Color(255, 255, 255));
        jPanelTransparente5.setTran(0.4F);

        jlblImagen4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblImagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apellido.png"))); // NOI18N

        jtxtApellidoMaterno.setBorder(null);
        jtxtApellidoMaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtApellidoMaternoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtApellidoMaternoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelTransparente5Layout = new javax.swing.GroupLayout(jPanelTransparente5);
        jPanelTransparente5.setLayout(jPanelTransparente5Layout);
        jPanelTransparente5Layout.setHorizontalGroup(
            jPanelTransparente5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlblImagen4)
                .addGap(18, 18, 18)
                .addComponent(jtxtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanelTransparente5Layout.setVerticalGroup(
            jPanelTransparente5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTransparente5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblImagen4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jtxtApellidoMaterno))
                .addContainerGap())
        );

        fSGradientPanel1.add(jPanelTransparente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 330, 50));

        jPanelTransparente7.setColorPrimario(new java.awt.Color(255, 255, 255));
        jPanelTransparente7.setColorSecundario(new java.awt.Color(255, 255, 255));
        jPanelTransparente7.setTran(0.4F);

        jlblImagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Apellido.png"))); // NOI18N

        jtxtApellidoPaterno.setBorder(null);
        jtxtApellidoPaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtApellidoPaternoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtApellidoPaternoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelTransparente7Layout = new javax.swing.GroupLayout(jPanelTransparente7);
        jPanelTransparente7.setLayout(jPanelTransparente7Layout);
        jPanelTransparente7Layout.setHorizontalGroup(
            jPanelTransparente7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlblImagen5)
                .addGap(18, 18, 18)
                .addComponent(jtxtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanelTransparente7Layout.setVerticalGroup(
            jPanelTransparente7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTransparente7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblImagen5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jtxtApellidoPaterno))
                .addContainerGap())
        );

        fSGradientPanel1.add(jPanelTransparente7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 330, 50));

        jPanelTransparente8.setColorPrimario(new java.awt.Color(255, 255, 255));
        jPanelTransparente8.setColorSecundario(new java.awt.Color(255, 255, 255));
        jPanelTransparente8.setTran(0.4F);

        jlblImagen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nombre.png"))); // NOI18N

        jtxtNombre.setBorder(null);
        jtxtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelTransparente8Layout = new javax.swing.GroupLayout(jPanelTransparente8);
        jPanelTransparente8.setLayout(jPanelTransparente8Layout);
        jPanelTransparente8Layout.setHorizontalGroup(
            jPanelTransparente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlblImagen6)
                .addGap(18, 18, 18)
                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanelTransparente8Layout.setVerticalGroup(
            jPanelTransparente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTransparente8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblImagen6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jtxtNombre))
                .addContainerGap())
        );

        fSGradientPanel1.add(jPanelTransparente8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 330, 50));

        jPanelTransparente9.setColorPrimario(new java.awt.Color(255, 255, 255));
        jPanelTransparente9.setColorSecundario(new java.awt.Color(255, 255, 255));
        jPanelTransparente9.setTran(0.4F);

        jlblImagen7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblImagen7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/genero.png"))); // NOI18N

        jcbxGenero.setBackground(new java.awt.Color(122, 181, 207));
        jcbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--" }));
        jcbxGenero.setBorder(null);
        jcbxGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbxGenero.setFocusable(false);

        javax.swing.GroupLayout jPanelTransparente9Layout = new javax.swing.GroupLayout(jPanelTransparente9);
        jPanelTransparente9.setLayout(jPanelTransparente9Layout);
        jPanelTransparente9Layout.setHorizontalGroup(
            jPanelTransparente9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlblImagen7)
                .addGap(18, 18, 18)
                .addComponent(jcbxGenero, 0, 273, Short.MAX_VALUE))
        );
        jPanelTransparente9Layout.setVerticalGroup(
            jPanelTransparente9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTransparente9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblImagen7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jcbxGenero, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        fSGradientPanel1.add(jPanelTransparente9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 330, 50));

        jlblNombre.setForeground(new java.awt.Color(51, 51, 51));
        jlblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNombre.setText("Nombre");
        fSGradientPanel1.add(jlblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 230, 30));

        jlblContraseña.setForeground(new java.awt.Color(51, 51, 51));
        jlblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblContraseña.setText("Contraseña");
        fSGradientPanel1.add(jlblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 230, 30));

        jlblApellidoMaterno.setForeground(new java.awt.Color(51, 51, 51));
        jlblApellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblApellidoMaterno.setText("Apellido Materno");
        fSGradientPanel1.add(jlblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 230, 30));

        jlblApellidoPaterno.setForeground(new java.awt.Color(18, 31, 44));
        jlblApellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblApellidoPaterno.setText("Apellido Paterno");
        fSGradientPanel1.add(jlblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 230, 30));

        jlblCorreo.setForeground(new java.awt.Color(51, 51, 51));
        jlblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCorreo.setText("Correo");
        fSGradientPanel1.add(jlblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 230, 30));

        jlblUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jlblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUsuario.setText("Usuario");
        fSGradientPanel1.add(jlblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fSGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusGained
        jlblNombre.setText("");
    }//GEN-LAST:event_jtxtNombreFocusGained

    private void jtxtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusLost
        if(jtxtNombre.getText().equalsIgnoreCase("")){
            jlblNombre.setText("Nombre");
        } else {
            jlblNombre.setText("");
        }
    }//GEN-LAST:event_jtxtNombreFocusLost

    private void jtxtApellidoPaternoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtApellidoPaternoFocusGained
        jlblApellidoPaterno.setText("");
    }//GEN-LAST:event_jtxtApellidoPaternoFocusGained

    private void jtxtApellidoPaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtApellidoPaternoFocusLost
        if(jtxtApellidoPaterno.getText().equalsIgnoreCase("")){
            jlblApellidoPaterno.setText("Apellido Paterno");
        } else {
            jlblApellidoPaterno.setText("");
        }
    }//GEN-LAST:event_jtxtApellidoPaternoFocusLost

    private void jtxtApellidoMaternoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtApellidoMaternoFocusGained
        jlblApellidoMaterno.setText("");
    }//GEN-LAST:event_jtxtApellidoMaternoFocusGained

    private void jtxtApellidoMaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtApellidoMaternoFocusLost
        if(jtxtApellidoMaterno.getText().equalsIgnoreCase("")){
            jlblApellidoMaterno.setText("Apellido Materno");
        } else {
            jlblApellidoMaterno.setText("");
        }
    }//GEN-LAST:event_jtxtApellidoMaternoFocusLost

    private void jtxtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCorreoFocusGained
        jlblCorreo.setText("");
    }//GEN-LAST:event_jtxtCorreoFocusGained

    private void jtxtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCorreoFocusLost
        if(jtxtCorreo.getText().equalsIgnoreCase("")){
            jlblCorreo.setText("Correo");
        } else {
            jlblCorreo.setText("");
        }
    }//GEN-LAST:event_jtxtCorreoFocusLost

    private void jtxtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtUsuarioFocusGained
        jlblUsuario.setText("");
    }//GEN-LAST:event_jtxtUsuarioFocusGained

    private void jtxtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtUsuarioFocusLost
        if(jtxtUsuario.getText().equalsIgnoreCase("")){
            jlblUsuario.setText("Usuario");
        } else {
            jlblUsuario.setText("");
        }
    }//GEN-LAST:event_jtxtUsuarioFocusLost

    private void jtxtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContraseñaFocusGained
        jlblContraseña.setText("");
    }//GEN-LAST:event_jtxtContraseñaFocusGained

    private void jtxtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContraseñaFocusLost
        if(jtxtContraseña.getText().equalsIgnoreCase("")){
            jlblContraseña.setText("Contraseña");
        } else {
            jlblContraseña.setText("");
        }
    }//GEN-LAST:event_jtxtContraseñaFocusLost

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmRegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    private LIB.JPanelTransparente jPanelTransparente1;
    private LIB.JPanelTransparente jPanelTransparente2;
    private LIB.JPanelTransparente jPanelTransparente3;
    private LIB.JPanelTransparente jPanelTransparente5;
    private LIB.JPanelTransparente jPanelTransparente7;
    private LIB.JPanelTransparente jPanelTransparente8;
    private LIB.JPanelTransparente jPanelTransparente9;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JButton jbtnRegresoInicio;
    public javax.swing.JComboBox<String> jcbxGenero;
    public javax.swing.JLabel jlblApellidoMaterno;
    public javax.swing.JLabel jlblApellidoPaterno;
    public javax.swing.JLabel jlblContraseña;
    public javax.swing.JLabel jlblCorreo;
    private javax.swing.JLabel jlblImagen1;
    private javax.swing.JLabel jlblImagen2;
    private javax.swing.JLabel jlblImagen3;
    private javax.swing.JLabel jlblImagen4;
    private javax.swing.JLabel jlblImagen5;
    private javax.swing.JLabel jlblImagen6;
    private javax.swing.JLabel jlblImagen7;
    public javax.swing.JLabel jlblNombre;
    public javax.swing.JLabel jlblUsuario;
    public javax.swing.JTextField jtxtApellidoMaterno;
    public javax.swing.JTextField jtxtApellidoPaterno;
    public javax.swing.JTextField jtxtContraseña;
    public javax.swing.JTextField jtxtCorreo;
    public javax.swing.JTextField jtxtNombre;
    public javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
