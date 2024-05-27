/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import java.util.Date;

/**
 *
 * @author stefa
 */
public class Student {
    private int idStudent;
    private String jmbg;
    private String indeks;
    private String ime;
    private String prezime;
    private String mail;
    private String studentskiMail;
    private String kontakt;
    private String studijskiProgram;
    private String stepenStudija;
    private String mestoRodjenja;
    private Date datumRodjenja;

    public Student(int idStudent, String jmbg, String ime, String prezime, Date datumRodjenja, String mail, String studentskiMail, String kontakt, String indeks, String studijskiProgram, String stepenStudija, String mestoRodjenja) {
        this.idStudent = idStudent;
        this.jmbg = jmbg;
        this.indeks = indeks;
        this.ime = ime;
        this.prezime = prezime;
        this.mail = mail;
        this.studentskiMail = studentskiMail;
        this.kontakt = kontakt;
        this.studijskiProgram = studijskiProgram;
        this.stepenStudija = stepenStudija;
        this.mestoRodjenja = mestoRodjenja;
        this.datumRodjenja = datumRodjenja;
    }

    @Override
    public String toString() {
        return "Student{" + "idStudent=" + idStudent + ", jmbg=" + jmbg + ", indeks=" + indeks + ", ime=" + ime + ", prezime=" + prezime + ", mail=" + mail + ", studentskiMail=" + studentskiMail + ", kontakt=" + kontakt + ", studijskiProgram=" + studijskiProgram + ", stepenStudija=" + stepenStudija + ", mestoRodjenja=" + mestoRodjenja + ", datumRodjenja=" + datumRodjenja + '}';
    }
    
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }
    
    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getStudentskiMail() {
        return studentskiMail;
    }

    public void setStudentskiMail(String studentskiMail) {
        this.studentskiMail = studentskiMail;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    public String getStudijskiProgram() {
        return studijskiProgram;
    }

    public void setStudijskiProgram(String studijskiProgram) {
        this.studijskiProgram = studijskiProgram;
    }

    public String getStepenStudija() {
        return stepenStudija;
    }

    public void setStepenStudija(String stepenStudija) {
        this.stepenStudija = stepenStudija;
    }

    public String getMestoRodjenja() {
        return mestoRodjenja;
    }

    public void setMestoRodjenja(String mestoRodjenja) {
        this.mestoRodjenja = mestoRodjenja;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }
    
    
}
