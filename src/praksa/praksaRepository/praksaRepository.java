/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praksa.praksaRepository;

import java.sql.*;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

import praksa.Praksa;

/**
 *
 * @author stefa
 */
public class praksaRepository {
    public static void dodaj(int idStudenta, int idKompanije, Date datumOd, Date datumDo){
        try {
            String url = "jdbc:mysql://localhost:3306/projekat";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement statement = conn.createStatement();
            String upit = "INSERT INTO praksa(IDStudenta, IDKompanije, DatumOd, DatumDo) VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(upit);
            ps.setInt(1, idStudenta);
            ps.setInt(2, idKompanije);
            ps.setDate(3, new java.sql.Date(datumOd.getTime()));
            ps.setDate(4, new java.sql.Date(datumDo.getTime()));
            ps.executeUpdate();
            statement.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Uspesno dodato", "Dodavanje prakse", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public void prikazi(){
        try {
            
            String url = "jdbc:mysql://localhost:3306/projekat";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement statement = conn.createStatement();
            String upit = "select * from praksa";
            ResultSet rs = statement.executeQuery(upit);
            
            while(rs.next()){
                int idPraksa = rs.getInt(1);
                int idStudenta = rs.getInt(2);
                int idKompanije = rs.getInt(3);
                Date datumOd = rs.getDate(4);
                Date datumDo = rs.getDate(5);
                Praksa p = new Praksa(idPraksa,idStudenta, idKompanije, datumOd, datumDo);
                System.out.println(p.ispis());
                //listaPraksi.add(p);
            }
            statement.close();
            conn.close();
            
            //return listaPraksi;
        } catch (SQLException ex) {
            System.out.println(ex);
            //return null;
        }
    }
    public void obrisi(){
        
    }
    public void izmeni(){
        
    }
}
