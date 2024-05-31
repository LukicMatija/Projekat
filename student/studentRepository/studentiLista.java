/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.studentRepository;

import java.awt.List;
import java.sql.*;
import student.Student;
import java.util.HashMap;
import java.util.LinkedList;
/**
 *
 * @author stefa
 */
public class studentiLista{
    
    public LinkedList<Student> napraviListu(String ime, String prezime){
        
        try {
            LinkedList<Student> studenti = new LinkedList<>();
            String url = "jdbc:mysql://localhost:3306/projekat";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            String upit = "SELECT * FROM student WHERE ime LIKE '" + ime + "%' and prezime LIKE '" + prezime + "%'";
            PreparedStatement ps = conn.prepareStatement(upit);
            
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getString(2));
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12));
                studenti.add(student);
            }
            ps.close();
            conn.close();
            return studenti;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

   
    public void ispisiListu(LinkedList<Student> studenti){
        if(studenti == null ){
            System.out.println("Prazna lista");
            return;
        }
        for (Student student : studenti) {
            System.out.println(student.getIme() + " " + student.getPrezime());
        }
    }
}

