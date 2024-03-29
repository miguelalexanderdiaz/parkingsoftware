package view;

import controller.LoginController;
import controller.MainController;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

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
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
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
        logoLabel = new javax.swing.JLabel();
        PasswordPanel = new javax.swing.JPanel();
        PasswordLabel = new javax.swing.JLabel();
        AdminPassTextField = new javax.swing.JPasswordField();
        AccessButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        InfoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración ParkQuick");
        setBackground(new java.awt.Color(255, 255, 255));

        LogoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo_small.png"))); // NOI18N
        logoLabel.setText("jLabel1");
        LogoPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 290, 80));

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        PasswordLabel.setText("Contraseña:");

        AdminPassTextField.setToolTipText("Ingrese su contraseña (Sólo Administradores)");
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
                .addContainerGap(19, Short.MAX_VALUE)
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
            .addComponent(LogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
            .addComponent(PasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LogoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        MainController.setVisibleAdminAccessView(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void AccessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccessButtonActionPerformed
        LoginController.startAdministrationLogin();
    }//GEN-LAST:event_AccessButtonActionPerformed

    private void AdminPassTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdminPassTextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            AccessButtonActionPerformed(null);
        }
    }//GEN-LAST:event_AdminPassTextFieldKeyPressed

    public String getAdminPassword(){
        return String.valueOf(AdminPassTextField.getPassword());
    }
    
    public javax.swing.JTextField getAdminPassTextField(){
        return AdminPassTextField;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccessButton;
    private javax.swing.JPasswordField AdminPassTextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel InfoLabel;
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel PasswordPanel;
    private javax.swing.JLabel logoLabel;
    // End of variables declaration//GEN-END:variables
}
