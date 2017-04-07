/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usb.university.view;

import com.usb.university.dao.DepartmentDAO;
import com.usb.university.dao.DepartmentDAOFactory;
import com.usb.university.model.Department;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;
import javax.swing.JTable;

/**
 *
 * @author "INNOVAPPS.CO S.A.S."
 */
public class DepartmentPanel extends javax.swing.JPanel {

    private DepartmentDAOFactory factory = new DepartmentDAOFactory();
    private boolean isEdit = false;

    /**
     * Creates new form Deparment
     *
     * @param windows
     */
    public DepartmentPanel() {
        initComponents();
        jButtonDelete.setEnabled(false);
        getAllDepartments();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDepartments = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelDeptName = new javax.swing.JLabel();
        jTextFieldBuilding = new javax.swing.JTextField();
        jTextFieldDeptName = new javax.swing.JTextField();
        jLabelBuilding = new javax.swing.JLabel();
        jLabelBudget = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jFormattedTextFieldBudget = new javax.swing.JFormattedTextField();
        jButtonNewDepartment = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 400));

        jTableDepartments.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{
            },
            new String [] {
                "NAME", "BUILDING", "BUDGET"
            }) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all cells false
                    return false;
                }
            }
        );
        jTableDepartments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDepartmentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDepartments);

        jLabelDeptName.setText("NAME:");

        jTextFieldDeptName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDeptNameFocusLost(evt);
            }
        });

        jLabelBuilding.setText("BUILDING:");

        jLabelBudget.setText("BUDGET:");

        jButtonSave.setText("SAVE");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        NumberFormatter budgetFormatter =new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"));
        budgetFormatter.setMaximum(Double.MAX_VALUE);
        budgetFormatter.setAllowsInvalid(false);
        budgetFormatter.setCommitsOnValidEdit(true);
        jFormattedTextFieldBudget.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(budgetFormatter));

        jButtonNewDepartment.setText("NEW");
        jButtonNewDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewDepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBuilding, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeptName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelBudget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete))
                    .addComponent(jTextFieldBuilding)
                    .addComponent(jTextFieldDeptName)
                    .addComponent(jFormattedTextFieldBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNewDepartment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNewDepartment)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDeptName)
                    .addComponent(jTextFieldDeptName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBuilding)
                    .addComponent(jTextFieldBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBudget)
                    .addComponent(jFormattedTextFieldBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (jTextFieldDeptName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "The name field is required", "Field Required",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (jTextFieldBuilding.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "The building field is required", "Field Required",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (jFormattedTextFieldBudget.getText().isEmpty() 
                || ((Number) jFormattedTextFieldBudget.getValue()).doubleValue() <= 0) {
            JOptionPane.showMessageDialog(this, "The budget field must be bigger than 0", "Field Required",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (isEdit) {
            try (DepartmentDAO dao = factory.createDeparmentDAO()) {
                Department dept = readDepartment();
                dao.update(dept.getDeptName(), dept);
                clearFields();
                getAllDepartments();
                JOptionPane.showMessageDialog(this, "Department edited succesfully!", "", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                System.out.println("Error saving department " + e.getClass().getName());
                System.out.println("Message: " + e.getMessage());
            }
        } else {
            try (DepartmentDAO dao = factory.createDeparmentDAO()) {
                dao.create(readDepartment());
                clearFields();
                getAllDepartments();
                JOptionPane.showMessageDialog(this, "Department created succesfully!", "", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                System.out.println("Error saving department " + e.getClass().getName());
                System.out.println("Message: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTableDepartmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDepartmentsMouseClicked

        try (DepartmentDAO dao = factory.createDeparmentDAO()) {
            JTable target = (JTable) evt.getSource();
            int row = target.getSelectedRow();
            String deptName = jTableDepartments.getValueAt(row, 0).toString();
            writeDepartment(dao.findById(deptName));
            isEdit = true;
            jTextFieldDeptName.setEnabled(false);
            jButtonDelete.setEnabled(true);
        } catch (Exception e) {
            System.out.println("Error getting department by id" + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());
        }

    }//GEN-LAST:event_jTableDepartmentsMouseClicked

    private void jButtonNewDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewDepartmentActionPerformed
        clearFields();
        isEdit = false;
        jButtonDelete.setEnabled(false);
    }//GEN-LAST:event_jButtonNewDepartmentActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this department?", "Delete Department", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            try (DepartmentDAO dao = factory.createDeparmentDAO()) {
                dao.delete(readDepartment().getDeptName());
                clearFields();
                getAllDepartments();
                JOptionPane.showMessageDialog(this, "Department deleted succesfully!", "", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                System.out.println("Error deleting department " + e.getClass().getName());
                System.out.println("Message: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldDeptNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDeptNameFocusLost
        if (existDeptName()) {
         
        }
    }//GEN-LAST:event_jTextFieldDeptNameFocusLost

    public void getAllDepartments() {
        try (DepartmentDAO dao = factory.createDeparmentDAO()) {
            DefaultTableModel model = (DefaultTableModel) jTableDepartments.getModel();
            model.setRowCount(0);
            for (Department department : dao.findAll()) {
                Object[] cols = new Object[3];
                cols[0] = department.getDeptName();
                cols[1] = department.getBuilding();
                cols[2] = department.getBudget();
                model.addRow(cols);
            }
        } catch (Exception e) {
            System.out.println("Error getting all departments " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());
        }
    }

    private boolean existDeptName() {
        boolean exist = false;
        try (DepartmentDAO dao = factory.createDeparmentDAO()) {
            String deptName = jTextFieldDeptName.getText();
            if (!deptName.isEmpty()) {                
                exist = dao.findById(deptName) != null;
                if (exist) {
                    jTextFieldDeptName.setText("");
                    JOptionPane.showMessageDialog(this, "The name of department " + deptName + " already exist!", "Error Name!", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println("Error getting department by ID " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());            
        }
        return exist;
    }

    private Department readDepartment() {
        Department dept = new Department();
        dept.setDeptName(jTextFieldDeptName.getText());
        dept.setBuilding(jTextFieldBuilding.getText());
        dept.setBudget(((Number) jFormattedTextFieldBudget.getValue()).doubleValue());
        return dept;
    }

    private void writeDepartment(Department dept) {
        jTextFieldDeptName.setText(dept.getDeptName());
        jTextFieldBuilding.setText(dept.getBuilding());
        jFormattedTextFieldBudget.setValue(dept.getBudget());
    }

    private void clearFields() {
        jTextFieldDeptName.setText("");
        jTextFieldBuilding.setText("");
        jFormattedTextFieldBudget.setValue(0);
        isEdit = false;
        jTextFieldDeptName.setEnabled(true);
        jButtonDelete.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonNewDepartment;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JFormattedTextField jFormattedTextFieldBudget;
    private javax.swing.JLabel jLabelBudget;
    private javax.swing.JLabel jLabelBuilding;
    private javax.swing.JLabel jLabelDeptName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDepartments;
    private javax.swing.JTextField jTextFieldBuilding;
    private javax.swing.JTextField jTextFieldDeptName;
    // End of variables declaration//GEN-END:variables
}
