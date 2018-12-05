package com.afif.SpringBootWeb.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

@Entity
public class UsulKartu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn (name = "kode_instansi", referencedColumnName = "kodeinstansi")
    @ManyToOne
    private NomorKartu kodeinstansi;

    @JoinColumn (name = "nip", referencedColumnName = "nip")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pegawai nip;

    private String nomorurutkarpeg;
    private String nomorurutkarsu;
    private String nomorurutkaris;

    public UsulKartu(){}

    public UsulKartu(NomorKartu kodeinstansi, Pegawai nip, String nomorurutkarpeg, String nomorurutkarsu, String nomorurutkaris) {
        this.kodeinstansi = kodeinstansi;
        this.nip = nip;
        this.nomorurutkarpeg = nomorurutkarpeg;
        this.nomorurutkarsu = nomorurutkarsu;
        this.nomorurutkaris = nomorurutkaris;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NomorKartu getKodeinstansi() {
        return kodeinstansi;
    }

    public void setKodeinstansi(NomorKartu kodeinstansi) {
        this.kodeinstansi = kodeinstansi;
    }

    public Pegawai getNip() {
        return nip;
    }

    public void setNip(Pegawai nip) {
        this.nip = nip;
    }

    public String getNomorurutkarpeg() {
        return nomorurutkarpeg;
    }

    public void setNomorurutkarpeg(String nomorurutkarpeg) {
        this.nomorurutkarpeg = nomorurutkarpeg;
    }

    public String getNomorurutkarsu() {
        return nomorurutkarsu;
    }

    public void setNomorurutkarsu(String nomorurutkarsu) {
        this.nomorurutkarsu = nomorurutkarsu;
    }

    public String getNomorurutkaris() {
        return nomorurutkaris;
    }

    public void setNomorurutkaris(String nomorurutkaris) {
        this.nomorurutkaris = nomorurutkaris;
    }

    @Override
    public String toString() {
        return "UsulKartu{" +
                "id=" + id +
                ", kodeinstansi=" + kodeinstansi +
                ", nip=" + nip +
                ", nomorurutkarpeg='" + nomorurutkarpeg + '\'' +
                ", nomorurutkarsu='" + nomorurutkarsu + '\'' +
                ", nomorurutkaris='" + nomorurutkaris + '\'' +
                '}';
    }
}
