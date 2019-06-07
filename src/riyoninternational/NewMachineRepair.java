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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hp Pavilion
 */
public class NewMachineRepair extends javax.swing.JInternalFrame {
    Connection conn=null;
    PreparedStatement pst = null;
    ResultSet rs = null;


    /**
     * Creates new form NewMachineRepair
     */
    public NewMachineRepair() {
        initComponents();
                conn = DBconnect.connect();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        citybox = new javax.swing.JTextField();
        cnamebox = new javax.swing.JTextField();
        mnamebox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        repaircostbox = new javax.swing.JTextField();
        issuebox = new javax.swing.JTextField();
        partscostbox = new javax.swing.JTextField();
        tname = new javax.swing.JLabel();
        tnamebox = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        calculatebtn = new javax.swing.JButton();
        totalbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        reset = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        datebox = new com.toedter.calendar.JDateChooser();
        searchbox = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        monthbox = new javax.swing.JComboBox<>();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1370, 670));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48)); // NOI18N
        jLabel1.setText("Machine Repair Details");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Machine Name     ");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Customer Name   ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("City                    ");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("Issue                  ");

        citybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityboxActionPerformed(evt);
            }
        });

        cnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameboxActionPerformed(evt);
            }
        });

        mnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameboxActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("Date                     ");

        jLabel58.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel58.setText("Repair Cost           ");

        jLabel57.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel57.setText("Food and Transport Cost             ");

        repaircostbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repaircostboxActionPerformed(evt);
            }
        });

        partscostbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partscostboxActionPerformed(evt);
            }
        });

        tname.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tname.setText("Technician           ");

        tnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameboxActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel60.setText("Month                 ");

        calculatebtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        calculatebtn.setText("Calculate Total");
        calculatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebtnActionPerformed(evt);
            }
        });

        totalbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalboxActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Machine Name", "Customer Name", "City", "Issue", "Technician", "Repair cost", "Food Cost", "Month", "Total Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        reset.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh blue.png"))); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue-recycle-bin-icon.png"))); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Text-Edit-icon (1).png"))); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print-icon (1).png"))); // NOI18N
        jButton7.setText("PRINT");

        savebtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save blue.png"))); // NOI18N
        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });

        searchbtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        monthbox.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        monthbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JANUARY", "FEBUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY ", "AUGUST", "SEPTEMBER", "OCTOMBER", "NOVEMBER", "DECEMBER" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(calculatebtn)
                        .addGap(13, 13, 13)
                        .addComponent(totalbox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(repaircostbox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(issuebox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(25, 25, 25)
                                        .addComponent(cnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(50, 50, 50)
                                        .addComponent(citybox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(monthbox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(partscostbox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel58))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(repaircostbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel57)
                                .addComponent(partscostbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(citybox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(issuebox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(calculatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(totalbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cityboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityboxActionPerformed

    private void cnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameboxActionPerformed

    private void mnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameboxActionPerformed

    private void repaircostboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repaircostboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repaircostboxActionPerformed

    private void partscostboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partscostboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partscostboxActionPerformed

    private void tnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameboxActionPerformed

    private void calculatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_calculatebtnActionPerformed

    private void totalboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalboxActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_resetActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");

        if(x==0){

            String cid = cnamebox.getText();

            try{
                String sql = "DELETE from repairDetails where cname = ?";
                pst = conn.prepareStatement(sql);

                pst.setString(1, cid);

                pst.execute();

                //load table
                tableLoad();

                clearFields();               


            }catch(SQLException e){
            }
        }

    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");

        String date=((JTextField)datebox.getDateEditor().getUiComponent()).getText();
        String mname= mnamebox.getText();
        String cname= cnamebox.getText();
        String city= citybox.getText();
        String issue= issuebox.getText();
        String tname= tnamebox.getText();
        String rcost= repaircostbox.getText();
        String pcost= partscostbox.getText();
        String month= (String) monthbox.getSelectedItem();
        String total= totalbox.getText();
       
      
            try {
                String sql = ("UPDATE repairDetails SET date ='"+date+"',  mname = '"+mname+"', cname = '"+cname+"', city = '"+city+"', issue = '"+issue+"', tname = '"+tname+"', rcost = '"+rcost+"', fcost = '"+pcost+"', month = '"+month+"', totalcost = '"+total+"'  where cname ='"+cname+"' ");

                pst = conn.prepareStatement(sql);
    
                pst.execute();

                JOptionPane.showMessageDialog(null, "Updated Successfully!!");
               
                //load table
                tableLoad();
                clearFields();
                
                

            } catch (Exception ex) {
                 
            }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date= sdf.format(datebox.getDate());
        String mname= mnamebox.getText();
        String cname= cnamebox.getText();
        String city= citybox.getText();
        String issue= issuebox.getText();
        String tname= tnamebox.getText();
        String rcost= repaircostbox.getText();
        String fcost= partscostbox.getText();
        String month= (String) monthbox.getSelectedItem();
        String total= totalbox.getText();

        try{
            String q = "INSERT INTO repairDetails ( date, mname, cname, city, issue, tname, rcost, fcost, month, totalcost) values (?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(q);

            pst.setString(1,date);
            pst.setString(2,mname);
            pst.setString(3,cname);
            pst.setString(4,city);
            pst.setString(5,issue);
            pst.setString(6,tname);
            pst.setString(7,rcost);
            pst.setString(8,fcost);
            pst.setString(9,month);
            pst.setString(10,total);
            
            
                
        if(date.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type a date");
        }else  if(mname.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type Machine Name");
        }else  if(cname.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type Customer Name");
        }else  if(city.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type Customer Mobile2");
        }else  if(issue.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type issue date");
        }else  if(tname.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type tname");
        }else  if(rcost.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type rcost");
        }else  if(fcost.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type fcost");
        }else  if(city.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type City");
        }else  if(month.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type month");
        }
            

            pst.execute();

            JOptionPane.showMessageDialog(null, "Your Repair Details Inserted Successfully!!");
            clearFields();
            tableLoad();

        } catch(SQLException e){

        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        String cname1 = searchbox.getText();

        try{
            String sql = "SELECT * FROM repairDetails where month LIKE '%"+cname1+"%'";


            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(SQLException e){
           
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int r = table.getSelectedRow();
        java.util.Date date = (java.util.Date)table.getValueAt(r, 1);
        String cname = table.getValueAt(r, 2).toString();
        String mobile1 = table.getValueAt(r, 3).toString();
        String mobile2 = table.getValueAt(r, 4).toString();
        String comname = table.getValueAt(r, 5).toString();
        String commobile = table.getValueAt(r, 6).toString();
        String address = table.getValueAt(r, 7).toString();
        String email = table.getValueAt(r, 8).toString();
        String month = table.getValueAt(r, 9).toString();
        String total = table.getValueAt(r, 10).toString();
        
      
         
        datebox.setDate(date);
        mnamebox.setText(cname);
        cnamebox.setText(mobile1);
        citybox.setText(mobile2);
        issuebox.setText(comname);
        tnamebox.setText(commobile);
        repaircostbox.setText(address);
        partscostbox.setText(email);
        monthbox.setSelectedItem(month);
        totalbox.setText(total);


    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculatebtn;
    private javax.swing.JTextField citybox;
    private javax.swing.JTextField cnamebox;
    private com.toedter.calendar.JDateChooser datebox;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField issuebox;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mnamebox;
    private javax.swing.JComboBox<String> monthbox;
    private javax.swing.JTextField partscostbox;
    private javax.swing.JTextField repaircostbox;
    private javax.swing.JButton reset;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTable table;
    private javax.swing.JLabel tname;
    private javax.swing.JTextField tnamebox;
    private javax.swing.JTextField totalbox;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        datebox.setDate(null);
        mnamebox.setText(null);
        cnamebox.setText(null);
        citybox.setText(null);
        issuebox.setText(null);
        tnamebox.setText(null);
        repaircostbox.setText(null);
        monthbox.setSelectedItem(null);
        partscostbox.setText(null);
        searchbox.setText(null);
        
    }

    private void tableLoad() {
        try{
            String sql="SELECT date, mname, cname, city, issue, tname, rcost, fcost, month, totalcost FROM repairDetails";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }
        catch(SQLException e){
            
        }
    }
}