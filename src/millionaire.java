
import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BOLAJI
 */
public class millionaire extends javax.swing.JFrame {

   int callQuestion;
   
   public void init(){
       callQuestion = 0;
   }
    public millionaire() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    int count = 0;
    String[] imgnames = {"img5.PNG"};
    int people = 0;
    String[] imgpeople = {"img2_2.PNG"};
    int phone = 0;
    String[] imgphone = {"img3_3.PNG"};
    int fifty50 = 0;
    String[] imgfifty50 = {"img4_4.PNG"};
    int correct1 = 0;
    String[] imgcorrect1 = {"img6.PNG"};
    int correct2 = 0;
    String[] imgcorrect2 = {"img7.PNG"};
    int correct3 = 0;
    String[] imgcorrect3 = {"img8.PNG"};
    int correct4 = 0;
    String[] imgcorrect4 = {"img9.PNG"};
    
    int correct5 = 0;
    String[] imgcorrect5 = {"img10.PNG"};
    int correct6 = 0;
    String[] imgcorrect6 = {"img5.PNG"};
    int correct7 = 0;
    String[] imgcorrect7 = {"img5.PNG"};
   
    int correct8 = 0; 
    String[] imgcorrect8 = {"img5.PNG"};
    int correct9 = 0;
    String[] imgcorrect9 = {"img5.PNG"};
    int correct10 = 0;
    String[] imgcorrect10 = {"img5.PNG"};
    
    int correct11 = 0;
    String[] imgcorrect11 = {"img5.PNG"};
    int correct12 = 0;
    String[] imgcorrect12 = {"img5.PNG"};
   
    int correct13 = 0;
    String[] imgcorrect13 = {"img5.PNG"};
    
    int correct14 = 0;
    String[] imgcorrect14 = {"img5.PNG"};
    int correct15 = 0;
    String[] imgcorrect15 = {"img5.PNG"};

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1020, 650));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img2.PNG"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.PNG"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img4.PNG"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img5.PNG"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.PNG"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 4, true));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 4, true));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 4, true));

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 4, true));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 4, true));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(87, 87, 87)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        this.getContentPane().setBackground(Color.black);
    }//GEN-LAST:event_formMouseMoved

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jTextField1.setText("       who want's to be a millionaire");
        jTextField2.setText("                ");
        jTextField3.setText("                ");
        jTextField4.setText("                ");
        jTextField5.setText("                ");
    }//GEN-LAST:event_formWindowActivated

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       callQuestion = callQuestion +1;
       
       jTextField1.setForeground(WHITE);
       jTextField2.setForeground(WHITE);
       jTextField3.setForeground(WHITE);
       jTextField4.setForeground(WHITE);
       jTextField5.setForeground(WHITE);
       
       if (callQuestion == 1){
           jTextField1.setText("        What is 9 * 4 ");
           jTextField2.setText(" A) 36");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 45");
           jTextField5.setText(" D) 57");
       }
       if (callQuestion == 2){
           jTextField1.setText("        What is 2 + 47 + 18 ");
           jTextField2.setText(" A) 36");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 45");
           jTextField5.setText(" D) 67");
       }
       if (callQuestion == 3){
           jTextField1.setText("        What is 10 + 15 + 20 ");
           jTextField2.setText(" A) 38");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 45");
           jTextField5.setText(" D) 57");
       }
       if (callQuestion == 4){
           jTextField1.setText("        What is 4 + 1 +18 ");
           jTextField2.setText(" A) 36");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 23");
           jTextField5.setText(" D) 27");
       }
       if (callQuestion == 5){
           jTextField1.setText("        What is 5 * 2 + 8 ");
           jTextField2.setText(" A) 50");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 45");
           jTextField5.setText(" D) 57");
       }
       if (callQuestion == 6){
           jTextField1.setText("        What is 6 + 2 + 100 ");
           jTextField2.setText(" A) 38");
           jTextField3.setText(" B) 108");
           jTextField4.setText(" C) 45");
           jTextField5.setText(" D) 57");
       }
       if (callQuestion == 7){
           jTextField1.setText("        What is 8 + 22 + 18 ");
           jTextField2.setText(" A) 36");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 38");
           jTextField5.setText(" D) 57");
       }
       if (callQuestion == 8){
           jTextField1.setText("        What is 8 + 20 + 10 ");
           jTextField2.setText(" A) 36");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 45");
           jTextField5.setText(" D) 38");
       }
       if (callQuestion == 9){
           jTextField1.setText("        What is 9 + 9 + 18 ");
           jTextField2.setText(" A) 36");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 45");
           jTextField5.setText(" D) 57");
       }
       if (callQuestion == 10){
           jTextField1.setText("        What is 10 + 2 + 18 ");
           jTextField2.setText(" A) 38");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 45");
           jTextField5.setText(" D) 30");
       }
       if (callQuestion == 11){
           jTextField1.setText("        What is 11 + 4 + 18  ");
           jTextField2.setText(" A) 38");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 33");
           jTextField5.setText(" D) 57");
       }
       if (callQuestion == 12){
           jTextField1.setText("        What is 12 + 4 + 18 ");
           jTextField2.setText(" A) 38");
           jTextField3.setText(" B) 34");
           jTextField4.setText(" C) 45");
           jTextField5.setText(" D) 57");
       }
       
       if (callQuestion == 13){
           jTextField1.setText("        What is 13 + 15 + 2 ");
           jTextField2.setText(" A) 38");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 45");
           jTextField5.setText(" D) 30");
       }
       if (callQuestion == 14){
           jTextField1.setText("        What is 14 + 2 + 18 ");
           jTextField2.setText(" A) 38");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 34");
           jTextField5.setText(" D) 57");
       }
       if (callQuestion == 15){
           jTextField1.setText("        What is 15  + 3 + 18 ");
           jTextField2.setText(" A) 36");
           jTextField3.setText(" B) 18");
           jTextField4.setText(" C) 45");
           jTextField5.setText(" D) 57");
       }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ImageIcon[] imageList = new ImageIcon[1];
        for(int i=0; i<imageList.length; i++){
            imageList[i]  = new ImageIcon(getClass().getResource("/images/"+imgpeople[i]));
        }
        if(people <0) people =1;
        if(people >=0 && people<imgpeople.length){
            jLabel1.setIcon(imageList[people]);
            people++;
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ImageIcon[] imageList = new ImageIcon[1];
        for(int i=0; i<imageList.length; i++){
            imageList[i]  = new ImageIcon(getClass().getResource("/images/"+imgphone[i]));
        }
        if(phone <0) phone =1;
        if(phone >=0 && phone<imgphone.length){
            jLabel2.setIcon(imageList[phone]);
            phone++;
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ImageIcon[] imageList = new ImageIcon[1];
        for(int i=0; i<imageList.length; i++){
            imageList[i]  = new ImageIcon(getClass().getResource("/images/"+imgfifty50[i]));
        }
        if(fifty50 <0) fifty50 =1;
        if(fifty50 >=0 && fifty50<imgfifty50.length){
            jLabel3.setIcon(imageList[fifty50]);
            fifty50++;
        }
            if(callQuestion == 1 && jLabel3.isFocusable()){                
                jTextField3.setForeground(BLACK);
                jTextField4.setForeground(BLACK);
              }else if(callQuestion == 2 && jLabel3.isFocusable()){
                jTextField2.setForeground(BLACK);
                jTextField4.setForeground(BLACK);
              }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        if(callQuestion == 1 && jTextField2.isFocusable())
        {
            jTextField2.setOpaque(true);
             jTextField2.setForeground(Color.BLACK);
             jTextField2.setBackground(Color.green);
             
            jTextField3.setOpaque(true);
             jTextField3.setForeground(Color.WHITE);
             jTextField3.setBackground(Color.BLACK);
             
            jTextField4.setOpaque(true);
             jTextField4.setForeground(Color.WHITE);
             jTextField4.setBackground(Color.BLACK); 
             
            jTextField2.setOpaque(true);
             jTextField2.setForeground(Color.WHITE);
             jTextField2.setBackground(Color.BLACK);
             
             ImageIcon[] imageList = new ImageIcon[1];
        for(int i=0; i<imageList.length; i++){
            imageList[i]  = new ImageIcon(getClass().getResource("/images/"+imgcorrect1[i]));
        }
        if(correct1 <0) correct1 =1;
        if(correct1 >=0 && correct1<imgcorrect1.length){
            jLabel5.setIcon(imageList[correct1]);
            correct1++;
            }
        }
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(millionaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(millionaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(millionaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(millionaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new millionaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
