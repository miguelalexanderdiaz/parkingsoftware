/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * QuitVehicleView.java
 *
 * Created on 01-oct-2011, 18:18:14
 */
package view;

import Entity.VehicleType;
import controller.FormatDate;
import controller.QuitVehicleController;
import java.util.Date;

/**
 *
 * @author r4wd3r
 */
public class QuitVehiclePanel extends javax.swing.JPanel {

    /** Creates new form QuitVehicleView */
    public QuitVehiclePanel() {
        initComponents();
    }

    public void setPanelParameters(String plate, String rate, String entry, String exit) {
        PlateTextField.setText(plate);
        RateTextField.setText(rate);
        EntryHourFormatted.setText(entry);
        ExitHourFormatted.setText(exit);
    }
    
    public void setCostTextField(Date entry, Date exit, VehicleType vehicleType){
        double cost = QuitVehicleController.calculateCost(entry, exit, vehicleType);
        CostTextField.setText(Double.toString(cost));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FactureButton = new javax.swing.JButton();
        RateTextField = new javax.swing.JTextField();
        CostTextField = new javax.swing.JTextField();
        PlateTextField = new javax.swing.JTextField();
        CostLabel = new javax.swing.JLabel();
        PlateLabel = new javax.swing.JLabel();
        RateLabel = new javax.swing.JLabel();
        EntryHourLabel = new javax.swing.JLabel();
        ExitHourLabel = new javax.swing.JLabel();
        try{
            EntryHourFormatted = new javax.swing.JFormattedTextField(new FormatDate());
        }catch(Exception e){
            e.getMessage();}
        try{
            ExitHourFormatted = new javax.swing.JFormattedTextField(new FormatDate());
        }catch(Exception e) {
            e.getMessage();}

        setBackground(new java.awt.Color(255, 255, 255));

        FactureButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        FactureButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clock.png"))); // NOI18N
        FactureButton.setText("Facturar");
        FactureButton.setToolTipText("Pulse aquí después de efectuar el cobro.");
        FactureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FactureButtonActionPerformed(evt);
            }
        });

        RateTextField.setEditable(false);
        RateTextField.setToolTipText("Tarifa a cobrar por el vehículo a retirar.");

        CostTextField.setEditable(false);
        CostTextField.setFont(new java.awt.Font("Tahoma", 0, 36));
        CostTextField.setToolTipText("Valor total a pagar por el servicio.");

        PlateTextField.setEditable(false);
        PlateTextField.setToolTipText("Placa de vehículo a retirar.");

        CostLabel.setFont(new java.awt.Font("Tahoma", 0, 36));
        CostLabel.setText("Costo:");

        PlateLabel.setText("Placa:");

        RateLabel.setText("Tarifa:");

        EntryHourLabel.setText("Hora Entrada:");

        ExitHourLabel.setText("Hora Salida:");

        EntryHourFormatted.setEditable(false);
        EntryHourFormatted.setToolTipText("Hora de entrada del vehículo a retirar.");

        ExitHourFormatted.setEditable(false);
        ExitHourFormatted.setToolTipText("Hora de finalizado el servicio.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlateLabel)
                    .addComponent(RateLabel)
                    .addComponent(EntryHourLabel)
                    .addComponent(ExitHourLabel))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExitHourFormatted, 0, 0, Short.MAX_VALUE)
                    .addComponent(RateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(PlateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(EntryHourFormatted))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CostLabel)
                    .addComponent(CostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(FactureButton)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(CostLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RateLabel)
                            .addComponent(RateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EntryHourLabel)
                            .addComponent(EntryHourFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExitHourFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExitHourLabel))))
                .addGap(32, 32, 32)
                .addComponent(FactureButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FactureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FactureButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FactureButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CostLabel;
    private javax.swing.JTextField CostTextField;
    private javax.swing.JFormattedTextField EntryHourFormatted;
    private javax.swing.JLabel EntryHourLabel;
    private javax.swing.JFormattedTextField ExitHourFormatted;
    private javax.swing.JLabel ExitHourLabel;
    private javax.swing.JButton FactureButton;
    private javax.swing.JLabel PlateLabel;
    private javax.swing.JTextField PlateTextField;
    private javax.swing.JLabel RateLabel;
    private javax.swing.JTextField RateTextField;
    // End of variables declaration//GEN-END:variables

    
}
