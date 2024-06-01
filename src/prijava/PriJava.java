/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prijava;
import GUI.GlavnaForma;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.Date;
import java.util.LinkedList;
import kompanija.kompanijaRepository.KompanijaRepository;
import praksa.Praksa;
import praksa.praksaRepository.praksaRepository;
import student.Student;
import student.studentRepository.studentiLista;
import kompanija.Kompanija;
import ugovor.Ugovor;
import ugovor.ugovorRepository.ugovorRepos;

/**
 *
 * @author stefa
 */
public class PriJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlatLightLaf.setup();
        //studentiLista sl = new studentiLista();
        //LinkedList<Student> studenti = sl.napraviListu("Ma","");
        //sl.ispisiListu(studenti);
        //praksaRepository pr = new praksaRepository();
        //pr.dodaj(2, 1, null, null);
        //pr.prikazi();
        GlavnaForma gf = new GlavnaForma();
        gf.setVisible(true);
        //KompanijaRepository kr = new KompanijaRepository();
        //LinkedList<Kompanija> kompanije = kr.napraviListu("");
        //kr.ispisiListu(kompanije);
        //ugovorRepos ur = new ugovorRepos();
        //LinkedList<Ugovor> ugovori = ur.napraviListu(1);
        //ur.ispisiListu(ugovori);
        //praksaRepository.dodaj(1, 1, new Date(), new Date());
    }
    
}
