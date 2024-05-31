/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kompanija;

/**
 *
 * @author stefa
 */
public class Kompanija {
    private int idKompanije;
    private String pib;
    private String ime;
    private String kontakt;
    private String mail;
    private String mesto;

    public Kompanija(int idKompanije, String pib, String ime, String kontakt, String mail, String mesto) {
        this.idKompanije = idKompanije;
        this.pib = pib;
        this.ime = ime;
        this.kontakt = kontakt;
        this.mail = mail;
        this.mesto = mesto;
    }

    public int getIdKompanije() {
        return idKompanije;
    }

    public void setIdKompanije(int idKompanije) {
        this.idKompanije = idKompanije;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }
    
}
