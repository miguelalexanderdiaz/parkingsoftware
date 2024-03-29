/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FinishTurnView.java
 *
 * Created on 04-ene-2012, 12:14:36
 */
package view;

import controller.CloseTurnController;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author r4wd3r
 */
public class FinishTurnView extends javax.swing.JFrame {

    /** Creates new form FinishTurnView */
    public FinishTurnView() {
        initComponents();
        ImageIcon img = new ImageIcon("src/images/parking1.gif");        
        setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CloseTurnPartialButton = new javax.swing.JButton();
        CloseTotalButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ParkQuick ~ Cerrar Caja");

        CloseTurnPartialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Stats.png"))); // NOI18N
        CloseTurnPartialButton.setText("Cerrar Turno");
        CloseTurnPartialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseTurnPartialButtonActionPerformed(evt);
            }
        });

        CloseTotalButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Database.png"))); // NOI18N
        CloseTotalButton.setText("Cerrar Total");
        CloseTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseTotalButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("¿Cerrar Caja?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseTurnPartialButton)
                .addGap(87, 87, 87)
                .addComponent(CloseTotalButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CloseTurnPartialButton)
                    .addComponent(CloseTotalButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseTurnPartialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseTurnPartialButtonActionPerformed
        CloseTurnController.closePartialTurn();
    }//GEN-LAST:event_CloseTurnPartialButtonActionPerformed

    private void CloseTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseTotalButtonActionPerformed
        CloseTurnController.closeTotalTurn();
    }//GEN-LAST:event_CloseTotalButtonActionPerformed
    
    public void informAboutClosing(String message){
        JOptionPane.showMessageDialog(null, message);    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseTotalButton;
    private javax.swing.JButton CloseTurnPartialButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
