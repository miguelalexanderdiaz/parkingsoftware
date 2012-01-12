package view;

import controller.MainController;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author r4wd3r
 */
public class AddVehiclePanel extends javax.swing.JPanel {

    /** Creates new form AddVehiclePanel */
    public AddVehiclePanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddVehicleButton = new javax.swing.JButton();
        VehicleTypeCombobox = new javax.swing.JComboBox();
        VehicleTypeLabel = new javax.swing.JLabel();
        ComentaryLabel = new javax.swing.JLabel();
        ComentaryScroll = new javax.swing.JScrollPane();
        ComentaryArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        AddVehicleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        AddVehicleButton.setText("Ingresar");
        AddVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVehicleButtonActionPerformed(evt);
            }
        });

        VehicleTypeCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        VehicleTypeLabel.setText("Tipo de Vehículo:");

        ComentaryLabel.setText("Comentarios:");

        ComentaryArea.setColumns(20);
        ComentaryArea.setRows(5);
        ComentaryScroll.setViewportView(ComentaryArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VehicleTypeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(VehicleTypeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ComentaryLabel)
                    .addComponent(ComentaryScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(AddVehicleButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VehicleTypeLabel)
                    .addComponent(VehicleTypeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ComentaryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComentaryScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddVehicleButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {                                    
    DefaultComboBoxModel model = MainController.addVehicleController.getModelComboBox(
            MainController.mainView.getPlate());
    if (model.getSize() == 0) {
       JOptionPane.showMessageDialog(null, "Tipo de placa no existente, "
               + "por favor, inserte un tipo de placa valido", "error", WIDTH);
    } else {
        VehicleTypeCombobox.setModel(model);
        VehicleTypeCombobox.updateUI();
    }

    }
    
    public void setVehicleTypeCombobox(DefaultComboBoxModel model){
        this.VehicleTypeCombobox.setModel(model);
    }

    public void setComentaryArea(String text) {
        this.ComentaryArea.setText(text);
    }
    
    private void AddVehicleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVehicleButtonActionPerformed
        String id = (String) VehicleTypeCombobox.getSelectedItem();
        MainController.addVehicleController.CreateVehicle(id, ComentaryArea.getText());
        MainController.mainView.setPlateTextField("");  
    }//GEN-LAST:event_AddVehicleButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVehicleButton;
    private javax.swing.JTextArea ComentaryArea;
    private javax.swing.JLabel ComentaryLabel;
    private javax.swing.JScrollPane ComentaryScroll;
    private javax.swing.JComboBox VehicleTypeCombobox;
    private javax.swing.JLabel VehicleTypeLabel;
    // End of variables declaration//GEN-END:variables
}
