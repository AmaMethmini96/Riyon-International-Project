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
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hp Pavilion
 */
public class NewSupliers extends javax.swing.JInternalFrame {

    Connection conn=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form NewSupliers
     */
    public NewSupliers() {
        initComponents();
        conn = DBconnect.connect();
        
        tableLoad();
        
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
        mname = new javax.swing.JTextField();
        mmodel = new javax.swing.JTextField();
        mprice = new javax.swing.JTextField();
        mdd = new javax.swing.JTextField();
        mwd = new javax.swing.JTextField();
        mwd1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchbox = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        mname1 = new javax.swing.JTextField();
        mcname1 = new javax.swing.JTextField();
        mmodel1 = new javax.swing.JTextField();
        mprice1 = new javax.swing.JTextField();
        mdd1 = new javax.swing.JTextField();
        mwd2 = new javax.swing.JTextField();
        mwd3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField12 = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        mwd4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        sidbox = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1370, 670));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("SUPpLIERS DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 527, 78);

        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });
        getContentPane().add(mname);
        mname.setBounds(177, 142, 250, 30);

        mmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmodelActionPerformed(evt);
            }
        });
        getContentPane().add(mmodel);
        mmodel.setBounds(176, 186, 250, 30);

        mprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpriceActionPerformed(evt);
            }
        });
        getContentPane().add(mprice);
        mprice.setBounds(176, 229, 250, 30);

        mdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mddActionPerformed(evt);
            }
        });
        getContentPane().add(mdd);
        mdd.setBounds(176, 273, 250, 30);

        mwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mwdActionPerformed(evt);
            }
        });
        getContentPane().add(mwd);
        mwd.setBounds(176, 316, 250, 30);

        mwd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mwd1ActionPerformed(evt);
            }
        });
        getContentPane().add(mwd1);
        mwd1.setBounds(176, 400, 250, 92);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Country");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(27, 357, 145, 31);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(27, 314, 145, 31);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Company Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(27, 271, 145, 31);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contact Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(27, 227, 145, 31);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(27, 184, 145, 31);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 100, 80, 31);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", " Name", "Address", "Contact Number", "Company Name", "Email", "Country", "Otherdetails"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 270, 800, 240);

        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });
        getContentPane().add(searchbox);
        searchbox.setBounds(827, 82, 200, 40);

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48)); // NOI18N
        jLabel3.setText("SUPLIERS DETAILS");

        mname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mname1ActionPerformed(evt);
            }
        });

        mcname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcname1ActionPerformed(evt);
            }
        });

        mmodel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmodel1ActionPerformed(evt);
            }
        });

        mprice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mprice1ActionPerformed(evt);
            }
        });

        mdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdd1ActionPerformed(evt);
            }
        });

        mwd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mwd2ActionPerformed(evt);
            }
        });

        mwd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mwd3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("Country");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setText("Email");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("Company Name");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setText("Contact Number");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setText("Address");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setText("Last Name");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel16.setText("First Name");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Address", "Contact Nu", "Company Name", "Email", "Country"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addGap(800, 800, 800)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(mname1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(mcname1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(mmodel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(5, 5, 5)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mwd3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(180, 180, 180)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mname1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mcname1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mmodel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addComponent(mprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(mdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(mwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(mwd3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(1336, 369, 0, 0);

        searchbtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn);
        searchbtn.setBounds(1040, 80, 107, 40);

        reset.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh blue.png"))); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(173, 546, 114, 38);

        deletebtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue-recycle-bin-icon.png"))); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn);
        deletebtn.setBounds(293, 546, 140, 38);

        updatebtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Text-Edit-icon (1).png"))); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn);
        updatebtn.setBounds(439, 546, 140, 38);

        savebtn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save blue.png"))); // NOI18N
        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        getContentPane().add(savebtn);
        savebtn.setBounds(27, 546, 140, 38);

        mwd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mwd4ActionPerformed(evt);
            }
        });
        getContentPane().add(mwd4);
        mwd4.setBounds(176, 359, 250, 30);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Other Details");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(27, 429, 145, 31);

        sidbox.setEditable(false);
        sidbox.setBackground(new java.awt.Color(204, 204, 204));
        sidbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        getContentPane().add(sidbox);
        sidbox.setBounds(180, 100, 80, 30);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Name");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(27, 142, 145, 31);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.jpeg"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(-170, -240, 1580, 920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameActionPerformed

    private void mmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmodelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmodelActionPerformed

    private void mpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpriceActionPerformed

    private void mddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mddActionPerformed

    private void mwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mwdActionPerformed

    private void mwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mwd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mwd1ActionPerformed

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void mname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mname1ActionPerformed

    private void mcname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcname1ActionPerformed

    private void mmodel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmodel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmodel1ActionPerformed

    private void mprice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mprice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mprice1ActionPerformed

    private void mdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdd1ActionPerformed

    private void mwd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mwd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mwd2ActionPerformed

    private void mwd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mwd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mwd3ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
          String sname1 = searchbox.getText();

        try{
            String sql = "SELECT * FROM supplier where sname LIKE '%"+sname1+"%'";


            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(SQLException e){
           
        }       

       
    }//GEN-LAST:event_searchbtnActionPerformed

    private void mwd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mwd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mwd4ActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        
        String sname= mname.getText();
        String address= mmodel.getText();
        String cnumber= mprice.getText();
        String cname= mdd.getText();
        String email= mwd.getText();
        String country= mwd4.getText();
        String des= mwd1.getText();
       
        
        
        try{
            String q = "INSERT INTO supplier (sname, address, mobile, comName, email, country, other) values (?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(q);

            pst.setString(1,sname);
            pst.setString(2,address);
            pst.setString(3,cnumber);
            pst.setString(4,cname);
            pst.setString(5,email);
            pst.setString(6,country);
            pst.setString(7,des);

            if(sname.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type a Customer ID");
        }else  if(address.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type Customer Name");
        }else  if(cnumber.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type Customer Mobile");
        }else  if(cname.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type Customer Mobile2");
        }else  if(email.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type Customer Company Name");
        }else  if(country.equals("")){
            
            JOptionPane.showMessageDialog(null, "Please type Customer CompanyMobile");
        }else  if(des.equals(""))
            
            
           
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Your Supplier Details Inserted Successfully!!");
            clearFields();
            tableLoad();

        } catch(SQLException e){
            
        }
        
        
        
    }//GEN-LAST:event_savebtnActionPerformed

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
                String sql = ("DELETE from supplier where sid = ?");
                pst = conn.prepareStatement(sql);

                pst.setString(1, sid);

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

        String sid= sidbox.getText();
        String sname= mname.getText();
        String address= mmodel.getText();
        String cnumber= mprice.getText();
        String cname= mdd.getText();
        String email= mwd.getText();
        String country= mwd4.getText();
        String des= mwd1.getText();
       
      
            try {
                String sql = ("UPDATE supplier SET sname ='"+sname+"',  address = '"+address+"', mobile = '"+cnumber+"', comName = '"+cname+"', email = '"+email+"', country = '"+country+"', other = '"+des+"'  where sid ='"+sid+"' ");

                pst = conn.prepareStatement(sql);
    
                pst.execute();

                JOptionPane.showMessageDialog(null, "Updated Successfully!!");
               
                //load table
                tableLoad();
                clearFields();
                
                

            } catch (Exception ex) {
                 
            }
            
    }//GEN-LAST:event_updatebtnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int r = table.getSelectedRow();
        String cid = table.getValueAt(r, 0).toString();
        String cname = table.getValueAt(r, 1).toString();
        String mobile1 = table.getValueAt(r, 2).toString();
        String mobile2 = table.getValueAt(r, 3).toString();
        String comname = table.getValueAt(r, 4).toString();
        String commobile = table.getValueAt(r, 5).toString();
        String address = table.getValueAt(r, 6).toString();
        String email = table.getValueAt(r, 7).toString();
        
        
        sidbox.setText(cid);
        mname.setText(cname);
        mmodel.setText(mobile1);
        mprice.setText(mobile2);
        mdd.setText(comname);
        mwd.setText(commobile);
        mwd4.setText(address);
        mwd1.setText(email);
        
        
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebtn;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField mcname1;
    private javax.swing.JTextField mdd;
    private javax.swing.JTextField mdd1;
    private javax.swing.JTextField mmodel;
    private javax.swing.JTextField mmodel1;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField mname1;
    private javax.swing.JTextField mprice;
    private javax.swing.JTextField mprice1;
    private javax.swing.JTextField mwd;
    private javax.swing.JTextField mwd1;
    private javax.swing.JTextField mwd2;
    private javax.swing.JTextField mwd3;
    private javax.swing.JTextField mwd4;
    private javax.swing.JButton reset;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField sidbox;
    private javax.swing.JTable table;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

    private void tableLoad() {
          try{
            String sql="SELECT * FROM supplier";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }
        catch(SQLException e){
            
        }
    }

    private void clearFields() {
        sidbox.setText(null);
        mname.setText(null);
        mmodel.setText(null);
        mprice.setText(null);
        mdd.setText(null);
        mwd.setText(null);
        mwd4.setText(null);
        mwd1.setText(null);
        searchbox.setText(null);
      
    }
}
