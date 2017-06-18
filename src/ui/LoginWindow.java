
package ui;

import controller.LoginManager;
import internalLogic.BTree;
import javax.swing.JOptionPane;

public class LoginWindow extends javax.swing.JFrame {

   private LoginManager usersTree;
   
   
    public LoginWindow() {
        initComponents();
        usersTree = new LoginManager();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nickNameField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        newUserButton = new javax.swing.JButton();
        signInButton = new javax.swing.JButton();
        SignNickName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        newPassword = new javax.swing.JPasswordField();
        signPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(480, 580));
        setMinimumSize(new java.awt.Dimension(480, 580));
        setName("loginFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(480, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/coollogo_com-445854.png"))); // NOI18N
        jLabel10.setText(".");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nickname");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        getContentPane().add(nickNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, -1));
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 120, -1));

        newUserButton.setText("New User");
        newUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        signInButton.setText("Sign in");
        signInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 80, -1));

        SignNickName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignNickNameActionPerformed(evt);
            }
        });
        getContentPane().add(SignNickName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("NickName");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        startButton.setText("Start Game");
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));
        getContentPane().add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 120, -1));
        getContentPane().add(signPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/2a7febed26fe150c626220b33225fcc1.jpg"))); // NOI18N
        jLabel1.setText(".");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonActionPerformed
       if(nickNameField.getText().length()==0)
       {
           JOptionPane.showMessageDialog(null, "Este campo es obligatorio", "Error de ingreso", JOptionPane.ERROR_MESSAGE);
          
       }
       else if(nameField.getText().length()==0)
       {
           JOptionPane.showMessageDialog(null, "Este campo es obligatorio", "Error de ingreso", JOptionPane.ERROR_MESSAGE);
       }
       else if(newPassword.getText().length()==0)
       {
           JOptionPane.showMessageDialog(null, "Este campo es obligatorio", "Error de ingreso", JOptionPane.ERROR_MESSAGE);
       }   
       else
       {
        usersTree.saveUser(nickNameField.getText(), nameField.getText(), newPassword.getText());
        JOptionPane.showMessageDialog(null, "Jugador Registrado", "Completo", JOptionPane.INFORMATION_MESSAGE);
        nickNameField.setText("");
        nameField.setText("");
        newPassword.setText("");
       }
       
    }//GEN-LAST:event_newUserButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        CityPoly startGame = new CityPoly();
        startGame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_startButtonActionPerformed

    private void SignNickNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignNickNameActionPerformed

    }//GEN-LAST:event_SignNickNameActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        if(SignNickName.getText().length()==0)
       {
           JOptionPane.showMessageDialog(null, "NickName del jugador requerido", "Error de ingreso", JOptionPane.ERROR_MESSAGE);
       }
        else if(signPassword.getText().length()==0)
       {
           JOptionPane.showMessageDialog(null, "Password del jugador requerido", "Error de ingreso", JOptionPane.ERROR_MESSAGE);
       }
        else
        {
          boolean playerNickName = usersTree.searchNickName(SignNickName.getText());
          if (playerNickName ==true)
          {
              System.out.println("Se ha encotrado el jugador");
              
          }else
          {
            JOptionPane.showMessageDialog(null, "Jugador no se registrado", "Error de ingreso", JOptionPane.ERROR_MESSAGE);
          }
          
            
        }
        
    }//GEN-LAST:event_signInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SignNickName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JButton newUserButton;
    private javax.swing.JTextField nickNameField;
    private javax.swing.JButton signInButton;
    private javax.swing.JPasswordField signPassword;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
