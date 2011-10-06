/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoginView.java
 *
 * Created on 3/09/2011, 05:32:25 PM
 */
package view;

import DAO.exceptions.PreexistingEntityException;
import controller.LoginController;
import controller.MainController;
import edu.stanford.ejalbert.BrowserLauncher;
import edu.stanford.ejalbert.exception.BrowserLaunchingInitializingException;
import edu.stanford.ejalbert.exception.UnsupportedOperatingSystemException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.omg.DynamicAny.DynAnyOperations;
import DAO.VehicleTypeJpaController;

/**
 *
 * @author Martin Kanayet
 */
import Entity.VehicleType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        this.setVisible(true);
        this.centerForm();
        initComponents();
        this.setResizable(false);
        UserTextField.requestFocus();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IntroPanel = new javax.swing.JPanel();
        HelpPanel = new javax.swing.JPanel();
        NeedHelpLabel = new javax.swing.JLabel();
        ManualButton = new javax.swing.JButton();
        LoginPanel = new javax.swing.JPanel();
        UserTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        PasswordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChiquiParking Iniciar Sesión");
        setBackground(new java.awt.Color(0, 0, 0));

        IntroPanel.setBackground(new java.awt.Color(0, 0, 0));

        HelpPanel.setBackground(new java.awt.Color(255, 255, 255));
        HelpPanel.setForeground(new java.awt.Color(153, 153, 255));

        NeedHelpLabel.setFont(new java.awt.Font("Tahoma", 0, 20));
        NeedHelpLabel.setText("¿Necesita ayuda con el Sistema? ");

        ManualButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        ManualButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Info.png"))); // NOI18N
        ManualButton.setText("Manual de Usuario");
        ManualButton.setToolTipText("Pulse aquí para obtener ayuda.");
        ManualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualButtonActionPerformed(evt);
            }
        });

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));

        UserTextField.setToolTipText("Ingrese su nombre.");

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        NameLabel.setText("Nombre de Usuario:");

        PasswordField.setToolTipText("Ingrese su contraseña.");
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        PasswordLabel.setText("Contraseña:");

        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lock.png"))); // NOI18N
        LoginButton.setText("Iniciar Sesión");
        LoginButton.setToolTipText("Pulse aquí para comprobar sus datos.");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordLabel)
                    .addComponent(NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(LoginButton)
                .addGap(83, 83, 83))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HelpPanelLayout = new javax.swing.GroupLayout(HelpPanel);
        HelpPanel.setLayout(HelpPanelLayout);
        HelpPanelLayout.setHorizontalGroup(
            HelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpPanelLayout.createSequentialGroup()
                .addGroup(HelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HelpPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(ManualButton))
                    .addGroup(HelpPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NeedHelpLabel)))
                .addGap(10, 10, 10)
                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HelpPanelLayout.setVerticalGroup(
            HelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(NeedHelpLabel)
                .addGap(28, 28, 28)
                .addComponent(ManualButton)
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout IntroPanelLayout = new javax.swing.GroupLayout(IntroPanel);
        IntroPanel.setLayout(IntroPanelLayout);
        IntroPanelLayout.setHorizontalGroup(
            IntroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntroPanelLayout.createSequentialGroup()
                .addComponent(HelpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        IntroPanelLayout.setVerticalGroup(
            IntroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntroPanelLayout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(HelpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IntroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IntroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        boolean ok = false;
        ok = control.verifyUser(this.getUserName(), this.getUserPassword());
        if (ok) {
            this.showMessage(titleMessage, okMessage, infoIcon);
            this.setVisible(false);
            mcontrol.verifyStatus(ok);
        } else {
            this.showMessage(titleMessage, errorMessage, errorIcon);
        }
        UserTextField.setText("");
        PasswordField.setText("");
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void setVisibleLoginView(boolean isVisible) {
        this.setVisible(isVisible);
    }

    private void ManualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualButtonActionPerformed
        try {
            //System.out.println("Help");

            BrowserLauncher launcher = new BrowserLauncher();
            launcher.openURLinBrowser("http://dl.dropbox.com/u/10048606/Manual.png");
        } catch (BrowserLaunchingInitializingException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedOperatingSystemException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ManualButtonActionPerformed

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            LoginButtonActionPerformed(null);
        }
    }//GEN-LAST:event_PasswordFieldKeyPressed

    private void centerForm() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension window = this.getSize();
        this.setLocation((screen.width - window.width) / 5, (screen.height - window.height) / 5);
    }

    public String getUserName() {
        return UserTextField.getText().toLowerCase();
    }

    public String getUserPassword() {
        return String.valueOf(PasswordField.getPassword());
    }

    public void showMessage(String title, String message, int messageType) {
        JOptionPane.showMessageDialog(this, message, title, messageType);
        UserTextField.requestFocus();
    }
    private LoginController control = new LoginController();
    private MainController mcontrol = new MainController();
    private final String titleMessage = "Inicio Sesión";
    private final String errorMessage = "Datos Incorrectos";
    private final String okMessage = "Bienvenido";
    private final int errorIcon = 0;
    private final int infoIcon = 1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HelpPanel;
    private javax.swing.JPanel IntroPanel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton ManualButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NeedHelpLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField UserTextField;
    // End of variables declaration//GEN-END:variables
}
