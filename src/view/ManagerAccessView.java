package view;

import controller.MainController;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author r4wd3r
 */
public class ManagerAccessView extends javax.swing.JFrame {

    /** Creates new form ManagerAccessView */
    public ManagerAccessView() {
        ImageIcon img=new ImageIcon("src/images/parking1.gif"); 
         setIconImage(img.getImage()); 
        initComponents();
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

        LogoPanel = new javax.swing.JPanel();
        PasswordPanel = new javax.swing.JPanel();
        PasswordLabel = new javax.swing.JLabel();
        AdminPassTextField = new javax.swing.JPasswordField();
        AccessButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        InfoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        LogoPanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout LogoPanelLayout = new javax.swing.GroupLayout(LogoPanel);
        LogoPanel.setLayout(LogoPanelLayout);
        LogoPanelLayout.setHorizontalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );
        LogoPanelLayout.setVerticalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        PasswordPanel.setBackground(new java.awt.Color(255, 255, 255));

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        PasswordLabel.setText("Contraseña:");

        AdminPassTextField.setToolTipText("Ingrese su contraseña (Sólo Administradores)");
        AdminPassTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPassTextFieldActionPerformed(evt);
            }
        });
        AdminPassTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AdminPassTextFieldKeyPressed(evt);
            }
        });

        AccessButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        AccessButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Key.png"))); // NOI18N
        AccessButton.setText("Ingresar");
        AccessButton.setToolTipText("Ingresar a la sección de Administradores.");
        AccessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccessButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        CancelButton.setText("  Cancelar");
        CancelButton.setToolTipText("Retorna a la vista anterior.");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        InfoLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
        InfoLabel.setText("Ésta operación requiere permisos administrativos.");

        javax.swing.GroupLayout PasswordPanelLayout = new javax.swing.GroupLayout(PasswordPanel);
        PasswordPanel.setLayout(PasswordPanelLayout);
        PasswordPanelLayout.setHorizontalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordPanelLayout.createSequentialGroup()
                .addGroup(PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PasswordPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AccessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(CancelButton))
                    .addGroup(PasswordPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(PasswordLabel)
                        .addGap(18, 18, 18)
                        .addComponent(AdminPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PasswordPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(InfoLabel)))
                .addContainerGap())
        );
        PasswordPanelLayout.setVerticalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(InfoLabel)
                .addGap(18, 18, 18)
                .addGroup(PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel))
                .addGap(18, 18, 18)
                .addGroup(PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccessButton)
                    .addComponent(CancelButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminPassTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPassTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminPassTextFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        MainController.setVisibleAdminAccessView(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void AccessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccessButtonActionPerformed
        if(MainController.verifyAdminAccess(this.getAdminPassword())){
            JOptionPane.showMessageDialog(this, "Acceso Concedido", "Administración", 1);
            MainController.setVisibleAdminAccessView(false);
            MainController.setVisibleAdminView(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Acceso Denegado", "Administración", 0);
        }
        AdminPassTextField.setText("");
        AdminPassTextField.requestFocus();        
    }//GEN-LAST:event_AccessButtonActionPerformed

    private void AdminPassTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdminPassTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            AccessButtonActionPerformed(null);
        }
    }//GEN-LAST:event_AdminPassTextFieldKeyPressed

    public String getAdminPassword(){
        return String.valueOf(AdminPassTextField.getPassword());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccessButton;
    private javax.swing.JPasswordField AdminPassTextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel InfoLabel;
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel PasswordPanel;
    // End of variables declaration//GEN-END:variables
}
