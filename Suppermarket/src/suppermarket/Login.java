/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package suppermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        uid = new javax.swing.JTextField();
        btnclr = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(getMaximumSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 416));

        jPanel2.setBackground(new java.awt.Color(102, 51, 255));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login Here");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(100, 0, 130, 32);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Userid");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 130, 70, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 170, 60, 20);
        jPanel2.add(pass);
        pass.setBounds(150, 160, 150, 26);
        jPanel2.add(uid);
        uid.setBounds(150, 120, 150, 26);

        btnclr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclr.setText("Clear");
        btnclr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclrMouseClicked(evt);
            }
        });
        jPanel2.add(btnclr);
        btnclr.setBounds(220, 250, 75, 23);

        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        jPanel2.add(login);
        login.setBounds(20, 250, 69, 29);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UserType");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 80, 60, 20);

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Seller" }));
        jPanel2.add(combo);
        combo.setBounds(150, 80, 150, 26);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 0, 354, 416));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Statement St=null;
   ResultSet Rs=null;
   Connection conn=null;
    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
 if(combo.getSelectedItem().toString().equals("Seller"))
   {
        
        try {
        conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "Beed@9130");
         St=conn.createStatement();
         Rs=St.executeQuery("Select* From selertb where selername='"+uid.getText()+"'and selerpass='"+pass.getText()+"'");
          if(Rs.next()){
            new Billing().setVisible(true);
            JOptionPane.showMessageDialog(this, "login is successfull");
            this.dispose();
        }else{
                JOptionPane.showMessageDialog(this, "Wrong userid or password");
                }

        }catch(Exception e){
         e.printStackTrace();
        }
   } else{
     
        try {
        conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "Beed@9130");
         St=conn.createStatement();
         Rs=St.executeQuery("Select* From admintbl where admname='"+uid.getText()+"'and admpass='"+pass.getText()+"'");
         if(Rs.next()){
            new Products().setVisible(true);
            JOptionPane.showMessageDialog(this, "login is success full");
            this.dispose();
        }else{
                JOptionPane.showMessageDialog(this, "Wrong Admin or password");
                }

   }catch(Exception e){
       e.printStackTrace();
   }
   } 
    }//GEN-LAST:event_loginMouseClicked

    private void btnclrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclrMouseClicked
       uid.setText("");
       pass.setText("");
    }//GEN-LAST:event_btnclrMouseClicked

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclr;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField uid;
    // End of variables declaration//GEN-END:variables
}
