/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import javax.swing.JOptionPane;
/**
 *
 * @author srikr
 */
public class AdminjFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminjFrame
     */
    String adminbox="SYSTEM";
    public AdminjFrame() {
        initComponents();
        setExtendedState(MainFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordtxt = new javax.swing.JTextField();
        jLoginbtn = new javax.swing.JButton();
        jClearbtn = new javax.swing.JButton();
        jUsernamelbl = new javax.swing.JLabel();
        jUsernametxt = new javax.swing.JTextField();
        jPasswordlbl = new javax.swing.JLabel();
        jSelectadminlbl = new javax.swing.JLabel();
        jAdminbox = new javax.swing.JComboBox<>();
        jAdminHeading = new javax.swing.JLabel();
        jBackbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLoginbtn.setText("LOGIN");
        jLoginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginbtnActionPerformed(evt);
            }
        });

        jClearbtn.setText("CLEAR");
        jClearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearbtnActionPerformed(evt);
            }
        });

        jUsernamelbl.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jUsernamelbl.setText("USERNAME");

        jPasswordlbl.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jPasswordlbl.setText("PASSWORD");

        jSelectadminlbl.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jSelectadminlbl.setText("SELECT ADMIN");

        jAdminbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SYSTEM", "COMMUNITY", "HOSPITAL" }));
        jAdminbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdminboxActionPerformed(evt);
            }
        });

        jAdminHeading.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jAdminHeading.setText("ADMIN LOGIN");

        jBackbtn.setText("BACK");
        jBackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("system sys");

        jLabel2.setText("community com");

        jLabel3.setText("hospital hos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jPasswordlbl)
                        .addComponent(jPasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSelectadminlbl)
                        .addComponent(jAdminbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jAdminHeading, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jUsernametxt, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsernamelbl, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jClearbtn, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBackbtn, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLoginbtn, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1074, 1074, 1074)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBackbtn, jClearbtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jAdminHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jUsernamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUsernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSelectadminlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAdminbox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLoginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jClearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBackbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBackbtn, jClearbtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginbtnActionPerformed
        // TODO add your handling code here:
        String username = jUsernametxt.getText();
        String password = jPasswordtxt.getText();

        if (password.contains("sys") && (username.contains("system")) && (adminbox.equals("SYSTEM")))
        {
            SystemAdminjFrame sa = new SystemAdminjFrame();
            //splitPane.setRightComponent(sa);
            sa.setVisible(true);
            dispose();

        }
        else if (password.contains("com") && (username.contains("community")) && (adminbox.equals("COMMUNITY")))
        {
            CommunityAdminjFrame ca = new CommunityAdminjFrame();
            //splitPane.setRightComponent(sa);
            ca.setVisible(true);
            dispose();
        }
        else if (password.contains("hos") && (username.contains("hospital")) && (adminbox.equals("HOSPITAL")))
        {
            HospitalAdminjFrame ha = new HospitalAdminjFrame();
            //splitPane.setRightComponent(sa);
            ha.setVisible(true);
            dispose();
        }
        /*else if (password.contains("doc") && (username.contains("doctor")))
        {
            DoctorJPanel df = new DoctorjPanel();
            //splitPane.setRightComponent(df);
            df.setVisible(true);
            dispose();
        }
        */
        else
        {
            JOptionPane.showMessageDialog(this ,"Please enter correct Username and Password");
        }
    }//GEN-LAST:event_jLoginbtnActionPerformed

    private void jAdminboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdminboxActionPerformed
        // TODO add your handling code here:
        adminbox = jAdminbox.getSelectedItem().toString();
        
    }//GEN-LAST:event_jAdminboxActionPerformed

    private void jBackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackbtnActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBackbtnActionPerformed

    private void jClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearbtnActionPerformed
        // TODO add your handling code here:
            jUsernametxt.setText(null);
            jPasswordtxt.setText(null);
    }//GEN-LAST:event_jClearbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminjFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAdminHeading;
    private javax.swing.JComboBox<String> jAdminbox;
    private javax.swing.JButton jBackbtn;
    private javax.swing.JButton jClearbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jLoginbtn;
    private javax.swing.JLabel jPasswordlbl;
    private javax.swing.JTextField jPasswordtxt;
    private javax.swing.JLabel jSelectadminlbl;
    private javax.swing.JLabel jUsernamelbl;
    private javax.swing.JTextField jUsernametxt;
    // End of variables declaration//GEN-END:variables
}
