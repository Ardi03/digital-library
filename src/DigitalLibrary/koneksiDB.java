/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DigitalLibrary ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ACER
 */
public class koneksiDB {
    private Connection koneksi;
    public Connection getKoneksi(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            
        }
        try{
           koneksi = DriverManager.getConnection("jdbc:mysql://localhost/sisteminformasi_dl","root","");
           if(koneksi != null){
               System.out.print("koneksi berhasil!");
           }
        }catch(Exception ex){
            System.out.print("koneksi gagal");
            
        }
        return koneksi;
    }
}
