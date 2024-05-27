/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prijava;
import java.sql.*;
import konekcija.NapraviKonekciju;
import studentRepository.studentiLista;

/**
 *
 * @author stefa
 */
public class PriJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        studentiLista sl = new studentiLista();
        System.out.println(sl.napraviListu());
        sl.ispisiListu();
    }
    
}
