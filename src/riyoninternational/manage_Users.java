/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riyoninternational;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hp Pavilion
 */
public class manage_Users extends javax.swing.JPanel {
    Connection conn=null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form manage_Users
     */
    public manage_Users() {
        initComponents();
        conn = DBconnect.connect();
        
        tableLoad();
        clearFields();
        
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        uidbox = new javax.swing.JTextField();
        unamebox = new javax.swing.JTextField();
        utypebox = new javax.swing.JComboBox<>();
        passwordbox = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        deletebtn = new javax.swing.JButton();
        updatebox = new javax.swing.JButton();
        csearchbox = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 660));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uidbox.setEditable(false);
        uidbox.setBackground(new java.awt.Color(204, 204, 204));
        uidbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        unamebox.setEditable(false);
        unamebox.setBackground(new java.awt.Color(204, 204, 204));
        unamebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        unamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameboxActionPerformed(evt);
            }
        });

        utypebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee", "HR" }));
        utypebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utypeboxActionPerformed(evt);
            }
        });

        passwordbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Change Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("User Type");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("User Name ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("User ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(passwordbox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(97, 97, 97)
                                .addComponent(utypebox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(uidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(unamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(utypebox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordbox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(73, 73, 73))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 480, 300));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "USER ID", "USER NAME", "USER TYPE", "PASSWORD"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 800, 90));

        deletebtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        deletebtn.setText("Delete User");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 170, 60));

        updatebox.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        updatebox.setText("Update User");
        updatebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateboxActionPerformed(evt);
            }
        });
        jPanel1.add(updatebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 190, 60));

        csearchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csearchboxActionPerformed(evt);
            }
        });
        jPanel1.add(csearchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 170, 40));

        searchbtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        searchbtn.setText("SEARCH");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 170, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, -600, 1890, 1250));

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1350, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");

        if(x==0){

            String uid = uidbox.getText();

            try{
                String sql = "DELETE from users where idusers = ?";
                pst = conn.prepareStatement(sql);

                pst.setString(1, uid);

                pst.execute();

                //load table
                tableLoad();

                clearFields();

            }catch(SQLException e){
               
            }
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void unameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameboxActionPerformed

    private void csearchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csearchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csearchboxActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        String uname1 = csearchbox.getText();

        try{
            String sql = "SELECT * FROM users where username LIKE '%"+uname1+"%'";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            
             

        }catch(SQLException e){

        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void updateboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateboxActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");

        String uid= uidbox.getText();
        String uname= unamebox.getText();
        String utype = utypebox.getSelectedItem().toString();
        String password= passwordbox.getText();
        
        
            try {
                String sql = ("UPDATE users SET idusers = '"+uid+"', username = '"+uname+"', user_type = '"+utype+"', password = '"+password+"' where idusers ='"+uid+"' ");

                pst = conn.prepareStatement(sql);
    
                pst.execute();

                JOptionPane.showMessageDialog(null, "New Password Updated Successfully!!");
               
                //load table
                tableLoad();
                clearFields();
                
                

            } catch (Exception ex) {
                 
            }
    }//GEN-LAST:event_updateboxActionPerformed

    private void utypeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utypeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utypeboxActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int r = table.getSelectedRow();
        String uid = table.getValueAt(r, 0).toString();
        String uname = table.getValueAt(r, 1).toString();
        String utype = table.getValueAt(r, 2).toString();
        String password = table.getValueAt(r, 3).toString();
        
        
        uidbox.setText(uid);
        unamebox.setText(uname);
        utypebox.setSelectedItem(utype);
        passwordbox.setText(password);
        
       
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField csearchbox;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField passwordbox;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField uidbox;
    private javax.swing.JTextField unamebox;
    private javax.swing.JButton updatebox;
    private javax.swing.JComboBox<String> utypebox;
    // End of variables declaration//GEN-END:variables

    private void tableLoad() {
        try{
            String sql="SELECT * FROM users";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }
        catch(SQLException e){
            
        }
    }

    private void clearFields() {
        uidbox.setText(null);
        unamebox.setText(null);
        utypebox.setSelectedItem(null);
        passwordbox.setText(null);
        csearchbox.setText(null);
        
    }
}
