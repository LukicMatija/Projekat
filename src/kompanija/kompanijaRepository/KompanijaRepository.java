/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kompanija.kompanijaRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import kompanija.Kompanija;
import student.Student;
/**
 *
 * @author mluki
 */
public class KompanijaRepository {
    public LinkedList<Kompanija> napraviListu(String ime){
        try {
            LinkedList<Kompanija> kompanije = new LinkedList<>();
            String url = "jdbc:mysql://localhost:3306/projekat";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            String upit = "SELECT * FROM kompanija WHERE ime LIKE '" + ime + "%'";
            PreparedStatement ps = conn.prepareStatement(upit);
            
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getString(2));
                Kompanija kompanija = new Kompanija(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                kompanije.add(kompanija);
            }
            ps.close();
            conn.close();
            return kompanije;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        
    }
    public void ispisiListu(LinkedList<Kompanija> studenti){
        if(studenti == null ){
            System.out.println("Prazna lista");
            return;
        }
        for (Kompanija student : studenti) {
            System.out.println(student.getIme());
        }
    }
}
