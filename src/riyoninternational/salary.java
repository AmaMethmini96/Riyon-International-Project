/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riyoninternational;

import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;
import static riyoninternational.NewCustomers.v;

/**
 *
 * @author Hp Pavilion
 */
public class salary extends javax.swing.JInternalFrame {
    Connection conn=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form salary
     */
    public salary() {
        initComponents();
         conn = DBconnect.connect();
        
        tableLoad();
      
        
        v = "v";
        
        BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI());
        for(MouseListener listner : basicInternalFrameUI.getNorthPane().getMouseListeners()){
            basicInternalFrameUI.getNorthPane().removeMouseListener(listner);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel208 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchbox = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        eidbox = new javax.swing.JTextField();
        enamebox = new javax.swing.JTextField();
        salarybox = new javax.swing.JTextField();
        datebox = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        sidbox = new javax.swing.JTextField();
        jLabel222 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1370, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel208.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(255, 255, 255));
        jLabel208.setText("salary maintenance");
        getContentPane().add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 650, 67));

        jLabel218.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(255, 255, 255));
        jLabel218.setText("Serial NO");
        getContentPane().add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 31));

        jLabel219.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel219.setForeground(new java.awt.Color(255, 255, 255));
        jLabel219.setText("Employee Name");
        getContentPane().add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 163, 145, 31));

        jLabel220.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel220.setForeground(new java.awt.Color(255, 255, 255));
        jLabel220.setText("Date");
        getContentPane().add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 212, 145, 31));

        jLabel221.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel221.setForeground(new java.awt.Color(255, 255, 255));
        jLabel221.setText("Net Salary");
        getContentPane().add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 261, 145, 31));

        reset.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh blue.png"))); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 130, 38));

        deletebtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue-recycle-bin-icon.png"))); // NOI18N
        deletebtn.setText("delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 140, 38));

        savebtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save blue.png"))); // NOI18N
        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        getContentPane().add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 130, 38));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Employee ID", "Employee Name"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 421, 92));

        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });
        getContentPane().add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 79, 200, 40));

        searchbtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, 107, 40));

        eidbox.setEditable(false);
        eidbox.setBackground(new java.awt.Color(204, 204, 204));
        eidbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        getContentPane().add(eidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 127, 80, 30));

        enamebox.setEditable(false);
        enamebox.setBackground(new java.awt.Color(204, 204, 204));
        enamebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        getContentPane().add(enamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 165, 200, 30));

        salarybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryboxActionPerformed(evt);
            }
        });
        getContentPane().add(salarybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, 30));
        getContentPane().add(datebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 213, 200, 30));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Date", "Net Salary"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 391, 760, 139));

        sidbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidboxActionPerformed(evt);
            }
        });
        getContentPane().add(sidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 70, 30));

        jLabel222.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(255, 255, 255));
        jLabel222.setText("Employee ID");
        getContentPane().add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 125, 145, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -210, 1400, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_resetActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:

        int x = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");

        if(x==0){

            String sid = sidbox.getText();

            try{
                String sql = ("DELETE from salary where id = ?");
                pst = conn.prepareStatement(sql);

                pst.setString(1, sid);

                pst.execute();
                JOptionPane.showMessageDialog(null, " Successfully Deleted !!");
                //load table
                tableLoad();

                clearFields();

            }catch(SQLException e){

            }
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        String id= sidbox.getText();
        String cid= eidbox.getText();
        String cname= enamebox.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date= sdf.format(datebox.getDate());
        String cmob2= salarybox.getText();
       
        
        
        
        try{
            String q = "INSERT INTO salary (id,eid, ename, date, salary) values (?,?,?,?,?)";
            pst = conn.prepareStatement(q);
            pst.setString(1,id);
            pst.setString(2,cid);
            pst.setString(3,cname);
            pst.setString(4,date);
            pst.setString(5,cmob2);
          
          
            
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Your Salary Details Inserted Successfully!!");
           
            tableLoad();

        } catch(SQLException e){
            
        }
    
    }//GEN-LAST:event_savebtnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
         int r = table.getSelectedRow();
        String eid= table.getValueAt(r, 0).toString();
       
        
        String cname = table.getValueAt(r, 1).toString();
        
        

        eidbox.setText(eid);
        enamebox.setText(cname);
        
       
        
    }//GEN-LAST:event_tableMouseClicked

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        String sname1 = searchbox.getText();

        try{
            String sql = "SELECT eid,ename FROM employee where ename LIKE '%"+sname1+"%'";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(SQLException e){

        }
        
        
         String name = searchbox.getText();

        try{
            String sql = "SELECT * FROM salary where ename LIKE '%"+name+"%'";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            table1.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(SQLException e){

        }
        
    }//GEN-LAST:event_searchbtnActionPerformed

    private void salaryboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryboxActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        int r = table1.getSelectedRow();
        String sid= table1.getValueAt(r, 0).toString();
        String eid= table1.getValueAt(r, 1).toString();
        String cname = table1.getValueAt(r, 2).toString();
        java.util.Date dte = (java.util.Date)table1.getValueAt(r, 3);
        String mobile2 = table1.getValueAt(r, 4).toString();
        
        sidbox.setText(sid);
        eidbox.setText(eid);
        enamebox.setText(cname);
        datebox.setDate(dte);
        salarybox.setText(mobile2);
    }//GEN-LAST:event_table1MouseClicked

    private void sidboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datebox;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField eidbox;
    private javax.swing.JTextField enamebox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reset;
    private javax.swing.JTextField salarybox;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField sidbox;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables

    private void tableLoad() {
        try{
            String sql="SELECT * FROM salary";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }
        catch(SQLException e){
            
        }
    }

    private void clearFields() {
       eidbox.setText(null);
       enamebox.setText(null);
       datebox.setDate(null); 
       salarybox.setText(null);
       searchbox.setText(null);
      sidbox.setText(null);


    }

   
}