package com.mycompany.appdatos;

import javax.swing.JOptionPane;
import java.util.List;

public class frmVentanaPrincipal extends javax.swing.JDialog {

    private final Api api = new Api();
    private DialogUsuariosPorDni userDialog;
    private DialogUsuariosPorNombre userDialogNombres;

    public frmVentanaPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jtxtDni = new javax.swing.JTextField();
        jbtnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jtxtApellidoMaterno = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtApellidoPaterno = new javax.swing.JTextField();
        jbtnBuscarPorNombres = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jtxtDni.setBackground(new java.awt.Color(255, 255, 255));
        jtxtDni.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jtxtDni.setForeground(new java.awt.Color(0, 0, 0));
        jtxtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtDniKeyPressed(evt);
            }
        });

        jbtnBuscar.setBackground(new java.awt.Color(153, 204, 255));
        jbtnBuscar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jbtnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jtxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jbtnBuscar)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jtxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbtnBuscar)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar Por DNI", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jtxtApellidoMaterno.setBackground(new java.awt.Color(255, 255, 255));
        jtxtApellidoMaterno.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jtxtApellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        jtxtApellidoMaterno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido Materno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jtxtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNombre.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyPressed(evt);
            }
        });

        jtxtApellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));
        jtxtApellidoPaterno.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jtxtApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        jtxtApellidoPaterno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido Paterno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jbtnBuscarPorNombres.setBackground(new java.awt.Color(153, 204, 255));
        jbtnBuscarPorNombres.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jbtnBuscarPorNombres.setForeground(new java.awt.Color(0, 0, 0));
        jbtnBuscarPorNombres.setText("BUSCAR");
        jbtnBuscarPorNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarPorNombresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jtxtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnBuscarPorNombres)
                .addGap(159, 159, 159))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jtxtApellidoMaterno))
                .addGap(18, 18, 18)
                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jbtnBuscarPorNombres)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("BUSCAR POR NOMBRES Y APELLIDOS", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDniKeyPressed
        if (evt.getKeyCode() == 10) {
            jbtnBuscarActionPerformed(null);
        }

    }//GEN-LAST:event_jtxtDniKeyPressed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        String condicion = isAllCorrect();
        if (condicion.equals("")) {
            try {
                Integer.parseInt(jtxtDni.getText());
                UserDniModel userModel = api.getDataUserByDni(jtxtDni.getText().trim());
                userDialog = new DialogUsuariosPorDni(userModel, jtxtDni.getText());
                userDialog.setVisible(true);

            } catch (NumberFormatException numEx) {
                JOptionPane.showMessageDialog(null, "Debe ingresar numeros y no letras en el campo de texto", "Valores Incorrectos", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, condicion, "Incorrecto", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnBuscarPorNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarPorNombresActionPerformed
        String apellidoPaterno = jtxtApellidoPaterno.getText().trim();
        String apellidoMaterno = jtxtApellidoMaterno.getText().trim();
        String nombres = jtxtNombre.getText().trim();

        if (apellidoMaterno.equals("")) {
            JOptionPane.showMessageDialog(null, "El campo 'apellido materno' se encuentra vacio");
        } else if (apellidoPaterno.equals("")) {
            JOptionPane.showMessageDialog(null, "El campo 'apellido paterno' se encuentra vacio");
        } else if (nombres.equals("")) {
            JOptionPane.showMessageDialog(null, "El campo 'nombre' se encuentra vacio");
        } else {
            UserNombresModel personas = api.getDataUserByNombres(apellidoPaterno, apellidoMaterno, nombres);
            userDialogNombres = new DialogUsuariosPorNombre(personas);
            userDialogNombres.setVisible(true);
        }
    }//GEN-LAST:event_jbtnBuscarPorNombresActionPerformed

    private void jtxtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyPressed
        if (evt.getKeyCode() == 10)
            jbtnBuscarPorNombresActionPerformed(null);
    }//GEN-LAST:event_jtxtNombreKeyPressed

    public String isAllCorrect() {
        String message = "";
        String dni = jtxtDni.getText().trim();

        if (dni.length() > 8 || dni.length() < 8) {
            message = "El Dni debe contener el tamnio de 8 caracteres";
        }
        return message;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            frmVentanaPrincipal dialog = new frmVentanaPrincipal(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnBuscarPorNombres;
    private javax.swing.JTextField jtxtApellidoMaterno;
    private javax.swing.JTextField jtxtApellidoPaterno;
    private javax.swing.JTextField jtxtDni;
    private javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables
}
