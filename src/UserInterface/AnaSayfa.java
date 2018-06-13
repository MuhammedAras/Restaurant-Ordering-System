
package UserInterface;

/**
 *
 * @author Bazz
 */
public class AnaSayfa extends javax.swing.JFrame {

    
    public AnaSayfa() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRezervasyonYapma = new javax.swing.JButton();
        btnSiparisHazirlama = new javax.swing.JButton();
        btnSiparisOlusturma = new javax.swing.JButton();
        btnYetkiliIslemleri = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnRezervasyonYapma.setText("Rezervasyon Yapma");
        btnRezervasyonYapma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRezervasyonYapmaActionPerformed(evt);
            }
        });

        btnSiparisHazirlama.setText("Sipariş Hazırlama");
        btnSiparisHazirlama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiparisHazirlamaActionPerformed(evt);
            }
        });

        btnSiparisOlusturma.setText("Sipariş Oluşturma");
        btnSiparisOlusturma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiparisOlusturmaActionPerformed(evt);
            }
        });

        btnYetkiliIslemleri.setText("Yönetici İşlemleri");
        btnYetkiliIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYetkiliIslemleriActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("LOKANTA SİPARİŞ SİSTEMİ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSiparisOlusturma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSiparisHazirlama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRezervasyonYapma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnYetkiliIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnSiparisOlusturma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnRezervasyonYapma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSiparisHazirlama, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnYetkiliIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRezervasyonYapmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRezervasyonYapmaActionPerformed
        new SiparisOlusturmaEkran().setVisible(true);        
    }//GEN-LAST:event_btnRezervasyonYapmaActionPerformed

    private void btnSiparisHazirlamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiparisHazirlamaActionPerformed
        
    }//GEN-LAST:event_btnSiparisHazirlamaActionPerformed

    private void btnSiparisOlusturmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiparisOlusturmaActionPerformed
       if(Musteri.login) {
            new SiparisOlusturmaEkran().setVisible(true);
        }else {
            new MusteriGiris().setVisible(true);
        }
    }//GEN-LAST:event_btnSiparisOlusturmaActionPerformed

    private void btnYetkiliIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYetkiliIslemleriActionPerformed
        
    }//GEN-LAST:event_btnYetkiliIslemleriActionPerformed

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
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaSayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRezervasyonYapma;
    private javax.swing.JButton btnSiparisHazirlama;
    private javax.swing.JButton btnSiparisOlusturma;
    private javax.swing.JButton btnYetkiliIslemleri;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
