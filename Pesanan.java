/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package basisdatagemink;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Rama
 */
public class Pesanan extends javax.swing.JFrame {

    /**
     * Creates new form Pesanan
     */
    
    Connection conn = Connect.Connection();
    
    String kosong = "-";
    public Pesanan() {
        initComponents();
        setLocationRelativeTo(null);
        table();
        table2();
        Kosongkan_Form();
        Kosongkan_Form2();
    }
    
    public static JasperReport getJasperReport() throws FileNotFoundException, JRException {
        File template = Paths.get("Jasper/Pesanan2.jrxml").toFile();
        return JasperCompileManager.compileReport(template.getAbsolutePath());
    }
    
    public void search(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Pesanan");
        tbl.addColumn("Tanggal Pesanan");
        tbl.addColumn("Tanggal Pengiriman");
        tbl.addColumn("ID Pembayaran");
        tbl.addColumn("ID Pembeli");
        tbl.addColumn("ID Delivery Boy");
        tbl.addColumn("ID Pegawai");
        tbl.addColumn("ID Member");
        
        try{
            String sql = "SELECT *  FROM Pesanan WHERE Id_pesanan like '%"+txtCari.getText()+"%' OR Tanggal_pesanan like '%"+txtCari.getText()+"%' OR Tanggal_pengiriman like '%"+txtCari.getText()+"%' OR Id_pembayaran like '%"+txtCari.getText()+"%' OR Id_pembeli like '%"+txtCari.getText()+"%' OR Id_dboy like '%"+txtCari.getText()+"%' OR Id_pegawai like '%"+txtCari.getText()+"%' OR Id_member like '%"+txtCari.getText()+"%'";
            Connection con = (Connection)Connect.Connection();
            java.sql.ResultSet as = con.createStatement().executeQuery(sql);
            
            while(as.next()){
                tbl.addRow(new Object[] {
                    as.getString("Id_pesanan"),
                    as.getString("Tanggal_pesanan"),
                    as.getString("Tanggal_pengiriman"),
                    as.getString("Id_pembayaran"),
                    as.getString("Id_pembeli"),
                    as.getString("Id_dboy"),
                    as.getString("Id_pegawai"),
                    as.getString("Id_member")
                });
                tblPesanan.setModel(tbl);
            }
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditemukan");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }
    
    public void search2(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("ID Pesanan");
        tbl.addColumn("ID Produk");
        
        try{
            String sql = "SELECT *  FROM Id_produk_Pesanan WHERE Id_produk_Pesanan like '%"+txtCari2.getText()+"%' OR Id_produk like '%"+txtCari2.getText()+"%'";
            Connection con = (Connection)Connect.Connection();
            java.sql.ResultSet as = con.createStatement().executeQuery(sql);
            
            while(as.next()){
                tbl.addRow(new Object[] {
                    as.getString("ID"),
                    as.getString("Id_produk_Pesanan"),
                    as.getString("Id_produk")
                });
                tblPesanan2.setModel(tbl);
            }
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditemukan");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }
    public void Kosongkan_Form(){
        txtIdpesanan.setText(null);
        txtTanggalpesanan.setText(null);
        txtTanggalpengiriman.setText(null);
        txtIdpembayaran.setText(null);
        txtIdpembeli.setText(null);
        txtIddboy.setText(null);
        txtIdpegawai.setText(null);
        txtIdmember.setText(null);
    }
    
    public void Kosongkan_Form2(){
        txtIdpesanan2.setText(null);
        txtIdproduk2.setText(null);
        txtID.setText(null);
    }
    
    public void table(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Pesanan");
        tbl.addColumn("Tanggal Pesanan");
        tbl.addColumn("Tanggal Pengiriman");
        tbl.addColumn("ID Pembayaran");
        tbl.addColumn("ID Pembeli");
        tbl.addColumn("ID Delivery Boy");
        tbl.addColumn("ID Pegawai");
        tbl.addColumn("ID Member");
        
        try {
            String sql = "SELECT * FROM Pesanan";
            java.sql.Connection con = (Connection)Connect.Connection();
            java.sql.ResultSet as = con.createStatement().executeQuery(sql);
            
            while(as.next()){
                tbl.addRow(new Object[] {
                    as.getString("Id_pesanan"),
                    as.getString("Tanggal_pesanan"),
                    as.getString("Tanggal_pengiriman"),
                    as.getString("Id_pembayaran"),
                    as.getString("Id_pembeli"),
                    as.getString("Id_dboy"),
                    as.getString("Id_pegawai"),
                    as.getString("Id_member")
                });
                tblPesanan.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }
    
    public void table2(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("ID Pesanan");
        tbl.addColumn("ID Produk");
        
        try {
            String sql = "SELECT * FROM Id_produk_Pesanan";
            java.sql.Connection con = (Connection)Connect.Connection();
            java.sql.ResultSet as = con.createStatement().executeQuery(sql);
            
            while(as.next()){
                tbl.addRow(new Object[] {
                    as.getString("ID"),
                    as.getString("Id_produk_Pesanan"),
                    as.getString("Id_produk")
                });
                tblPesanan2.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesanan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdpesanan = new javax.swing.JTextField();
        txtTanggalpesanan = new javax.swing.JTextField();
        txtTanggalpengiriman = new javax.swing.JTextField();
        txtIdpembayaran = new javax.swing.JTextField();
        txtIdpembeli = new javax.swing.JTextField();
        txtIddboy = new javax.swing.JTextField();
        txtIdpegawai = new javax.swing.JTextField();
        txtIdmember = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnTampilkan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPesanan2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtIdpesanan2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIdproduk2 = new javax.swing.JTextField();
        btnSubmit2 = new javax.swing.JButton();
        btnTampilkan2 = new javax.swing.JButton();
        btnEdit2 = new javax.swing.JButton();
        btnHapus2 = new javax.swing.JButton();
        btnCari2 = new javax.swing.JButton();
        txtCari2 = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPesanan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPesananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPesanan);

        jLabel1.setText("ID Pesanan");

        jLabel2.setText("Tanggal Pesanan");

        jLabel3.setText("Tanggal Pengiriman");

        jLabel4.setText("ID Pembayaran");

        jLabel5.setText("ID Pembeli");

        jLabel6.setText("ID Delivery Boy");

        jLabel7.setText("ID Pegawai");

        jLabel8.setText("ID Member");

        txtIdpesanan.setText("Tidak perlu diisi");

        txtIdpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdpembayaranActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnTampilkan.setText("Tampilkan");
        btnTampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilkanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        tblPesanan2.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPesanan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPesanan2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPesanan2);

        jLabel9.setText("ID Pesanan");

        jLabel10.setText("ID Produk");

        btnSubmit2.setText("Submit");
        btnSubmit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit2ActionPerformed(evt);
            }
        });

        btnTampilkan2.setText("Tampilkan");
        btnTampilkan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilkan2ActionPerformed(evt);
            }
        });

        btnEdit2.setText("Edit");
        btnEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit2ActionPerformed(evt);
            }
        });

        btnHapus2.setText("Hapus");
        btnHapus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus2ActionPerformed(evt);
            }
        });

        btnCari2.setText("Cari");
        btnCari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCari2ActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1)
                                            .addComponent(txtIdpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3)
                                            .addComponent(txtTanggalpengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(txtIdpegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtIdpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtTanggalpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtIddboy, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtIdmember, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel5)
                                    .addComponent(txtIdpembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnKembali)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubmit)
                                .addGap(18, 18, 18)
                                .addComponent(btnTampilkan)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(btnCari)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubmit2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(btnTampilkan2)
                                .addGap(30, 30, 30)
                                .addComponent(btnEdit2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHapus2)
                                .addGap(18, 18, 18)
                                .addComponent(btnCari2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCari2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtIdpesanan2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(txtIdproduk2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdpesanan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdproduk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit2)
                            .addComponent(btnTampilkan2)
                            .addComponent(btnEdit2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHapus2)
                            .addComponent(btnCari2)
                            .addComponent(txtCari2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTanggalpengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTanggalpesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdpembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdpegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIddboy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdmember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit)
                            .addComponent(btnTampilkan)
                            .addComponent(btnEdit)
                            .addComponent(btnHapus)
                            .addComponent(btnCari)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrint))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnKembali)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try{
            boolean a = txtIdmember.getText().equals("-");
            String b = null;
            if (a == true){
                b = "NULL";
            }else{
                b = txtIdmember.getText();
            }
            String sql = "INSERT INTO Pesanan VALUES ('"+txtTanggalpesanan.getText()+"','"+txtTanggalpengiriman.getText()+"','"+txtIdpembayaran.getText()+"','"+txtIdpembeli.getText()+"','"+txtIddboy.getText()+"','"+txtIdpegawai.getText()+"',"+b+")";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void tblPesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPesananMouseClicked
        try{
            int baris = tblPesanan.rowAtPoint(evt.getPoint());
            String Id_pesanan = tblPesanan.getValueAt(baris, 0).toString();
            txtIdpesanan.setText(Id_pesanan);
            String Tanggal_pesanan = tblPesanan.getValueAt(baris, 1).toString();
            txtTanggalpesanan.setText(Tanggal_pesanan);
            String Tanggal_pemesanan = tblPesanan.getValueAt(baris, 2).toString();
            txtTanggalpengiriman.setText(Tanggal_pemesanan);
            Object Id_pembayaran = tblPesanan.getValueAt(baris, 3);
            if (Id_pembayaran != null){
                txtIdpembayaran.setText((String) Id_pembayaran);
            }else{
                txtIdpembayaran.setText(kosong);
            }
            String Id_pembeli = tblPesanan.getValueAt(baris, 4).toString();
            txtIdpembeli.setText(Id_pembeli);
            Object Id_dboy = tblPesanan.getValueAt(baris, 5);
            if (Id_dboy != null){
                txtIddboy.setText((String) Id_dboy);
            }else{
                txtIddboy.setText(kosong);
            }
            Object Id_pegawai = tblPesanan.getValueAt(baris, 6);
            if (Id_pegawai != null){
                txtIdpegawai.setText((String)Id_pegawai);
            }else{
                txtIdpegawai.setText(kosong);
            }
            Object Id_member = tblPesanan.getValueAt(baris, 7);
            if (Id_member != null){
                txtIdmember.setText((String) Id_member);
            }else{
                txtIdmember.setText(kosong);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }    
    }//GEN-LAST:event_tblPesananMouseClicked

    private void btnTampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilkanActionPerformed
        try{      
            String sql = "SELECT * FROM Pesanan WHERE Tanggal_pesanan = '"+txtTanggalpesanan.getText()+"'";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
        
        table();
        Kosongkan_Form();
    }//GEN-LAST:event_btnTampilkanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            boolean a = txtIdpembayaran.getText().equals("-");
            boolean b = txtIddboy.getText().equals("-");
            boolean c = txtIdpegawai.getText().equals("-");
            boolean d = txtIdmember.getText().equals("-");
            String e, f, g, h = null;
            if (a == true){
                e = "NULL";
            }else{
                e = "'"+txtIdpembayaran.getText()+"'";
            }
            if (b == true){
                f = "NULL";
            }else{
                f = "'"+txtIddboy.getText()+"'";
            }
            if (c == true){
                g = "NULL";
            }else{
                g = "'"+txtIdpegawai.getText()+"'";
            }
            if (d == true){
                h = "NULL";
            }else{
                h = "'"+txtIdmember.getText()+"'";
            }
            String sql = "UPDATE Pesanan SET Tanggal_pesanan = '"+txtTanggalpesanan.getText()+"',Tanggal_pengiriman = '"+txtTanggalpengiriman.getText()+"'"+",Id_pembayaran = "+e+",Id_pembeli = '"+txtIdpembeli.getText()+"'"+",Id_dboy = "+f+", Id_pegawai = "+g+", Id_member = "+h+" WHERE Id_pesanan = '"+txtIdpesanan.getText()+"'";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diedit");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try{
            String sql = "DELETE FROM Pesanan WHERE Id_pesanan = '"+txtIdpesanan.getText()+"'";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        search();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        dispose();
        new Admin_Page().setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void btnSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit2ActionPerformed
        try{
            String sql = "INSERT INTO Id_produk_Pesanan VALUES ('"+txtIdpesanan2.getText()+"','"+txtIdproduk2.getText()+"')";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }//GEN-LAST:event_btnSubmit2ActionPerformed

    private void btnTampilkan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilkan2ActionPerformed
        try{
            String sql = "SELECT * FROM Id_produk_Pesanan WHERE ID = '"+txtID.getText()+"'";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
        
        table2();
        Kosongkan_Form2();
    }//GEN-LAST:event_btnTampilkan2ActionPerformed

    private void tblPesanan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPesanan2MouseClicked
        try{
            int baris = tblPesanan2.rowAtPoint(evt.getPoint());
            String Id = tblPesanan2.getValueAt(baris, 0).toString();
            txtID.setText(Id);
            String Id_pesanan = tblPesanan2.getValueAt(baris, 1).toString();
            txtIdpesanan2.setText(Id_pesanan);
            String Id_produk = tblPesanan2.getValueAt(baris, 2).toString();
            txtIdproduk2.setText(Id_produk);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }    
    }//GEN-LAST:event_tblPesanan2MouseClicked

    private void btnEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit2ActionPerformed
        try{
            String sql = "UPDATE Id_produk_Pesanan SET Id_produk_Pesanan = '"+txtIdpesanan2.getText()+"',Id_produk = '"+txtIdproduk2.getText()+"' WHERE ID = '"+txtID.getText()+"'";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diedit");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }//GEN-LAST:event_btnEdit2ActionPerformed

    private void btnHapus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus2ActionPerformed
        try{
            String sql = "DELETE FROM Id_produk_Pesanan WHERE ID = '"+txtID.getText()+"'";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }//GEN-LAST:event_btnHapus2ActionPerformed

    private void btnCari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCari2ActionPerformed
        search2();
    }//GEN-LAST:event_btnCari2ActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            String destFileName = "report.pdf";

            System.out.println("generating jasper report...");

            // 1. compile template ".jrxml" file
            JasperReport jasperReport = getJasperReport();

            // 2. parameters "empty"
            Map<String, Object> parameters = Connect.getParameters();

            try {
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

                JasperViewer.viewReport(jasperPrint, false);

                JasperExportManager.exportReportToPdfFile(jasperPrint, destFileName);

            } catch (JRException ex) {
                ex.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pesanan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Pesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtIdpembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdpembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdpembayaranActionPerformed

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
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCari2;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEdit2;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapus2;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit2;
    private javax.swing.JButton btnTampilkan;
    private javax.swing.JButton btnTampilkan2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPesanan;
    private javax.swing.JTable tblPesanan2;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtCari2;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIddboy;
    private javax.swing.JTextField txtIdmember;
    private javax.swing.JTextField txtIdpegawai;
    private javax.swing.JTextField txtIdpembayaran;
    private javax.swing.JTextField txtIdpembeli;
    private javax.swing.JTextField txtIdpesanan;
    private javax.swing.JTextField txtIdpesanan2;
    private javax.swing.JTextField txtIdproduk2;
    private javax.swing.JTextField txtTanggalpengiriman;
    private javax.swing.JTextField txtTanggalpesanan;
    // End of variables declaration//GEN-END:variables
}
