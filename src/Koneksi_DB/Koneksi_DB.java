/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ricop
 */
public class Koneksi_DB {
     private Connection koneksi;
    
    public Connection getKoneksi(){
        return koneksi;
    }
    
    public void koneksiDatabase() { //<-- untuk koneksi ke database
        // Cek Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //<-- nama driver untuk koneksi ke MySQL

            // Cek Database
            try {
                String url, user, password;
                url = "jdbc:mysql://localhost:3306/db_sewamobil"; //alamat DB
                user = "root";
                password = "";
                koneksi = DriverManager.getConnection(url, user, password);

                System.out.println("Koneksi Sukses");
            } catch (SQLException se) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal! " + se);
                System.exit(0);
            }
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!" +cnfe);
            System.exit(0);
        }
    }
    public static void main(String[] args) {
       new Koneksi_DB().koneksiDatabase();
    }
}
