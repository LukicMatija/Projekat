/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugovor;

import java.util.Date;

/**
 *
 * @author stefa
 */
public class Ugovor {
    private int idUgovora;
    private int idKompanije;
    private Date datumOd;
    private Date datumDo;

    public Ugovor(int idUgovora, int idKompanije, Date datumOd, Date datumDo) {
        this.idUgovora = idUgovora;
        this.idKompanije = idKompanije;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
    }

    public int getIdUgovora() {
        return idUgovora;
    }

    public void setIdUgovora(int idUgovora) {
        this.idUgovora = idUgovora;
    }

    public int getIdKompanije() {
        return idKompanije;
    }

    public void setIdKompanije(int idKompanije) {
        this.idKompanije = idKompanije;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public Date getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }
}
