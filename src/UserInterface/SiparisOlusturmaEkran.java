
package UserInterface;

import DomainModel.Kayitci;
import DomainModel.UrunDesc;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import javax.swing.DefaultComboBoxModel;


public class SiparisOlusturmaEkran extends javax.swing.JFrame {

    Kayitci register = MainCenter.kayitci;
    
    DefaultComboBoxModel<String> modelCorbalar,modelAnaYemekler,modelTatlilar,modelIcecekler,modelIzgaralar,modelSalatalar;
    String[] urunler,corbalar,anayemekler,tatlilar,icecekler,izgaralar,salatalar;
    
    public SiparisOlusturmaEkran() {        
        urunleriAl();   
        initComponents();           
        labelHosgeldiniz.setText("Hoşgeldiniz " + Musteri.musteri.getIsim() + " " + Musteri.musteri.getSoyisim());
        
        modelCorbalar = new DefaultComboBoxModel<>(corbalar);comboboxCorba.setModel(modelCorbalar);
        modelAnaYemekler = new DefaultComboBoxModel<>(anayemekler);comboboxAnaYemek.setModel(modelAnaYemekler);
        modelTatlilar = new DefaultComboBoxModel<>(tatlilar);comboboxTatli.setModel(modelTatlilar);
        modelIzgaralar = new DefaultComboBoxModel<>(izgaralar);comboboxIzgara.setModel(modelIzgaralar);
        modelSalatalar = new DefaultComboBoxModel<>(salatalar);comboboxSalata.setModel(modelSalatalar);
        modelIcecekler = new DefaultComboBoxModel<>(icecekler);comboboxIcecek.setModel(modelIcecekler);      
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHosgeldiniz = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboboxAnaYemek = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboboxIzgara = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        comboboxIcecek = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        comboboxSalata = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboboxTatli = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtCorba = new javax.swing.JTextField();
        btnSiparisSepeti = new javax.swing.JButton();
        comboboxCorba = new javax.swing.JComboBox();
        btnCorba = new javax.swing.JButton();
        btnYemek = new javax.swing.JButton();
        btnIzgara = new javax.swing.JButton();
        txtYemek = new javax.swing.JTextField();
        txtIzgara = new javax.swing.JTextField();
        txtTatli = new javax.swing.JTextField();
        txtSalata = new javax.swing.JTextField();
        txtIcecek = new javax.swing.JTextField();
        btnIcecek = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnSalata = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(300, 300));
        setType(java.awt.Window.Type.POPUP);

        labelHosgeldiniz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelHosgeldiniz.setForeground(new java.awt.Color(102, 102, 102));
        labelHosgeldiniz.setText("HOŞGELDİNİZ");

        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Lütfen sipariş vermek istediğiniz ürünleri seçiniz...");

        jLabel3.setText("ÇORBALAR");

        comboboxAnaYemek.setToolTipText("");

        jLabel4.setText("ANA YEMEKLER");

        jLabel5.setText("IZGARA");

        jLabel6.setText("İÇECEKLER");

        jLabel7.setText("SALATALAR");

        jLabel8.setText("TATLILAR");

        txtCorba.setText("Adet");
        txtCorba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorbaMouseClicked(evt);
            }
        });

        btnSiparisSepeti.setText("Sipariş Sepetine Git");

        btnCorba.setText("Ekle");
        btnCorba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorbaActionPerformed(evt);
            }
        });

        btnYemek.setText("Ekle");
        btnYemek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYemekActionPerformed(evt);
            }
        });

        btnIzgara.setText("Ekle");
        btnIzgara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzgaraActionPerformed(evt);
            }
        });

        txtYemek.setText("Adet");
        txtYemek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtYemekMouseClicked(evt);
            }
        });

        txtIzgara.setText("Adet");
        txtIzgara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIzgaraMouseClicked(evt);
            }
        });

        txtTatli.setText("Adet");
        txtTatli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTatliMouseClicked(evt);
            }
        });

        txtSalata.setText("Adet");
        txtSalata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSalataMouseClicked(evt);
            }
        });

        txtIcecek.setText("Adet");
        txtIcecek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIcecekMouseClicked(evt);
            }
        });

        btnIcecek.setText("Ekle");
        btnIcecek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIcecekActionPerformed(evt);
            }
        });

        jButton4.setText("Ekle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnSalata.setText("Ekle");
        btnSalata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelHosgeldiniz)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86))))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addGap(102, 102, 102)
                .addComponent(jLabel8)
                .addGap(86, 86, 86)
                .addComponent(jLabel7)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboboxCorba, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboboxIcecek, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtCorba, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnCorba))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(comboboxTatli, 0, 142, Short.MAX_VALUE)
                    .addComponent(comboboxAnaYemek, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtYemek, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnYemek)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(comboboxIzgara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(43, 43, 43))
                        .addComponent(comboboxSalata, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtIzgara, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIzgara)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIcecek, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIcecek)
                        .addGap(54, 54, 54)
                        .addComponent(txtTatli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSalata, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalata)
                        .addGap(4, 4, 4))
                    .addComponent(btnSiparisSepeti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCorba, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelHosgeldiniz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboboxAnaYemek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboboxCorba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboboxIzgara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnYemek, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIzgara, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYemek, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIzgara, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(comboboxSalata, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboboxTatli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboboxIcecek, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIcecek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIcecek, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTatli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSalata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalata, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnSiparisSepeti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCorbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorbaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCorbaActionPerformed

    private void btnYemekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYemekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnYemekActionPerformed

    private void btnIzgaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzgaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIzgaraActionPerformed

    private void btnIcecekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIcecekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIcecekActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSalataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalataActionPerformed

    private void txtCorbaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorbaMouseClicked
        txtCorba.setText("");
    }//GEN-LAST:event_txtCorbaMouseClicked

    private void txtYemekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtYemekMouseClicked
        txtYemek.setText("");
    }//GEN-LAST:event_txtYemekMouseClicked

    private void txtIzgaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIzgaraMouseClicked
        txtIzgara.setText("");
    }//GEN-LAST:event_txtIzgaraMouseClicked

    private void txtIcecekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIcecekMouseClicked
        txtIcecek.setText("");
    }//GEN-LAST:event_txtIcecekMouseClicked

    private void txtTatliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTatliMouseClicked
        txtTatli.setText("");
    }//GEN-LAST:event_txtTatliMouseClicked

    private void txtSalataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalataMouseClicked
        txtSalata.setText("");
    }//GEN-LAST:event_txtSalataMouseClicked
    

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparisOlusturmaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorba;
    private javax.swing.JButton btnIcecek;
    private javax.swing.JButton btnIzgara;
    private javax.swing.JButton btnSalata;
    private javax.swing.JButton btnSiparisSepeti;
    private javax.swing.JButton btnYemek;
    private javax.swing.JComboBox comboboxAnaYemek;
    private javax.swing.JComboBox comboboxCorba;
    private javax.swing.JComboBox comboboxIcecek;
    private javax.swing.JComboBox comboboxIzgara;
    private javax.swing.JComboBox comboboxSalata;
    private javax.swing.JComboBox comboboxTatli;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelHosgeldiniz;
    private javax.swing.JTextField txtCorba;
    private javax.swing.JTextField txtIcecek;
    private javax.swing.JTextField txtIzgara;
    private javax.swing.JTextField txtSalata;
    private javax.swing.JTextField txtTatli;
    private javax.swing.JTextField txtYemek;
    // End of variables declaration//GEN-END:variables
    
    private void urunleriAl() {
        urunler = new String[register.urunKatalog.get_urun_descs().size()];
        corbalar = new String[5];anayemekler = new String[5];salatalar = new String[5];
        tatlilar = new String[5];izgaralar = new String[5];icecekler = new String[5];
        UrunDesc ud;
        int a=0,b=0,c=0,d=0,e=0,f=0;
        for(int i = 0;i<urunler.length;i++) {
            ud = register.urunKatalog.get_urun_descs().get(i);
            if(ud.getUrunTuru().equals("Çorba"))
            {    corbalar[a] = ud.getUrunAdi()+ " " + ud.getUrunFiyati()+"TL";a++;}  
            if(ud.getUrunTuru()=="Tatlı")
            {    tatlilar[b] = ud.getUrunAdi()+ " " + ud.getUrunFiyati()+"TL";b++;}
            if(ud.getUrunTuru()=="Anayemek")
            {    anayemekler[c] = ud.getUrunAdi()+ " " + ud.getUrunFiyati()+"TL";c++;}
            if(ud.getUrunTuru()=="Izgara")
            {   izgaralar[d] = ud.getUrunAdi()+ " " + ud.getUrunFiyati()+"TL";d++;}
            if(ud.getUrunTuru()=="Salata")
            {   salatalar[e] = ud.getUrunAdi()+ " " + ud.getUrunFiyati()+"TL";e++;}            
            if(ud.getUrunTuru()=="İçecek")
            {    icecekler[f] = ud.getUrunAdi()+ " " + ud.getUrunFiyati()+"TL";f++;}
                
            
        }
    }

}

