/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaCliente;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Cesar
 */
public class DatosAdicionales extends javax.swing.JFrame {

    /**
     * Creates new form DatosAdcionales
     */
    public DatosAdicionales() {
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

        jPanel1 = new javax.swing.JPanel();
        lblCumpleaños = new javax.swing.JLabel();
        lblDatosAdicionales = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnTerminar = new javax.swing.JButton();
        txtCumpleaños = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        lblCumpleaños.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        lblCumpleaños.setForeground(new java.awt.Color(255, 255, 153));
        lblCumpleaños.setText("Cumpleaños:");

        lblDatosAdicionales.setBackground(new java.awt.Color(255, 255, 153));
        lblDatosAdicionales.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblDatosAdicionales.setForeground(new java.awt.Color(255, 255, 153));
        lblDatosAdicionales.setText("Datos Adicionales");

        lblDireccion.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 153));
        lblDireccion.setText("Dirrección:");

        txtDireccion.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        btnTerminar.setBackground(new java.awt.Color(255, 255, 153));
        btnTerminar.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        btnTerminar.setText("Terminar");

        txtCumpleaños.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTerminar)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblDatosAdicionales)
                            .addGap(33, 33, 33))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCumpleaños)
                                .addComponent(lblDireccion))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCumpleaños, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblDatosAdicionales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCumpleaños)
                    .addComponent(txtCumpleaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addGap(10, 10, 10)
                .addComponent(btnTerminar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DatosAdicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosAdicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosAdicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosAdicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosAdicionales().setVisible(true);
            }
        });
    }

    public JButton getBtnTerminar() {
        return btnTerminar;
    }

    public void setBtnTerminar(JButton btnTerminar) {
        this.btnTerminar = btnTerminar;
    }

    public JTextField getTxtCumpleaños() {
        return txtCumpleaños;
    }

    public void setTxtCumpleaños(JTextField txtCumpleaños) {
        this.txtCumpleaños = txtCumpleaños;
    }
    
    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTerminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCumpleaños;
    private javax.swing.JLabel lblDatosAdicionales;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JTextField txtCumpleaños;
    private javax.swing.JTextField txtDireccion;
    // End of variables declaration//GEN-END:variables
}