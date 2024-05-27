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
        if (result == 1) {
            sl.ispisiListu();
        } else {
            System.out.println("Error occurred while creating the student list.");
        }

        // Now perform other operations (if needed)
        praksaRepository pr = new praksaRepository();
        pr.dodaj(2, 1, null, null);
        for(Praksa praksa : pr.prikazi()){
            System.out.println(praksa.toString());
        }   
    }
    
}
