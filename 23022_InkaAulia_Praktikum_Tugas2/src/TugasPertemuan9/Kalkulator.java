/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TugasPertemuan9;

/**
 *
 * @author inkaa
 */
public class Kalkulator extends javax.swing.JFrame {
    String bilangan;
    double int1, int2, hasil;
    int operasi;

    public Kalkulator() {
        initComponents();
        bilangan = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tampil = new javax.swing.JTextField();
        tmbdot = new javax.swing.JButton();
        tmb0 = new javax.swing.JButton();
        tmbClear = new javax.swing.JButton();
        tmb1 = new javax.swing.JButton();
        tmb2 = new javax.swing.JButton();
        tmb3 = new javax.swing.JButton();
        tmb4 = new javax.swing.JButton();
        tmb5 = new javax.swing.JButton();
        tmb6 = new javax.swing.JButton();
        tmb7 = new javax.swing.JButton();
        tmb8 = new javax.swing.JButton();
        tmb9 = new javax.swing.JButton();
        tmbHapus = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        tmbMinus = new javax.swing.JButton();
        tmbKali = new javax.swing.JButton();
        tmbPlus = new javax.swing.JButton();
        tmbBagi = new javax.swing.JButton();
        tmbPersen = new javax.swing.JButton();
        tmbE = new javax.swing.JButton();
        tmbSamaDengan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tampil.setEditable(false);
        tampil.setBackground(new java.awt.Color(255, 153, 153));
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });

        tmbdot.setText(".");
        tmbdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbdotActionPerformed(evt);
            }
        });

        tmb0.setText("0");
        tmb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmb0ActionPerformed(evt);
            }
        });

        tmbClear.setText("C");
        tmbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbClearActionPerformed(evt);
            }
        });

        tmb1.setText("1");
        tmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmb1ActionPerformed(evt);
            }
        });

        tmb2.setText("2");
        tmb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmb2ActionPerformed(evt);
            }
        });

        tmb3.setText("3");
        tmb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmb3ActionPerformed(evt);
            }
        });

        tmb4.setText("4");
        tmb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmb4ActionPerformed(evt);
            }
        });

        tmb5.setText("5");
        tmb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmb5ActionPerformed(evt);
            }
        });

        tmb6.setText("6");
        tmb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmb6ActionPerformed(evt);
            }
        });

        tmb7.setText("7");
        tmb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmb7ActionPerformed(evt);
            }
        });

        tmb8.setText("8");
        tmb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmb8ActionPerformed(evt);
            }
        });

        tmb9.setText("9");
        tmb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmb9ActionPerformed(evt);
            }
        });

        tmbHapus.setText("B");
        tmbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbHapusActionPerformed(evt);
            }
        });

        jButton14.setText("jButton14");

        tmbMinus.setText("-");
        tmbMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbMinusActionPerformed(evt);
            }
        });

        tmbKali.setText("*");
        tmbKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbKaliActionPerformed(evt);
            }
        });

        tmbPlus.setText("+");
        tmbPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbPlusActionPerformed(evt);
            }
        });

        tmbBagi.setText("/");
        tmbBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbBagiActionPerformed(evt);
            }
        });

        tmbPersen.setText("%");
        tmbPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbPersenActionPerformed(evt);
            }
        });

        tmbE.setText("E");
        tmbE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbEActionPerformed(evt);
            }
        });

        tmbSamaDengan.setText("=");
        tmbSamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbSamaDenganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tmb1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(tmbdot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tmb2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(tmb0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tmbClear, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(tmb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tmbPlus, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(tmbKali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tmbSamaDengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tmbPersen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tmbBagi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tmbMinus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tmbHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tmbE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tampil, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tmb4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tmb7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tmb8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tmb5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tmb6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tmb9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(tampil, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(tmb7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tmb4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tmbMinus)
                                    .addComponent(tmbPlus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tmbKali)
                                    .addComponent(tmbBagi)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tmb9)
                                    .addComponent(tmb8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tmb6)
                                    .addComponent(tmb5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tmb2)
                            .addComponent(tmb1)
                            .addComponent(tmb3)
                            .addComponent(tmbSamaDengan)
                            .addComponent(tmbPersen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tmbdot)
                            .addComponent(tmb0)
                            .addComponent(tmbClear)
                            .addComponent(tmbHapus)
                            .addComponent(tmbE))))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmb2ActionPerformed
        bilangan +="2";
        tampil.setText(bilangan);
    }//GEN-LAST:event_tmb2ActionPerformed

    private void tmb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmb9ActionPerformed
        // TODO add your handling code here:
        bilangan +="9";
        tampil.setText(bilangan);        
    }//GEN-LAST:event_tmb9ActionPerformed

    private void tmbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbHapusActionPerformed
        // TODO add your handling code here:
        String teks = tampil.getText();
        if (teks.length()>0){
            String teksBaru = teks.substring(0, teks.length()-1);
            bilangan = teks;
            if (teksBaru.isEmpty()){
                tampil.setText("");
                bilangan = "";
            }
            else{
                tampil.setText(teksBaru);
            }
        }
    }//GEN-LAST:event_tmbHapusActionPerformed

    private void tmbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbClearActionPerformed
        // TODO add your handling code here:
        tampil.setText("");
        int1 = 0;
        int2 = 0;
        hasil = 0;
    }//GEN-LAST:event_tmbClearActionPerformed

    private void tmb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmb0ActionPerformed
        bilangan +="0";
        tampil.setText(bilangan);
    }//GEN-LAST:event_tmb0ActionPerformed

    private void tmb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmb7ActionPerformed
        // TODO add your handling code here:
        bilangan +="7";
        tampil.setText(bilangan);
    }//GEN-LAST:event_tmb7ActionPerformed

    private void tmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmb1ActionPerformed
        // TODO add your handling code here:
        bilangan +="1";
        tampil.setText(bilangan);
    }//GEN-LAST:event_tmb1ActionPerformed

    private void tmb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmb4ActionPerformed
        bilangan +="4";
        tampil.setText(bilangan);        // TODO add your handling code here:
    }//GEN-LAST:event_tmb4ActionPerformed

    private void tmb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmb8ActionPerformed
        bilangan +="8";
        tampil.setText(bilangan);        // TODO add your handling code here:
    }//GEN-LAST:event_tmb8ActionPerformed

    private void tmb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmb6ActionPerformed
        bilangan +="6";
        tampil.setText(bilangan);        // TODO add your handling code here:
    }//GEN-LAST:event_tmb6ActionPerformed

    private void tmb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmb3ActionPerformed
        bilangan +="3";
        tampil.setText(bilangan);        // TODO add your handling code here:
    }//GEN-LAST:event_tmb3ActionPerformed

    private void tmb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmb5ActionPerformed
        bilangan +="5";
        tampil.setText(bilangan);        // TODO add your handling code here:
    }//GEN-LAST:event_tmb5ActionPerformed

    private void tmbPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbPlusActionPerformed
        // TODO add your handling code here:
        int1 = Double.parseDouble(bilangan);
        tampil.setText("+");
        bilangan = "";
        operasi=1;
    }//GEN-LAST:event_tmbPlusActionPerformed

    private void tmbMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbMinusActionPerformed
        // TODO add your handling code here:
        int1 = Double.parseDouble(bilangan);
        tampil.setText("-");
        bilangan = "";
        operasi=2;
    }//GEN-LAST:event_tmbMinusActionPerformed

    private void tmbKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbKaliActionPerformed
        // TODO add your handling code here:
        int1 = Double.parseDouble(bilangan);
        tampil.setText("*");
        bilangan = "";
        operasi=3;
    }//GEN-LAST:event_tmbKaliActionPerformed

    private void tmbBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbBagiActionPerformed
        // TODO add your handling code here:
        int1 = Double.parseDouble(bilangan);
        tampil.setText("/");
        bilangan = "";
        operasi=4;
    }//GEN-LAST:event_tmbBagiActionPerformed

    private void tmbPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbPersenActionPerformed
        // TODO add your handling code here:
        int1 = Double.parseDouble(bilangan);
        tampil.setText("%");
        bilangan = "";
        operasi=5;
    }//GEN-LAST:event_tmbPersenActionPerformed

    private void tmbSamaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbSamaDenganActionPerformed
        // TODO add your handling code here:
        if (operasi == 1){
            int2 = Double.parseDouble(bilangan);
            hasil = int1 + int2;
            bilangan = Double.toString(hasil);
            tampil.setText(bilangan);
        }
        else if (operasi == 2){
            int2 = Double.parseDouble(bilangan);
            hasil = int1 - int2;
            bilangan = Double.toString(hasil);
            tampil.setText(bilangan);
        }
        else if (operasi == 3){
            int2 = Double.parseDouble(bilangan);
            hasil = int1 * int2;
            bilangan = Double.toString(hasil);
            tampil.setText(bilangan);
        }
        else if (operasi == 4){
            int2 = Double.parseDouble(bilangan);
            hasil = int1 / int2;
            bilangan = Double.toString(hasil);
            tampil.setText(bilangan);
        }
        else if (operasi == 5){
            int2 = Double.parseDouble(bilangan);
            hasil = int1 % int2;
            bilangan = Double.toString(hasil);
            tampil.setText(bilangan);
        }
        
    }//GEN-LAST:event_tmbSamaDenganActionPerformed

    private void tmbEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbEActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tmbEActionPerformed

    private void tmbdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbdotActionPerformed
        // TODO add your handling code here:
        bilangan +=".";
        tampil.setText(bilangan); 
    }//GEN-LAST:event_tmbdotActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tampilActionPerformed
    
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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton14;
    private javax.swing.JTextField tampil;
    private javax.swing.JButton tmb0;
    private javax.swing.JButton tmb1;
    private javax.swing.JButton tmb2;
    private javax.swing.JButton tmb3;
    private javax.swing.JButton tmb4;
    private javax.swing.JButton tmb5;
    private javax.swing.JButton tmb6;
    private javax.swing.JButton tmb7;
    private javax.swing.JButton tmb8;
    private javax.swing.JButton tmb9;
    private javax.swing.JButton tmbBagi;
    private javax.swing.JButton tmbClear;
    private javax.swing.JButton tmbE;
    private javax.swing.JButton tmbHapus;
    private javax.swing.JButton tmbKali;
    private javax.swing.JButton tmbMinus;
    private javax.swing.JButton tmbPersen;
    private javax.swing.JButton tmbPlus;
    private javax.swing.JButton tmbSamaDengan;
    private javax.swing.JButton tmbdot;
    // End of variables declaration//GEN-END:variables
}
