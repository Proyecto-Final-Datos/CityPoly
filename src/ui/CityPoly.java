/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.JsonManager;
import java.io.File;
import java.util.Random;
import visualLogic.Dice;
import javax.swing.JFileChooser;

/**
 *
 * @author Joseph Salas
 */
public class CityPoly extends javax.swing.JFrame {
    
    JsonManager prueba = new JsonManager();
    
    public CityPoly() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonDesafios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        starPlayer1 = new javax.swing.JTextField();
        estrellasLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        starsPlayer2 = new javax.swing.JTextField();
        CitiesButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ciudadField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        challenge1P2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        diceButton = new javax.swing.JButton();
        randomField = new javax.swing.JTextField();
        loadCards = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        challenge1P1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        challenge2P1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        challenge3P1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        challenge2P2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        challenge3P2 = new javax.swing.JTextField();
        LabelMainI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 740));
        setMinimumSize(new java.awt.Dimension(1250, 740));
        setPreferredSize(new java.awt.Dimension(1250, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jugador 2");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jugador 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/coollogo_com-36272774.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jButtonDesafios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/card back orange.png"))); // NOI18N
        jButtonDesafios.setText("DESAFIOS");
        jButtonDesafios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDesafios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesafiosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDesafios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 60, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estrellas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));
        getContentPane().add(starPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, -1));

        estrellasLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        estrellasLabel.setForeground(new java.awt.Color(255, 255, 255));
        estrellasLabel.setText("Estrellas");
        getContentPane().add(estrellasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estrellas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 90, -1, -1));

        starsPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starsPlayer2ActionPerformed(evt);
            }
        });
        getContentPane().add(starsPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, 60, -1));

        CitiesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Cities.png"))); // NOI18N
        CitiesButton.setText("jButton1");
        CitiesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CitiesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitiesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CitiesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 60, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CIUDAD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, -1));

        ciudadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ciudadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Reto1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 150, -1, -1));
        getContentPane().add(challenge1P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 170, 100, -1));

        jScrollPane1.setBackground(new java.awt.Color(3, 25, 36));
        jScrollPane1.setForeground(new java.awt.Color(3, 25, 36));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 950, 550));

        diceButton.setBackground(new java.awt.Color(153, 0, 255));
        diceButton.setForeground(new java.awt.Color(0, 0, 204));
        diceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/dice.png"))); // NOI18N
        diceButton.setText("jButton2");
        diceButton.setBorder(null);
        diceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diceButtonActionPerformed(evt);
            }
        });
        getContentPane().add(diceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 50, 60));
        getContentPane().add(randomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 30, -1));

        loadCards.setText("Cargar Ciudades y retos");
        loadCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadCardsActionPerformed(evt);
            }
        });
        getContentPane().add(loadCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Reto1");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(challenge1P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Reto2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        challenge2P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                challenge2P1ActionPerformed(evt);
            }
        });
        getContentPane().add(challenge2P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Reto3");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        challenge3P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                challenge3P1ActionPerformed(evt);
            }
        });
        getContentPane().add(challenge3P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Reto2");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 210, -1, -1));

        challenge2P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                challenge2P2ActionPerformed(evt);
            }
        });
        getContentPane().add(challenge2P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 230, 100, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Reto3");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 280, -1, -1));
        getContentPane().add(challenge3P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 300, 100, -1));

        LabelMainI.setForeground(new java.awt.Color(255, 255, 255));
        LabelMainI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/RqkZEPG.jpg"))); // NOI18N
        LabelMainI.setText("jLabel1");
        LabelMainI.setMaximumSize(new java.awt.Dimension(1920, 1080));
        LabelMainI.setMinimumSize(new java.awt.Dimension(1920, 1080));
        LabelMainI.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(LabelMainI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButtonDesafiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesafiosActionPerformed

       Random randomChallenge = new Random(); 
       int ran = randomChallenge.nextInt(prueba.getChallengesDeck().getCards().size()-1)+1;
       challenge1P1.setText(prueba.getChallengesDeck().getCards().get(ran).getDescription());
       int ran1 = randomChallenge.nextInt(prueba.getChallengesDeck().getCards().size()-1)+1;
       challenge2P1.setText(prueba.getChallengesDeck().getCards().get(ran1).getDescription());
       int ran2 = randomChallenge.nextInt(prueba.getChallengesDeck().getCards().size()-1)+1;
       challenge3P1.setText(prueba.getChallengesDeck().getCards().get(ran2).getDescription());
       int ran3 = randomChallenge.nextInt(prueba.getChallengesDeck().getCards().size()-1)+1;
       challenge1P2.setText(prueba.getChallengesDeck().getCards().get(ran3).getDescription());
       int ran4 = randomChallenge.nextInt(prueba.getChallengesDeck().getCards().size()-1)+1;
       challenge2P2.setText(prueba.getChallengesDeck().getCards().get(ran4).getDescription());
       int ran5 = randomChallenge.nextInt(prueba.getChallengesDeck().getCards().size()-1)+1;
       challenge3P2.setText(prueba.getChallengesDeck().getCards().get(ran5).getDescription());
        
        
    }//GEN-LAST:event_jButtonDesafiosActionPerformed

    private void starsPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starsPlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_starsPlayer2ActionPerformed

    private void ciudadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadFieldActionPerformed
        
    }//GEN-LAST:event_ciudadFieldActionPerformed

    private void diceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diceButtonActionPerformed
        Dice DiceButton = new Dice();
        randomField.setText(Integer.toString(DiceButton.generateRandom()));
    }//GEN-LAST:event_diceButtonActionPerformed

    private void loadCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadCardsActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
         int returnValue = fileChooser.showOpenDialog(null);
         if (returnValue == JFileChooser.APPROVE_OPTION) {
             File file = fileChooser.getSelectedFile();
             String path = file.getAbsolutePath();
             try
             {   
               prueba.JsonRead(path);
             }catch(Exception e){}
         }
    }//GEN-LAST:event_loadCardsActionPerformed

    private void CitiesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitiesButtonActionPerformed
        Random randomCity = new Random();
        int ran = randomCity.nextInt(prueba.getCityDeck().getCards().size()-1)+1;
        ciudadField.setText(prueba.getCityDeck().getCards().get(ran).getName());
        
    }//GEN-LAST:event_CitiesButtonActionPerformed

    private void challenge2P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_challenge2P1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_challenge2P1ActionPerformed

    private void challenge3P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_challenge3P1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_challenge3P1ActionPerformed

    private void challenge2P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_challenge2P2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_challenge2P2ActionPerformed

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
            java.util.logging.Logger.getLogger(CityPoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CityPoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CityPoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CityPoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CityPoly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CitiesButton;
    private javax.swing.JLabel LabelMainI;
    private javax.swing.JTextField challenge1P1;
    private javax.swing.JTextField challenge1P2;
    private javax.swing.JTextField challenge2P1;
    private javax.swing.JTextField challenge2P2;
    private javax.swing.JTextField challenge3P1;
    private javax.swing.JTextField challenge3P2;
    private javax.swing.JTextField ciudadField;
    private javax.swing.JButton diceButton;
    private javax.swing.JLabel estrellasLabel;
    private javax.swing.JButton jButtonDesafios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loadCards;
    private javax.swing.JTextField randomField;
    private javax.swing.JTextField starPlayer1;
    private javax.swing.JTextField starsPlayer2;
    // End of variables declaration//GEN-END:variables
}