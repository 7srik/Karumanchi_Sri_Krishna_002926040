/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

/**
 *
 * @author srikr
 */
public class HospitalAdminDoctorjPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminDoctorjPanel
     */
    public HospitalAdminDoctorjPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDoctordetailsheadinglbl = new javax.swing.JLabel();
        jDScrollPane = new javax.swing.JScrollPane();
        jDoctortbl = new javax.swing.JTable();

        jDoctordetailsheadinglbl.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jDoctordetailsheadinglbl.setText("DOCTOR DETAILS :");

        jDoctortbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jDScrollPane.setViewportView(jDoctortbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDScrollPane)
                    .addComponent(jDoctordetailsheadinglbl))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jDoctordetailsheadinglbl)
                .addGap(12, 12, 12)
                .addComponent(jDScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jDScrollPane;
    private javax.swing.JLabel jDoctordetailsheadinglbl;
    private javax.swing.JTable jDoctortbl;
    // End of variables declaration//GEN-END:variables
}
