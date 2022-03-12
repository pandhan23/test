/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
/**
 *
 * @author HP
 */
public class Pembeli extends javax.swing.JInternalFrame {
private Connection kon = new Koneksi().connect();
private DefaultTableModel tabmode;
public void kode_pembeli(){
      String kode="PB-000";
      int i=0;
    try{
        
        Connection kon=DriverManager.getConnection("jdbc:mysql://localhost:3306/penjualan_makanan","root","");
        Statement stat = kon.createStatement();
        ResultSet rs = stat.executeQuery("select id_pembeli from pembeli");
        
        while(rs.next()){
            kode = rs.getString("id_pembeli");
        }
        kode = kode.substring(4);
        i = Integer.parseInt(kode)+1;
        kode = "00"+i;
        kode = "PB-"+kode.substring(kode.length()-3);
        tPb.setText(kode);
       
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
        
    }
    /**
     * Creates new form Pembeli
     */
    public Pembeli() {
        initComponents();
        datatable();
        kode_pembeli();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
    }
    
    protected void datatable() {
        Object[] Baris ={"id_pembeli","nama_pembeli","jk","no_telp","alamat"};
        tabmode = new DefaultTableModel(null, Baris);
        tabell1.setModel(tabmode);
        String sql = "select * from pembeli"; 
        try {
            java.sql.Statement stat = kon.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("id_pembeli");
                String b = hasil.getString("nama_pembeli");
                String c = hasil.getString("jk");
                
                String d = hasil.getString("no_telp");
                String e = hasil.getString("alamat");
              String[] data={a,b,c,d,e};
                tabmode.addRow(data);
            }
        } catch (Exception e){}
    }
     protected void cari(){
        Object[] Baris ={"id_pembeli","nama_pembeli","jk","no_telp","alamat"};
        tabmode = new DefaultTableModel(null, Baris);
        tabell1.setModel(tabmode);
        try {
        String sql = "select * from pembeli"
                + " WHERE nama_pembeli LIKE '%" + jSc.getText() + "%' OR nama_pembeli LIKE '" + jSc.getText() + "%' OR nama_pembeli LIKE '%" + jSc.getText() + "'"
                + " ORDER BY id_pembeli ASC";
            PreparedStatement pst = kon.prepareStatement(sql);
//            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = pst.executeQuery(sql);
            while(hasil.next()){
               String a = hasil.getString("id_pembeli");
                String b = hasil.getString("nama_pembeli");
                String c = hasil.getString("jk");
              
                String d = hasil.getString("no_telp");
                String e = hasil.getString("alamat");
              String[] data={a,b,c,d,e};
                tabmode.addRow(data);
            }
        } catch (Exception e){
        JOptionPane.showMessageDialog(null,e);}
    }
    
    public void aktif() {
        tPb.setEnabled(true);
        tNm.setEnabled(true);
        jLk.setEnabled(true);
        jPr.setEnabled(true);
     
       tNo.setEnabled(true);
        tAl.setEnabled(true);
    }
    
    public void kosong() {
        tPb.setText("");
        tNm.setText("");
        bJk.clearSelection();
        bM.clearSelection();
        tNo.setText("");
        tAl.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bJk = new javax.swing.ButtonGroup();
        bM = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tPb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tNm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLk = new javax.swing.JRadioButton();
        jPr = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAl = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bTb = new javax.swing.JButton();
        jHp = new javax.swing.JButton();
        jRs = new javax.swing.JButton();
        bEd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabell1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Pembeli");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_ticket_purchase_20px.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Id_Pembeli");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Kelamin");

        bJk.add(jLk);
        jLk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLk.setText("Laki-Laki");

        bJk.add(jPr);
        jPr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPr.setText("Perempuan");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("No.Telepon");

        tAl.setColumns(20);
        tAl.setRows(5);
        jScrollPane1.setViewportView(tAl);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Alamat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tNm, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(tPb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLk)
                        .addGap(47, 47, 47)
                        .addComponent(jPr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tNo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tPb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tNm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLk)
                            .addComponent(jPr)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Navigasi"));

        bTb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_save_close_20px_5.png"))); // NOI18N
        bTb.setText("Simpan");
        bTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTbActionPerformed(evt);
            }
        });

        jHp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_folder_20px_1.png"))); // NOI18N
        jHp.setText("Delete");
        jHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHpActionPerformed(evt);
            }
        });

        jRs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_synchronize_20px_1.png"))); // NOI18N
        jRs.setText("Reset");
        jRs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRsActionPerformed(evt);
            }
        });

        bEd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_file_20px.png"))); // NOI18N
        bEd.setText("Edit");
        bEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bTb)
                .addGap(32, 32, 32)
                .addComponent(bEd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jHp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jRs)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTb)
                    .addComponent(bEd)
                    .addComponent(jHp)
                    .addComponent(jRs))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Tabel"));

        tabell1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabell1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabell1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabell1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jSc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jScActionPerformed(evt);
            }
        });
        jSc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jScKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Cari Nama Pembeli");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSc, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_user_group_woman_man_80px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Californian FB", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("  Form Data Pembeli");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getAccessibleContext().setAccessibleName("Data Pembeli");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTbActionPerformed
String sql = "insert into pembeli (id_pembeli,nama_pembeli,jk,no_telp,alamat) values (?,?,?,?,?)";
        try {
            PreparedStatement stat = kon.prepareStatement(sql);
            
            stat.setString(1, tPb.getText());
            stat.setString(2, tNm.getText());
            String jk="";
            if(jLk.isSelected()) jk="Laki-laki";
            else jk="Perempuan";
            stat.setString(3, jk);
             
            stat.setString(4, tNo.getText());
            stat.setString(5, tAl.getText());
            
            stat.executeUpdate();
            kosong();
            kode_pembeli();
            datatable();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
           
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
    }//GEN-LAST:event_bTbActionPerformed

    private void bEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEdActionPerformed
    String sql = "update pembeli set nama_pembeli=?, jk=?, no_telp=?, alamat=? where id_pembeli=?";
    try {
            PreparedStatement stat = kon.prepareStatement(sql);
            
        
            stat.setString(1, tNm.getText());
            String jk="";
            if(jLk.isSelected()) jk="Laki-laki";
            else jk="Perempuan";
            stat.setString(2, jk);
             
            
            stat.setString(3, tNo.getText());
            stat.setString(4, tAl.getText());  
           stat.setString(5, tPb.getText());
            stat.executeUpdate();
            kosong();
            kode_pembeli();
            datatable();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
           
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah"+e);
        }
    
    }//GEN-LAST:event_bEdActionPerformed

    private void tabell1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabell1MouseClicked
 int bar = tabell1.getSelectedRow();
      String a = tabmode.getValueAt (bar, 0) .toString();
      String b = tabmode.getValueAt (bar, 1) .toString();
      String c = tabmode.getValueAt (bar, 2) .toString();
      String d = tabmode.getValueAt (bar, 3) .toString();
      String e = tabmode.getValueAt (bar, 4) .toString();
      
      tPb.setText(a);
      tNm.setText(b);
      if(c.equals("Laki-laki")) {jLk.setSelected(true); jPr.setSelected(false);}
       else {jLk.setSelected(false); jPr.setSelected(true);}
   
      tNo.setText(d);
      tAl.setText(e);
    }//GEN-LAST:event_tabell1MouseClicked

    private void jHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHpActionPerformed
    int ok = JOptionPane.showConfirmDialog(null, "Yakin untuk di hapus ?","Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
       if (ok==0){
           String sql = "delete from pembeli where id_pembeli ='"+tPb.getText()+"'";
           try {
               PreparedStatement stat = kon.prepareStatement(sql);
               stat.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
               datatable();
               kode_pembeli();
               kosong();
               
           }catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
           }
       }
    }//GEN-LAST:event_jHpActionPerformed

    private void jRsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRsActionPerformed
kosong();
    }//GEN-LAST:event_jRsActionPerformed

    private void jScKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScKeyReleased
cari();
    }//GEN-LAST:event_jScKeyReleased

    private void jScActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jScActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jScActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEd;
    private javax.swing.ButtonGroup bJk;
    private javax.swing.ButtonGroup bM;
    private javax.swing.JButton bTb;
    private javax.swing.JButton jHp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jLk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jPr;
    private javax.swing.JButton jRs;
    private javax.swing.JTextField jSc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tAl;
    private javax.swing.JTextField tNm;
    private javax.swing.JTextField tNo;
    private javax.swing.JTextField tPb;
    private javax.swing.JTable tabell1;
    // End of variables declaration//GEN-END:variables
}
