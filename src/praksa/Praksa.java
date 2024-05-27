/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praksa;

import java.util.Date;

/**
 *
 * @author stefa
 */
public class Praksa {
    private int idPrakse;
    private int idStudenta;
    private int idKompanije;
    private Date datumOd;
    private Date datumDo;

    public Praksa(int idPrakse, int idStudenta, int idKompanije, Date datumOd, Date datumDo) {
        this.idPrakse = idPrakse;
        this.idStudenta = idStudenta;
        this.idKompanije = idKompanije;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
    }

    @Override
    public String toString() {
        return "Praksa{" + "idPrakse=" + idPrakse + ", idStudenta=" + idStudenta + ", idKompanije=" + idKompanije + ", datumOd=" + datumOd + ", datumDo=" + datumDo + '}';
    }

    public int getIdPrakse() {
        return idPrakse;
    }

    public void setIdPrakse(int idPrakse) {
        this.idPrakse = idPrakse;
    }

    public int getIdStudenta() {
        return idStudenta;
    }

    public void setIdStudenta(int idStudenta) {
        this.idStudenta = idStudenta;
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
