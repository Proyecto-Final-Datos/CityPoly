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
import controller.ProccessManagement;
import internalLogic.Graph;
import java.awt.Graphics;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;
import visualLogic.CityDeck;
import visualLogic.Player;
import static ui.LoginWindow.playerList;
import visualLogic.ChallengesDeck;

/**
 *
 * @author Joseph Salas
 * 
 */
public class CityPoly extends javax.swing.JFrame {
   
    private Player Player1;
    private Player Player2;
    
    
    ArrayList<ChallengesDeck> challengesPlayer1 = new ArrayList<ChallengesDeck>();
     ArrayList<ChallengesDeck> challengesPlayer2 = new ArrayList<ChallengesDeck>();
    JsonManager JsonManager = new JsonManager();
    ProccessManagement ProccessManagement = new ProccessManagement();
    public CityPoly() {
        initComponents();
        Player1 = playerList.get(0);
        Player2 = playerList.get(1);
        Player1Field.setText(Player1.getNickName());
        Player2Field.setText(Player2.getNickName());
        starPlayer1.setText(String.valueOf(Player1.getStars()));
        starPlayer2.setText(String.valueOf(Player2.getStars()));   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Player2Field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Player1Field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonDesafios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        starPlayer1 = new javax.swing.JTextField();
        estrellasLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        starPlayer2 = new javax.swing.JTextField();
        CitiesButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ciudadField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        challenge1P2 = new javax.swing.JTextField();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PruebaButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        LabelMainI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 740));
        setMinimumSize(new java.awt.Dimension(1250, 740));
        setPreferredSize(new java.awt.Dimension(1250, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Player2Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jugador 2");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jugador 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        Player1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player1FieldActionPerformed(evt);
            }
        });
        getContentPane().add(Player1Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 30));

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

        starPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starPlayer2ActionPerformed(evt);
            }
        });
        getContentPane().add(starPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, 60, -1));

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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 950, 580));

        PruebaButton.setText("Turno P1");
        PruebaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PruebaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PruebaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        jButton1.setText("Turno P2");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 670, -1, -1));

        LabelMainI.setForeground(new java.awt.Color(255, 255, 255));
        LabelMainI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/RqkZEPG.jpg"))); // NOI18N
        LabelMainI.setText("jLabel1");
        LabelMainI.setMaximumSize(new java.awt.Dimension(1920, 1080));
        LabelMainI.setMinimumSize(new java.awt.Dimension(1920, 1080));
        LabelMainI.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(LabelMainI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Player1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Player1FieldActionPerformed

    private void jButtonDesafiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesafiosActionPerformed

       Random randomChallenge = new Random(); 
       int ran = randomChallenge.nextInt(JsonManager.getChallengesDeck().getCards().size()-1)+1;
       challenge1P1.setText(JsonManager.getChallengesDeck().getCards().get(ran).getDescription());
       int ran1 = randomChallenge.nextInt(JsonManager.getChallengesDeck().getCards().size()-1)+1;
       challenge2P1.setText(JsonManager.getChallengesDeck().getCards().get(ran1).getDescription());
       int ran2 = randomChallenge.nextInt(JsonManager.getChallengesDeck().getCards().size()-1)+1;
       challenge3P1.setText(JsonManager.getChallengesDeck().getCards().get(ran2).getDescription());
       challengesPlayer1.add(JsonManager.getChallengesDeck().getCards().get(ran));
       challengesPlayer1.add(JsonManager.getChallengesDeck().getCards().get(ran1));
       challengesPlayer1.add(JsonManager.getChallengesDeck().getCards().get(ran2));
       int ran3 = randomChallenge.nextInt(JsonManager.getChallengesDeck().getCards().size()-1)+1;
       challenge1P2.setText(JsonManager.getChallengesDeck().getCards().get(ran3).getDescription());
       int ran4 = randomChallenge.nextInt(JsonManager.getChallengesDeck().getCards().size()-1)+1;
       challenge2P2.setText(JsonManager.getChallengesDeck().getCards().get(ran4).getDescription());
       int ran5 = randomChallenge.nextInt(JsonManager.getChallengesDeck().getCards().size()-1)+1;
       challenge3P2.setText(JsonManager.getChallengesDeck().getCards().get(ran5).getDescription());
       challengesPlayer2.add(JsonManager.getChallengesDeck().getCards().get(ran3));
       challengesPlayer2.add(JsonManager.getChallengesDeck().getCards().get(ran4));
       challengesPlayer2.add(JsonManager.getChallengesDeck().getCards().get(ran5));
       Player1.setChallenges(challengesPlayer1);
       Player2.setChallenges(challengesPlayer2);
       Player1.setStartNode(ProccessManagement.generateRandomNode());
       Player2.setStartNode(ProccessManagement.generateRandomNode());
       System.out.println(Player2.getNickName()); 
       System.out.println(Player1.getNickName());
       for (int b =0; b<Player1.getChallenges().size();b++)
       {
           System.out.println(Player1.getChallenges().get(b));
           System.out.println(Player2.getChallenges().get(b));
         
       }       
    }//GEN-LAST:event_jButtonDesafiosActionPerformed

    private void starPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starPlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_starPlayer2ActionPerformed

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
               JsonManager.JsonRead(path);
             }catch(Exception e){}
         }
    }//GEN-LAST:event_loadCardsActionPerformed

    private void CitiesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitiesButtonActionPerformed
        try {
            Random randomCity = new Random();
            int ran = randomCity.nextInt(JsonManager.getCityDeck().getCards().size()-1)+1;
            CityDeck aux = JsonManager.getCityDeck().getCards().get(ran);
            ciudadField.setText(aux.getName());
            
            Graph graphGame;
            graphGame= ProccessManagement.requestJson(String.valueOf(aux.getLatitude()),String.valueOf(aux.getLongitude()),String.valueOf(aux.getRadio()));
            
            for (int i =0; i<graphGame.getNodes().size();i++)
            {
                System.out.println("Lugar: "+graphGame.getNodes().get(i).getPlace()+"Tumbnail:"+ graphGame.getNodes().get(i).getThumbnail());
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(CityPoly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CityPoly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CityPoly.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
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

    private void PruebaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PruebaButtonActionPerformed
      
        ProccessManagement.getRoute(Player1);
        System.out.println(Player1.getChallengePath().toString());
    }//GEN-LAST:event_PruebaButtonActionPerformed

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
    private javax.swing.JTextField Player1Field;
    private javax.swing.JTextField Player2Field;
    private javax.swing.JButton PruebaButton;
    private javax.swing.JTextField challenge1P1;
    private javax.swing.JTextField challenge1P2;
    private javax.swing.JTextField challenge2P1;
    private javax.swing.JTextField challenge2P2;
    private javax.swing.JTextField challenge3P1;
    private javax.swing.JTextField challenge3P2;
    private javax.swing.JTextField ciudadField;
    private javax.swing.JButton diceButton;
    private javax.swing.JLabel estrellasLabel;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadCards;
    private javax.swing.JTextField randomField;
    private javax.swing.JTextField starPlayer1;
    private javax.swing.JTextField starPlayer2;
    // End of variables declaration//GEN-END:variables
}
