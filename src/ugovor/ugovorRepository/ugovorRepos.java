/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugovor.ugovorRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import kompanija.Kompanija;
import student.Student;
import ugovor.Ugovor;
/**
 *
 * @author mluki
 */
public class ugovorRepos {
    public LinkedList<Ugovor> napraviListu(int idK){
        try {
            LinkedList<Ugovor> ugovori = new LinkedList<>();
            String url = "jdbc:mysql://localhost:3306/projekat";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            String upit = "SELECT * FROM ugovor WHERE idKompanije LIKE ?" ;
            PreparedStatement ps = conn.prepareStatement(upit);
            ps.setInt(1, idK);
            
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getString(2));
                Ugovor ugovor = new Ugovor(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getDate(4));
                ugovori.add(ugovor);
            }
            ps.close();
            conn.close();
            return ugovori;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        
    }
    public void ispisiListu(LinkedList<Ugovor> ugovori){
        if(ugovori == null ){
            System.out.println("Prazna lista");
            return;
        }
        for (Ugovor student : ugovori) {
            System.out.println(student.getDatumOd()+ " " + student.getDatumDo());
        }
    }
    public static void dodajUgovor(int idK, Date DatumOd, Date DatumDo){
        try {
            LinkedList<Ugovor> ugovori = new LinkedList<>();
            String url = "jdbc:mysql://localhost:3306/projekat";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            String upit = "INSERT INTO ugovor(IDKompanije,DatumOd,DatumDo) VALUES (?,?,?)" ;
            PreparedStatement ps = conn.prepareStatement(upit);
            ps.setInt(1, idK);
            ps.setDate(2, new java.sql.Date(DatumOd.getTime()));
            ps.setDate(3, new java.sql.Date(DatumDo.getTime()));
            
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
        
}
