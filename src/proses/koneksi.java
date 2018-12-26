/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



/**
 *
 * @author junaidi
 */
public class koneksi {


//    public static Connection getKoneksi(){
        
//        public Connection con;
//        public PreparedStatement pst;
//        try{
//           Class.forName("com.mysql.jdbc.Driver");
//           con = DriverManager.getConnection(
//                   "jdbc:mysql://localhost/penjualan1","root","");
//           stat = con.createStatement();
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Koneksi gagal"+e);
//        }
//        return con;
//        }  
       
//        Connection koneksi = null;
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/penjualan1","root","");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return  koneksi;
//    }
    public Statement stat;
    public ResultSet res;
    public Connection con;
    public PreparedStatement pst;
    
    public koneksi(){
                
        if (con==null){
            try {
                Class.forName("com.mysql.jdbc.Driver"); // driver yang diimport
                con = DriverManager.getConnection(
                   "jdbc:mysql://localhost/penjualan1","root","");                
                stat = con.createStatement();
                
            } catch (Exception e) {                
                JOptionPane.showMessageDialog(null, 
                        "Koneksi Gagal : "+e);
            }
        }
    }
}
