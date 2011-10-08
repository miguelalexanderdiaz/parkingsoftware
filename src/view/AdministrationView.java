/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdministrationView.java
 *
 * Created on 06-oct-2011, 13:08:24
 */
package view;

import Entity.Employee;
import controller.Administration.AdministrateEmployeeController;
import controller.Administration.AdministrationController;
import controller.MainController;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author r4wd3r
 */
public class AdministrationView extends javax.swing.JFrame {

    /** Creates new form AdministrationView */
    public AdministrationView() {
        initComponents();
    }

    public JList getEmployeeList() {
        return EmployeeList;
    }

    public void setEmployeeList(JList EmployeeList) {
        this.EmployeeList = EmployeeList;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExitButton = new javax.swing.JButton();
        AdminTabbedPanel = new javax.swing.JTabbedPane();
        ParkwayAdminPanel = new javax.swing.JPanel();
        NameParkwayTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NameParkwayTextField1 = new javax.swing.JTextField();
        NameParkwayTextField2 = new javax.swing.JTextField();
        NameParkwayTextField3 = new javax.swing.JTextField();
        NameParkwayTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        EmployeeAdminPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        IdEmployeeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NameEmployeeTextField = new javax.swing.JTextField();
        LastNameEmployeeTextField = new javax.swing.JTextField();
        DocumentEmployeeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        isAdminEmployeeCheckBox = new javax.swing.JCheckBox();
        CreateEmployeeButton = new javax.swing.JButton();
        UpdateEmployeeButton = new javax.swing.JButton();
        DeleteEmployeeButton = new javax.swing.JButton();
        ConsultEmployeeTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        RateAdminPanel = new javax.swing.JPanel();
        ReportAdminPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ExitButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        ExitButton.setText("Cerrar");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre:");

        jLabel7.setText("Dirección:");

        jLabel8.setText("NIT:");

        jLabel9.setText("Teléfono:");

        jLabel10.setText("Capacidad Máxima:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Database.png"))); // NOI18N
        jButton1.setText("Guardar Cambios");

        javax.swing.GroupLayout ParkwayAdminPanelLayout = new javax.swing.GroupLayout(ParkwayAdminPanel);
        ParkwayAdminPanel.setLayout(ParkwayAdminPanelLayout);
        ParkwayAdminPanelLayout.setHorizontalGroup(
            ParkwayAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkwayAdminPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(ParkwayAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(35, 35, 35)
                .addGroup(ParkwayAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameParkwayTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ParkwayAdminPanelLayout.createSequentialGroup()
                        .addComponent(NameParkwayTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(jButton1))
                    .addComponent(NameParkwayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameParkwayTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameParkwayTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        ParkwayAdminPanelLayout.setVerticalGroup(
            ParkwayAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkwayAdminPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(ParkwayAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NameParkwayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(ParkwayAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(NameParkwayTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ParkwayAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameParkwayTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addGap(12, 12, 12)
                .addGroup(ParkwayAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(NameParkwayTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ParkwayAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(NameParkwayTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        AdminTabbedPanel.addTab("Administrar Parqueadero", ParkwayAdminPanel);

        EmployeeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                EmployeeListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeList);

        jLabel1.setText("Lista de Empleados:");

        IdEmployeeTextField.setEditable(false);

        jLabel2.setText("ID:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Documento:");

        isAdminEmployeeCheckBox.setText("Administrador");

        CreateEmployeeButton.setText("Crear Operario");

        UpdateEmployeeButton.setText("Actualizar Operario");

        DeleteEmployeeButton.setText("Eliminar Operario");

        jLabel11.setText("Buscar:");

        SearchButton.setText("Buscar");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmployeeAdminPanelLayout = new javax.swing.GroupLayout(EmployeeAdminPanel);
        EmployeeAdminPanel.setLayout(EmployeeAdminPanelLayout);
        EmployeeAdminPanelLayout.setHorizontalGroup(
            EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeeAdminPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EmployeeAdminPanelLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(51, 51, 51)
                                .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DocumentEmployeeTextField)
                                    .addComponent(IdEmployeeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NameEmployeeTextField)
                                    .addComponent(LastNameEmployeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DeleteEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CreateEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UpdateEmployeeButton)))
                            .addGroup(EmployeeAdminPanelLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(isAdminEmployeeCheckBox))))
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeAdminPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConsultEmployeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchButton)
                        .addGap(248, 248, 248)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        EmployeeAdminPanelLayout.setVerticalGroup(
            EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeAdminPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultEmployeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(SearchButton))
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeeAdminPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdEmployeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(CreateEmployeeButton))
                        .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EmployeeAdminPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NameEmployeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LastNameEmployeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(EmployeeAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DocumentEmployeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(DeleteEmployeeButton))
                                .addGap(18, 18, 18)
                                .addComponent(isAdminEmployeeCheckBox))
                            .addGroup(EmployeeAdminPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(UpdateEmployeeButton))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        AdminTabbedPanel.addTab("Administrar Operario", EmployeeAdminPanel);

        javax.swing.GroupLayout RateAdminPanelLayout = new javax.swing.GroupLayout(RateAdminPanel);
        RateAdminPanel.setLayout(RateAdminPanelLayout);
        RateAdminPanelLayout.setHorizontalGroup(
            RateAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        RateAdminPanelLayout.setVerticalGroup(
            RateAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        AdminTabbedPanel.addTab("Administrar Tarifas", RateAdminPanel);

        javax.swing.GroupLayout ReportAdminPanelLayout = new javax.swing.GroupLayout(ReportAdminPanel);
        ReportAdminPanel.setLayout(ReportAdminPanelLayout);
        ReportAdminPanelLayout.setHorizontalGroup(
            ReportAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        ReportAdminPanelLayout.setVerticalGroup(
            ReportAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        AdminTabbedPanel.addTab("Reportes", ReportAdminPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(568, Short.MAX_VALUE)
                .addComponent(ExitButton)
                .addGap(31, 31, 31))
            .addComponent(AdminTabbedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(AdminTabbedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
       MainController.setVisibleAdminView(false);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        EmployeeList.removeAll();
        String searchText = ConsultEmployeeTextField.getText();
        if(searchText.isEmpty()){
            EmployeeList.setModel(AdministrateEmployeeController.TotalSearchOfEmployees());
        }
        else{
            EmployeeList.setModel(AdministrateEmployeeController.SearchOfEmployees(searchText));
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void EmployeeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_EmployeeListValueChanged
        int emp = EmployeeList.getSelectedIndex();
        if (emp >=0){
            Employee e = AdministrateEmployeeController.getEmployeeListSearch().get(emp);
            AdministrateEmployeeController.setTempEmployee(e);
            IdEmployeeTextField.setText(String.valueOf(e.getId()));
            NameEmployeeTextField.setText(e.getName());
            LastNameEmployeeTextField.setText(e.getLastName());
            DocumentEmployeeTextField.setText(e.getDocument());
            isAdminEmployeeCheckBox.setSelected(e.isAdministrator());
        } 
    }//GEN-LAST:event_EmployeeListValueChanged
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AdminTabbedPanel;
    private javax.swing.JTextField ConsultEmployeeTextField;
    private javax.swing.JButton CreateEmployeeButton;
    private javax.swing.JButton DeleteEmployeeButton;
    private javax.swing.JTextField DocumentEmployeeTextField;
    private javax.swing.JPanel EmployeeAdminPanel;
    private javax.swing.JList EmployeeList;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField IdEmployeeTextField;
    private javax.swing.JTextField LastNameEmployeeTextField;
    private javax.swing.JTextField NameEmployeeTextField;
    private javax.swing.JTextField NameParkwayTextField;
    private javax.swing.JTextField NameParkwayTextField1;
    private javax.swing.JTextField NameParkwayTextField2;
    private javax.swing.JTextField NameParkwayTextField3;
    private javax.swing.JTextField NameParkwayTextField4;
    private javax.swing.JPanel ParkwayAdminPanel;
    private javax.swing.JPanel RateAdminPanel;
    private javax.swing.JPanel ReportAdminPanel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton UpdateEmployeeButton;
    private javax.swing.JCheckBox isAdminEmployeeCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
