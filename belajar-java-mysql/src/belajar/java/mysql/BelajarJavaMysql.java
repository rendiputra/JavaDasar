/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.mysql;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Win10
 */
public class BelajarJavaMysql {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpustakaan";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static  ResultSet rs;
    static  InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader (inputStreamReader);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * FROM buku";
            stmt = conn.createStatement();
            
            while (!conn.isClosed()){
                showMenu();
            }
            
                stmt.close();
                conn.close();          
//            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    static void showMenu(){
        System.out.println("\n===========MENU UTAMA===========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.println("PILIHAN> ");
        
        try {
            int pilihan = Integer.parseInt(input.readLine());
            switch (pilihan){
                case 0 :
                    System.exit(0);
                    break;
                case 1 :
                    InsertBuku();
                    break;
                case 2 :
                    showData();
                    break;
                case 3 :
                    updateBuku();
                    break;
                case 4 :
                    deleteBuku();
                    break;
                default:
                    System.out.println("PILIHAN ANDA SALAH");
            }
        } catch (Exception e) {
           e.printStackTrace();
            }
        }
           
        static void showData(){
             String sql = "SELECT * FROM buku";
             
             try{
             rs = stmt.executeQuery(sql);
                
                System.err.println("------------------------------");
                System.out.println("           DATA BUKU          ");
                System.out.println("------------------------------");
                
                while (rs.next()){
                    int idBuku = rs.getInt("id_buku");
                    String judul = rs.getString("judul");
                    String pengarang = rs.getString("pengarang");
                    
                    System.out.println(String.format("%d. %s --  (%s)", idBuku, judul, pengarang));
                }
            } catch (Exception d) {
                d.printStackTrace();
            }
        }
    
        
    static void InsertBuku(){
        try {
            System.out.println("Judul: ");
            String judul = input.readLine().trim();
            System.out.println("Pengarang: ");
            String pengarang = input.readLine().trim();
            
            String sql = "INSERT INTO buku (judul, pengarang) VALUES ('%s', '%s')";
            sql = String.format(sql, judul, pengarang);
            
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    static void updateBuku(){
        try {
            System.out.print("ID yang mau di edit :");
            int idbuku = Integer.parseInt(input.readLine());
            System.out.print("Judul : ");
            String judul = input.readLine().trim();
            System.out.print("Pengarang : ");
            String pengarang = input.readLine();
            
            String sql = "UPDATE buku SET judul = '%s' , pengarang = '%s' where id_buku = %d";
            sql = String.format(sql, judul, pengarang, idbuku);
            
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    static void deleteBuku(){
        try {
            System.out.println("ID yang mau dihapus : ");
            int idbuku = Integer.parseInt(input.readLine());
            String sql = String.format("DELETE FROM buku WHERE id_buku = %d",idbuku);
            stmt.execute(sql);
            
            System.out.println("Data Telah terhapus");
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
   
    
    
    
}
