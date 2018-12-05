package com.afif.SpringBootWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class NomorKartu implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String kodeinstansi;
    private String kodekarpeg;
    private String kodekaris;
    private String kodekarsu;

    public NomorKartu(){}

    public NomorKartu(String kodeinstansi, String kodekarpeg, String kodekaris, String kodekarsu) {
        this.kodeinstansi = kodeinstansi;
        this.kodekarpeg = kodekarpeg;
        this.kodekaris = kodekaris;
        this.kodekarsu = kodekarsu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKodeinstansi() {
        return kodeinstansi;
    }

    public void setKodeinstansi(String kodeinstansi) {
        this.kodeinstansi = kodeinstansi;
    }

    public String getKodekarpeg() {
        return kodekarpeg;
    }

    public void setKodekarpeg(String kodekarpeg) {
        this.kodekarpeg = kodekarpeg;
    }

    public String getKodekaris() {
        return kodekaris;
    }

    public void setKodekaris(String kodekaris) {
        this.kodekaris = kodekaris;
    }

    public String getKodekarsu() {
        return kodekarsu;
    }

    public void setKodekarsu(String kodekarsu) {
        this.kodekarsu = kodekarsu;
    }

    @Override
    public String toString() {
        return "NomorKartu{" +
                "id=" + id +
                ", kodeinstansi='" + kodeinstansi + '\'' +
                ", kodekarpeg='" + kodekarpeg + '\'' +
                ", kodekaris='" + kodekaris + '\'' +
                ", kodekarsu='" + kodekarsu + '\'' +
                '}';
    }
}
