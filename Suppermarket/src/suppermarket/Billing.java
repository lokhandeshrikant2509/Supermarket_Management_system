/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package suppermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Billing extends javax.swing.JFrame {

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
        BillSeler();
        Getcomp();
    }

    Statement St = null;
    ResultSet Rs = null;
    Connection conn = null;

    @SuppressWarnings("unchecked")
    public void BillSeler() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "Beed@9130");
            St = conn.createStatement();
            Rs = St.executeQuery("Select* From products");
            protable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public void update() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "Beed@9130");
            String Query = "Update products set productqnty='" + txtcat.getText() + "'" + "where productid=" + txtid.getText() + "";
            Statement Add = conn.createStatement();
            Add.executeUpdate(Query);
            conn.close();
//               ProductSeler();

            JOptionPane.showMessageDialog(this, "Record Updated Succefully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     private void Getcomp()
    {
       try{
         conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "Beed@9130");
         St=conn.createStatement();
         Rs=St.executeQuery("Select* From category");
        while (Rs.next()){
           String Mycat =Rs.getString("catname");
           combobox.addItem(Mycat);
        }
      }catch(Exception e){
          e.printStackTrace();
      }      
          
      } 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        btnprint = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnrefresh = new javax.swing.JButton();
        btnfilter = new javax.swing.JButton();
        grandtot = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        protable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        clearbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtcat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("Generating Bill");

        combobox.setBackground(new java.awt.Color(204, 0, 204));
        combobox.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "maize" }));

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane2.setViewportView(txtarea);

        btnprint.setBackground(new java.awt.Color(204, 0, 204));
        btnprint.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnprint.setText("Print");
        btnprint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprintMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("ProductList");

        btnrefresh.setBackground(new java.awt.Color(204, 0, 204));
        btnrefresh.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrefreshMouseClicked(evt);
            }
        });

        btnfilter.setBackground(new java.awt.Color(204, 0, 204));
        btnfilter.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnfilter.setText("Filter");
        btnfilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfilterMouseClicked(evt);
            }
        });

        grandtot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        grandtot.setText("Rs=");

        protable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "UserId", "Name", "Quantity", "Price", "Category"
            }
        ));
        protable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                protableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(protable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(grandtot)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(btnprint))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 261, Short.MAX_VALUE)
                                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(btnfilter)
                                .addGap(80, 80, 80)
                                .addComponent(btnrefresh)))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfilter)
                    .addComponent(btnrefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grandtot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnprint))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(221, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Productid");

        clearbtn.setText("Clear");
        clearbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });

        addbtn.setText("AddBills");
        addbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        logoutbtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Quantity");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(addbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearbtn)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtname)
                                    .addComponent(txtid)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(logoutbtn))
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(clearbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutbtn)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Double uprice, productTot = 0.0;
    Double GrandTot = 0.0;
    int Availqyt;
    int quantity;
    private void protableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_protableMouseClicked
        DefaultTableModel model = (DefaultTableModel) protable.getModel();
        int Myindex = protable.getSelectedRow();
        txtid.setText(model.getValueAt(Myindex, 0).toString());
         txtname.setText(model.getValueAt(Myindex, 1).toString());
         
        Availqyt=Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        uprice = Double.valueOf(model.getValueAt(Myindex, 3).toString());
       
        // txtprice.setText(model.getValueAt(Myindex, 3).toString());
        combobox.setSelectedItem(model.getValueAt(Myindex, 4).toString());
    }//GEN-LAST:event_protableMouseClicked

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
        txtid.setText("");
        txtname.setText("");

        txtcat.setText("");
    }//GEN-LAST:event_clearbtnMouseClicked
    int i;
    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        if (txtcat.getText().isEmpty() || txtname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else if (Availqyt <= Integer.valueOf(txtcat.getText()))
        {
            JOptionPane.showMessageDialog(this, "Not Enough Stock");
        } else {
            i++;
            productTot = uprice * Double.valueOf(txtcat.getText());
            GrandTot = GrandTot + productTot;
            if (i == 1) {
                txtarea.setText(txtarea.getText() + "==================Family Suppermarket================\n" + "Num  Products  Price  Quantity   Total\n" + " " + i + "       " + txtname.getText() + "        " + uprice + "       " + txtcat.getText() + "       " + productTot + "\n");

            } else {
                txtarea.setText(txtarea.getText() + " " + i + "       " + txtname.getText() + "          " + uprice + "        " + txtcat.getText() + "        " + productTot + "\n");

            }
            grandtot.setText("RS" + GrandTot);
            update();
        }

    }//GEN-LAST:event_addbtnMouseClicked

    private void btnprintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprintMouseClicked
        try {
            txtarea.print();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnprintMouseClicked

    private void btnfilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfilterMouseClicked
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "Beed@9130");
            St = conn.createStatement();
            Rs = St.executeQuery("Select* From category where catname='"+combobox.getSelectedItem().toString()+"'");
            protable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();

        }

    }//GEN-LAST:event_btnfilterMouseClicked

    private void btnrefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrefreshMouseClicked
       BillSeler();
    }//GEN-LAST:event_btnrefreshMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton btnfilter;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton clearbtn;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JLabel grandtot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JTable protable;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtcat;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
