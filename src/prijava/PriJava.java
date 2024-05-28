/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prijava;
import praksa.Praksa;
import praksa.praksaRepository.praksaRepository;
import student.studentRepository.studentiLista;

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
        int result = sl.napraviListu();
        sl.ispisiListu();
        praksaRepository pr = new praksaRepository();
        //pr.dodaj(2, 1, null, null);
        pr.prikazi();
        
    }
    
}
