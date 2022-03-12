/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Dimension;
import java.io.File;
import java.sql.Connection;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JFrame {
    

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
          this.setExtendedState(this.MAXIMIZED_BOTH);
          
        tanggal_jam_sekarang();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new DesktopPaneBackgorund();
        jlb = new javax.swing.JLabel();
        jlb2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jBr = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jSp = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jlb.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb.setForeground(new java.awt.Color(255, 51, 0));

        jlb2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb2.setForeground(new java.awt.Color(255, 51, 0));

        menu.setLayer(jlb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menu.setLayer(jlb2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb2)
                    .addComponent(jlb))
                .addContainerGap(864, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlb)
                .addGap(18, 18, 18)
                .addComponent(jlb2)
                .addContainerGap(942, Short.MAX_VALUE))
        );

        getContentPane().add(menu, java.awt.BorderLayout.PAGE_START);

        jMenuBar1.setMaximumSize(new java.awt.Dimension(2147773, 2147773));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_file_submodule_20px.png"))); // NOI18N
        jMenu1.setText("File ||");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_door_sensor_alarmed_20px.png"))); // NOI18N
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_data_recovery_20px.png"))); // NOI18N
        jMenu2.setText("Data Master ||");

        jBr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_product_20px.png"))); // NOI18N
        jBr.setText("Barang");
        jBr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrActionPerformed(evt);
            }
        });
        jMenu2.add(jBr);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_supplier_20px.png"))); // NOI18N
        jMenuItem5.setText("Supplier");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_rent_20px.png"))); // NOI18N
        jMenu5.setText("Transaksi ||");

        jSp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_product_20px.png"))); // NOI18N
        jSp.setText("Pembelian Barang");
        jSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpActionPerformed(evt);
            }
        });
        jMenu5.add(jSp);

        jMenuBar1.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_profit_report_20px.png"))); // NOI18N
        jMenu3.setText("Cetak Laporan ||");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_printer_20px_1.png"))); // NOI18N
        jMenuItem2.setText("Cetak Laporan Barang");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_printer_20px_1.png"))); // NOI18N
        jMenuItem4.setText("Cetak Laporan Pembelian Barang");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_printer_20px_1.png"))); // NOI18N
        jMenuItem6.setText("Cetak Laporan Supplier");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_administrative_tools_20px.png"))); // NOI18N
        jMenu4.setText("Data Admin ||");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_user_group_woman_man_20px.png"))); // NOI18N
        jMenuItem3.setText("Kelola Admin");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleParent(jMenu1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
  
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jBrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrActionPerformed
        Barang Barang = new Barang();
        menu.add(Barang);
        Dimension desktopSize = menu.getSize();
        Dimension jInternalFrame = Barang.getSize();        
        Barang.setLocation((desktopSize.width - jInternalFrame.width)/2,(desktopSize.height - jInternalFrame.height)/2);
        Barang.setVisible(true);
    }//GEN-LAST:event_jBrActionPerformed

    private void jSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpActionPerformed
        Pembelian_barang Pembelian_barang = new Pembelian_barang();
        menu.add( Pembelian_barang);
        Dimension desktopSize = menu.getSize();
        Dimension jInternalFrame = Pembelian_barang.getSize();        
         Pembelian_barang.setLocation((desktopSize.width - jInternalFrame.width)/2,(desktopSize.height - jInternalFrame.height)/2);
        Pembelian_barang.setVisible(true);
    }//GEN-LAST:event_jSpActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          int confirm = JOptionPane.showOptionDialog(
             null, "Are You Sure to Close Application?", 
             "Exit Confirmation", JOptionPane.YES_NO_OPTION, 
             JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == 0) {
           System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      CetakBarang barang = new CetakBarang();
     menu.add(barang);
     barang.setVisible(true); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
     
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
regist_admin regist_admin= new regist_admin();
     menu.add(regist_admin);
     Dimension desktopSize = menu.getSize();
     Dimension jInternalFrame = regist_admin.getSize();        
     regist_admin.setLocation((desktopSize.width - jInternalFrame.width)/2,(desktopSize.height - jInternalFrame.height)/2);
     regist_admin.setVisible(true);      
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      CetakPembelian pembelian = new CetakPembelian();
     menu.add(pembelian);
     pembelian.setVisible(true);    
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    Supplier Supplier = new Supplier();
     menu.add(Supplier);
     Dimension desktopSize = menu.getSize();
     Dimension jInternalFrame = Supplier.getSize();        
     Supplier.setLocation((desktopSize.width - jInternalFrame.width)/2,(desktopSize.height - jInternalFrame.height)/2);
     Supplier.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        CetakSupplier supplier = new CetakSupplier();
     menu.add(supplier);
     supplier.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
public void tanggal_jam_sekarang(){
        Thread p=new Thread(){
            public void run(){
                for(;;){
                Calendar cal = new GregorianCalendar();
                int hari = cal.get(Calendar.DAY_OF_MONTH);
                int bulan = cal.get(Calendar.MONTH);
                int tahun = cal.get(Calendar.YEAR);
                jlb.setText(hari+"/"+(bulan+1)+"/"+tahun);
                int jam = cal.get(Calendar.HOUR);
                int menit = cal.get(Calendar.MINUTE);
                int detik = cal.get(Calendar.SECOND);
                int AM_PM = cal.get(Calendar.AM_PM);
                String day_night = "";
                if (AM_PM == 1) { day_night = "PM"; } 
                else { day_night = "AM"; }
                String waktu1 = jam+":"+menit+":"+detik+""+day_night;
                jlb2.setText(waktu1);
                try{ sleep(1000); }
                catch(InterruptedException ex){
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex); } 
                } } }; p.start(); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jBr;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jSp;
    private javax.swing.JLabel jlb;
    private javax.swing.JLabel jlb2;
    private javax.swing.JDesktopPane menu;
    // End of variables declaration//GEN-END:variables
}
