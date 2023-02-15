/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package suppermarket;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Driver;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Lenovo
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
   
    public Products() {
        initComponents();
         ProductSeler();
         Getcomp();
    }
    Statement St=null;
   ResultSet Rs=null;
   Connection conn=null;
public void ProductSeler(){
      try{
         conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "Beed@9130");
         St=conn.createStatement();
         Rs=St.executeQuery("Select* From products");
         protable.setModel(DbUtils.resultSetToTableModel(Rs));
      }catch(Exception e){
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtproductid = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtquantity = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox<>();
        editebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        protable = new javax.swing.JTable();
        xbtn = new javax.swing.JButton();
        btnseller = new javax.swing.JLabel();
        btncate = new javax.swing.JLabel();
        btnlogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Manage Products");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("ProductId");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Category");

        txtname.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        combobox.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Maize" }));

        editebtn.setBackground(new java.awt.Color(204, 0, 204));
        editebtn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        editebtn.setForeground(new java.awt.Color(255, 255, 255));
        editebtn.setText("Edit");
        editebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editebtnMouseClicked(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(204, 0, 204));
        deletebtn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(204, 0, 204));
        clearbtn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("Clear");
        clearbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(204, 0, 204));
        addbtn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Products List");

        protable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        protable.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
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
                "Name", "UserId", "Quantity", "Price", "Category"
            }
        ));
        protable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                protableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(protable);

        xbtn.setBackground(new java.awt.Color(255, 51, 51));
        xbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xbtn.setText("X");
        xbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(67, 67, 67))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtproductid, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(addbtn)
                        .addGap(81, 81, 81)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(editebtn)
                                .addGap(65, 65, 65)
                                .addComponent(deletebtn)
                                .addGap(50, 50, 50)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearbtn))))
                .addGap(609, 609, 609))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1)
                        .addGap(290, 290, 290)
                        .addComponent(xbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addComponent(xbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtquantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtproductid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)))
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearbtn)
                    .addComponent(deletebtn)
                    .addComponent(editebtn)
                    .addComponent(addbtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        btnseller.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnseller.setForeground(new java.awt.Color(255, 255, 255));
        btnseller.setText("Seller");
        btnseller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsellerMouseClicked(evt);
            }
        });

        btncate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btncate.setForeground(new java.awt.Color(255, 255, 255));
        btncate.setText("Category");
        btncate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncateMouseClicked(evt);
            }
        });

        btnlogout.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setText("Logout");
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnseller, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btncate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnseller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogout)
                .addGap(237, 237, 237))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        
    }//GEN-LAST:event_deletebtnActionPerformed
  

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
  String name=txtname.getText();
        String quantity=txtquantity.getText();
        String productid=txtproductid.getText();
        String category=combobox.getSelectedItem().toString();
        String price=txtprice.getText();
        if(name.isEmpty()||quantity.isEmpty()||productid.isEmpty()||category.isEmpty()||price.isEmpty()){
          JOptionPane.showMessageDialog(this, "Missing information");  
        }else{
        
        
        try{
             Class.forName("org.postgresql.Driver");
       java.sql.Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "Beed@9130");
                System.out.println("Database Connected...");
        java.sql.Statement stmt=conn.createStatement();
          String query="INSERT INTO products(productid,productname,productqnty,productprice,productcat) VALUES('"+productid+"','"+name+"','"+quantity+"','"+price+"','"+category+"')";
         
         
                int rs=stmt.executeUpdate(query);

                    
                
                JOptionPane.showMessageDialog(this, "Product Added Succesfully");
                 
                
                conn.close();
               ProductSeler();
                
                
               }catch(Exception e){
                   JOptionPane.showConfirmDialog(rootPane, "Something Went Wrong");
                    e.printStackTrace();
            
        }
        }
        
        
        
    }//GEN-LAST:event_addbtnMouseClicked

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
      txtname.setText("");
      txtproductid.setText("");
      txtquantity.setText("");
      txtprice.setText("");
     // JOptionPane.showMessageDialog(rootPane, "All Fields is Clear");
    }//GEN-LAST:event_clearbtnMouseClicked

    private void protableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_protableMouseClicked
     DefaultTableModel model=(DefaultTableModel)protable.getModel();
        int Myindex=protable.getSelectedRow();
        txtname.setText(model.getValueAt(Myindex, 1).toString());
        txtquantity.setText(model.getValueAt(Myindex, 2).toString());
        txtproductid.setText(model.getValueAt(Myindex, 0).toString());
        txtprice.setText(model.getValueAt(Myindex,3).toString());
        combobox.setSelectedItem(model.getValueAt(Myindex,4 ).toString());
        JOptionPane.showMessageDialog(rootPane, "Content is added to table");
        
    }//GEN-LAST:event_protableMouseClicked

    private void editebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editebtnMouseClicked
  if(txtname.getText().isEmpty()||txtquantity.getText().isEmpty()||txtprice.getText().isEmpty()||txtproductid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Vallues");
        }else{
            try{
                  conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "Beed@9130");
                  String Query ="Update products set productname='"+txtname.getText()+"'"+",productqnty='"+txtquantity.getText()+"'"+",productprice='"+txtprice.getText()+"'"+",productcat='"+combobox.getSelectedItem().toString()+"'"+"where productid="+txtproductid.getText()+"";
                Statement Add=conn.createStatement();
                Add.executeUpdate(Query);
                 conn.close();
               ProductSeler();
                
                JOptionPane.showMessageDialog(this, "Record Updated Succefully");
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_editebtnMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
  if(txtproductid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "select Product To Be Delete");
                 
        }else{
            try{
      conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "Beed@9130");
        String product=txtproductid.getText();
        String Query="Delete from products where productid="+product;
        Statement Add =conn.createStatement();
         Add.executeUpdate(Query);
         ProductSeler();
                JOptionPane.showMessageDialog(this, "Record Deleted Successfully");
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            
            
            
        }
    }//GEN-LAST:event_deletebtnMouseClicked

    private void xbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xbtnMouseClicked
        System.exit(0);
        JOptionPane.showMessageDialog(rootPane, "Now You Are Exite");
    }//GEN-LAST:event_xbtnMouseClicked

    private void btnsellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsellerMouseClicked
    
    new Seller().setVisible(true);
    this.dispose();
    
    
    }//GEN-LAST:event_btnsellerMouseClicked

    private void btncateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncateMouseClicked
         new Category().setVisible(true);
         this.dispose();
        
    }//GEN-LAST:event_btncateMouseClicked

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
     System.exit(0);
    }//GEN-LAST:event_btnlogoutMouseClicked

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel btncate;
    private javax.swing.JLabel btnlogout;
    private javax.swing.JLabel btnseller;
    private javax.swing.JButton clearbtn;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable protable;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtproductid;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JButton xbtn;
    // End of variables declaration//GEN-END:variables
}
