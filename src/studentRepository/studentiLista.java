/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentRepository;

import java.sql.*;
import konekcija.NapraviKonekciju;
import student.Student;
import java.util.HashMap;
/**
 *
 * @author stefa
 */
public class studentiLista{
    HashMap<Integer, Student> studentiHM = new HashMap<>();
    public int napraviListu(){
        try {
            NapraviKonekciju dbConnection = NapraviKonekciju.getInstance();
            Connection conn = dbConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM student");
            while(rs.next()){
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12));
                studentiHM.put(rs.getInt(1), student);
            }
            statement.close();
            dbConnection.closeConnection();
            return 1;
        } catch (SQLException ex) {
            System.out.println(ex);
            return 0;
        }
    }

   
    public void ispisiListu(){
        for(Integer student: studentiHM.keySet()){
            System.out.println(studentiHM.get(student).toString());
        }
    }
}

