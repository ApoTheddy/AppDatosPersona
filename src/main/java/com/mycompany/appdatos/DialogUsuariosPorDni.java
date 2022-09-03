package com.mycompany.appdatos;

public class DialogUsuariosPorDni extends javax.swing.JDialog {

    private UserDniModel userModel;
    private String dni;

    public DialogUsuariosPorDni(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public DialogUsuariosPorDni(UserDniModel userModel, String dni) {
        super(new java.awt.Frame(), true);
        this.dni = dni;
        this.userModel = userModel;
        initComponents();
        establecerValores();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public void establecerValores() {
        jlblDni.setText(dni);
        jlblPrimerApellido.setText(userModel.getResult().get("paterno"));
        jlblSegundoApellido.setText(userModel.getResult().get("materno"));
        jlblPreNombres.setText(userModel.getResult().get("nombres"));
        jlblCui.setText(userModel.getResult().get("codigoVerificacion"));
        jlblSexo.setText(userModel.getResult().get("sexo"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblPrimerApellido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblSegundoApellido = new javax.swing.JLabel();
        jlblDni = new javax.swing.JLabel();
        jlblCui = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlblPreNombres = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlblSexo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Primer Apellido");

        jLabel2.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("N. DNI");

        jLabel3.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CUI");

        jlblPrimerApellido.setBackground(new java.awt.Color(0, 0, 0));
        jlblPrimerApellido.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jlblPrimerApellido.setForeground(new java.awt.Color(102, 102, 102));
        jlblPrimerApellido.setText("default first lastname");

        jLabel5.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Pre Nombres");

        jlblSegundoApellido.setBackground(new java.awt.Color(0, 0, 0));
        jlblSegundoApellido.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jlblSegundoApellido.setForeground(new java.awt.Color(102, 102, 102));
        jlblSegundoApellido.setText("default second lastname");

        jlblDni.setBackground(new java.awt.Color(0, 0, 0));
        jlblDni.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jlblDni.setForeground(new java.awt.Color(102, 102, 102));
        jlblDni.setText("default name");

        jlblCui.setBackground(new java.awt.Color(0, 0, 0));
        jlblCui.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jlblCui.setForeground(new java.awt.Color(102, 102, 102));
        jlblCui.setText("0");

        jLabel9.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Segundo Apellido");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("default name");

        jlblPreNombres.setBackground(new java.awt.Color(0, 0, 0));
        jlblPreNombres.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jlblPreNombres.setForeground(new java.awt.Color(102, 102, 102));
        jlblPreNombres.setText("default name");

        jLabel12.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Sexo");

        jlblSexo.setBackground(new java.awt.Color(0, 0, 0));
        jlblSexo.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jlblSexo.setForeground(new java.awt.Color(102, 102, 102));
        jlblSexo.setText("M");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblCui)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jlblPreNombres)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jlblSegundoApellido)
                            .addComponent(jlblPrimerApellido)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jlblSexo)))
                        .addGap(0, 197, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel10)
                    .addContainerGap(275, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblDni)
                    .addComponent(jlblCui))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jlblPrimerApellido)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblSegundoApellido)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblPreNombres)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblSexo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(232, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(99, 99, 99)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogUsuariosPorDni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            DialogUsuariosPorDni dialog = new DialogUsuariosPorDni(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlblCui;
    private javax.swing.JLabel jlblDni;
    private javax.swing.JLabel jlblPreNombres;
    private javax.swing.JLabel jlblPrimerApellido;
    private javax.swing.JLabel jlblSegundoApellido;
    private javax.swing.JLabel jlblSexo;
    // End of variables declaration//GEN-END:variables
}
