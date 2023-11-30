/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplikasi_Sewa;

import Koneksi_DB.Koneksi_DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author intan
 */
public class Data_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Data_Admin
     */
    private Connection koneksi;
    private Koneksi_DB db = new Koneksi_DB();
    public Data_Admin() {
        initComponents();
        idpegawai();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnmenu = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        intan_id = new javax.swing.JTextField();
        intan_idpegawai = new javax.swing.JComboBox<>();
        intan_namapegawai = new javax.swing.JTextField();
        intan_username = new javax.swing.JTextField();
        intan_password = new javax.swing.JPasswordField();
        intan_add = new javax.swing.JButton();
        intan_update = new javax.swing.JButton();
        intan_delete = new javax.swing.JButton();
        intan_save = new javax.swing.JButton();
        intan_cancel = new javax.swing.JButton();
        intan_exit = new javax.swing.JButton();
        intan_btncari = new javax.swing.JButton();
        intan_cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        intan_tabel = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(214, 179, 255));

        btnmenu.setBackground(new java.awt.Color(51, 255, 51));
        btnmenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnmenu.setText("Menu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });

        btnclose.setBackground(new java.awt.Color(51, 255, 51));
        btnclose.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnclose.setText("X");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnmenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 713, Short.MAX_VALUE)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmenu)
                    .addComponent(btnclose))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 60);

        jPanel2.setBackground(new java.awt.Color(242, 153, 232));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("User ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("ID Pegawai");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Password");

        intan_idpegawai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                intan_idpegawaiItemStateChanged(evt);
            }
        });
        intan_idpegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intan_idpegawaiActionPerformed(evt);
            }
        });

        intan_add.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        intan_add.setForeground(new java.awt.Color(255, 153, 153));
        intan_add.setText("Add");
        intan_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intan_addActionPerformed(evt);
            }
        });

        intan_update.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        intan_update.setForeground(new java.awt.Color(255, 153, 153));
        intan_update.setText("Update");
        intan_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intan_updateActionPerformed(evt);
            }
        });

        intan_delete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        intan_delete.setForeground(new java.awt.Color(255, 153, 153));
        intan_delete.setText("Delete");
        intan_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intan_deleteActionPerformed(evt);
            }
        });

        intan_save.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        intan_save.setForeground(new java.awt.Color(255, 153, 153));
        intan_save.setText("Save");
        intan_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intan_saveActionPerformed(evt);
            }
        });

        intan_cancel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        intan_cancel.setForeground(new java.awt.Color(255, 153, 153));
        intan_cancel.setText("Cancel");
        intan_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intan_cancelActionPerformed(evt);
            }
        });

        intan_exit.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        intan_exit.setForeground(new java.awt.Color(255, 153, 153));
        intan_exit.setText("Exit");
        intan_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intan_exitActionPerformed(evt);
            }
        });

        intan_btncari.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        intan_btncari.setForeground(new java.awt.Color(255, 153, 153));
        intan_btncari.setText("Search");
        intan_btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intan_btncariActionPerformed(evt);
            }
        });

        intan_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                intan_cariMouseClicked(evt);
            }
        });

        intan_tabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        intan_tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID User", "ID Pegawai", "User Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        intan_tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                intan_tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(intan_tabel);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Data Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(intan_btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(intan_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(intan_add)
                                .addGap(18, 18, 18)
                                .addComponent(intan_save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(intan_update, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(intan_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(intan_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(intan_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(55, 55, 55)
                                .addComponent(intan_id, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(intan_password, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(intan_username, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(intan_idpegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(intan_namapegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel5)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intan_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(intan_idpegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(intan_namapegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intan_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intan_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(intan_add)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(intan_update)
                        .addComponent(intan_save)
                        .addComponent(intan_delete)
                        .addComponent(intan_cancel)
                        .addComponent(intan_exit)))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intan_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intan_btncari))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 129, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 880, 830);

        setSize(new java.awt.Dimension(899, 897));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Menu form;
        form = new Menu();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncloseActionPerformed

    private void intan_idpegawaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_intan_idpegawaiItemStateChanged
        // TODO add your handling code here:
        String id;
        id=(String)intan_idpegawai.getSelectedItem();
        intan_namapegawai.setText(id);
        db.koneksiDatabase();
        try {
            String query = "SELECT * FROM data_pegawai where id_pegawai = '" + id + "'";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {
                intan_namapegawai.setText(rs.getString("nama_pegawai"));
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !"+e);
        }
    }//GEN-LAST:event_intan_idpegawaiItemStateChanged

      private void idpegawai(){
                db.koneksiDatabase();
  
        try {
            String query = "SELECT * FROM data_pegawai";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                intan_idpegawai.addItem(rs.getString("id_pegawai"));
                intan_namapegawai.setText(rs.getString("nama_pegawai"));
            } 
        } catch (SQLException e) {
        }
    }
    
        public void getdata(){
    // Code Tampil Data
            DefaultTableModel tbm = new DefaultTableModel();
            //membuat nama kolom pada tabel
            tbm.addColumn("ID User");
            tbm.addColumn("ID Pegawai");
            tbm.addColumn("Username");
            tbm.addColumn("Password");
            intan_tabel.setModel(tbm);
            db.koneksiDatabase();
            try {
            String query = "SELECT * FROM data_admin";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
            tbm.addRow(new Object[]{
                rs.getString("id_user"),
                rs.getString("id_pegawai"),
                rs.getString("username"),
                rs.getString("password"),
                
        });
        intan_tabel.setModel(tbm);
        }
        } catch (SQLException e)
        {
    }
 }
    
    private void intan_idpegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intan_idpegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intan_idpegawaiActionPerformed

    private void intan_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intan_addActionPerformed
        intan_id.setText("");
        intan_username.setText("");
        intan_idpegawai.getSelectedItem();
        intan_password.setText("");
        intan_cari.setText("");
    }//GEN-LAST:event_intan_addActionPerformed

    private void intan_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intan_deleteActionPerformed
        // Hapus Data
        db.koneksiDatabase();
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Mendelete record ini???",
            "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0)
        {
            try
            {
                String sql = "Delete FROM data_admin where id_user = '" + intan_id.getText() + "'";
                Statement st = db.getKoneksi().createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Delete Data Sukses");
                //   tekskosong();
                getdata();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Delete Data Gagal");
            }
        }
    }//GEN-LAST:event_intan_deleteActionPerformed

    private void intan_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intan_saveActionPerformed
        // TODO add your handling code here:
        // Simpan Data
        db.koneksiDatabase();
        boolean result = false;
        String idpegawai, pass;
        idpegawai= (String) intan_idpegawai.getSelectedItem();

        //        encryptPasswordMD5();
        //        intan_password.setText(vmd5);

        // kode Simpan---------------
        String sql = "Insert Into data_admin Values ('" + intan_id.getText() + "',  '" +
        idpegawai + "','" +
        intan_username.getText() + "','" +
        intan_password.getText() + "' )";
        try {
            Statement st = db.getKoneksi().createStatement();
            st.executeUpdate(sql);
            result=true;
            JOptionPane.showMessageDialog(null, "Proses Simpan Sukses !");
            getdata();
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_intan_saveActionPerformed

    private void intan_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intan_cancelActionPerformed
        intan_id.setText("");
        intan_namapegawai.setText("");
        intan_username.setText("");
        intan_idpegawai.getSelectedItem();
        intan_password.setText("");
        intan_cari.setText("");
    }//GEN-LAST:event_intan_cancelActionPerformed

    private void intan_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intan_exitActionPerformed
        dispose();
    }//GEN-LAST:event_intan_exitActionPerformed

    private void intan_btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intan_btncariActionPerformed
        // TODO add your handling code here:
        // Cari Data
        db.koneksiDatabase();
        try {
            String query = "SELECT * FROM data_admin where id_user = '" + intan_cari.getText() + "'";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                intan_id.setText(rs.getString("id_user"));
                intan_idpegawai.setSelectedItem(rs.getString("id_pegawai"));
                intan_namapegawai.setText(rs.getString("username"));
                intan_username.setText(rs.getString("username"));
                intan_password.setText(rs.getString("password"));
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !");
        }
        intan_cari.setText("");
    }//GEN-LAST:event_intan_btncariActionPerformed

    private void intan_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_intan_cariMouseClicked

    }//GEN-LAST:event_intan_cariMouseClicked

    private void intan_tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_intan_tabelMouseClicked

        // TODO add your handling code here:
        boolean result = false;
        String idpegawai, pass;
        idpegawai= (String) intan_idpegawai.getSelectedItem();

        //        encryptPasswordMD5();
        //        intan_password.setText(vmd5);

        try {
            int row =intan_tabel.getSelectedRow();
            String tabel_klik=(intan_tabel.getModel().getValueAt(row, 0).toString());
            db.koneksiDatabase();
            String query = "SELECT * FROM data_admin where id_user = '" + tabel_klik + "'";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                intan_id.setText(rs.getString("id_user"));
                intan_username.setText(rs.getString("username"));
                idpegawai=idpegawai+"id_pegawai";
                intan_password.setText(rs.getString("password"));
            }
        } catch (Exception e)
        {

        }
    }//GEN-LAST:event_intan_tabelMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getdata();
    }//GEN-LAST:event_formWindowOpened

    private void intan_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intan_updateActionPerformed
        // Simpan Data
        db.koneksiDatabase();
        boolean result = false;

        // kode dibawah ini dibuat satu baris saja
        String kode=intan_id.getText();
        String nama=intan_namapegawai.getText();
        String username=intan_username.getText();
        String password=intan_password.getText();
        
        
        
        
        String sql = "update data_admin set "+"username='"+username+"',password='"+password+"'"+"where id_user='"+kode+"'";
        try {
            Statement st = db.getKoneksi().createStatement();
            st.executeUpdate(sql);
            result=true;
            JOptionPane.showMessageDialog(null, "Edit Data Sukses !");

            //       tekskosong();
                   getdata();
        } catch (SQLException e)

        {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada Proses !"+e);
        } 
    }//GEN-LAST:event_intan_updateActionPerformed

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
            java.util.logging.Logger.getLogger(Data_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton intan_add;
    private javax.swing.JButton intan_btncari;
    private javax.swing.JButton intan_cancel;
    private javax.swing.JTextField intan_cari;
    private javax.swing.JButton intan_delete;
    private javax.swing.JButton intan_exit;
    private javax.swing.JTextField intan_id;
    private javax.swing.JComboBox<String> intan_idpegawai;
    private javax.swing.JTextField intan_namapegawai;
    private javax.swing.JPasswordField intan_password;
    private javax.swing.JButton intan_save;
    private javax.swing.JTable intan_tabel;
    private javax.swing.JButton intan_update;
    private javax.swing.JTextField intan_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
