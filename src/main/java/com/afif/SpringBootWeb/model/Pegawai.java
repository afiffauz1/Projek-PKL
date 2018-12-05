package com.afif.SpringBootWeb.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Pegawai implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nama;
    private String nip;
    private String jk;
    private String tmplahir;
    private String statusperkawinan;

    @DateTimeFormat (pattern = "yyyy-MM-dd")
    private Date tgllahir;
    private String namapasangan;
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    private Date tgllahirpasangan;

    public Pegawai(){}

    public Pegawai(String nama, String nip, String jk, String tmplahir, Date tgllahir, String namapasangan, Date tgllahirpasangan, String statusperkawinan) {
        this.nama = nama;
        this.nip = nip;
        this.jk = jk;
        this.tmplahir = tmplahir;
        this.tgllahir = tgllahir;
        this.namapasangan = namapasangan;
        this.tgllahirpasangan = tgllahirpasangan;
        this.statusperkawinan = statusperkawinan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getTmplahir() {
        return tmplahir;
    }

    public void setTmplahir(String tmplahir) {
        this.tmplahir = tmplahir;
    }

    public Date getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(Date tgllahir) {
        this.tgllahir = tgllahir;
    }

    public String getNamapasangan() {
        return namapasangan;
    }

    public void setNamapasangan(String namapasangan) {
        this.namapasangan = namapasangan;
    }

    public Date getTgllahirpasangan() {
        return tgllahirpasangan;
    }

    public void setTgllahirpasangan(Date tgllahirpasangan) {
        this.tgllahirpasangan = tgllahirpasangan;
    }

    public String getStatusperkawinan() {
        return statusperkawinan;
    }

    public void setStatusperkawinan(String statusperkawinan) {
        this.statusperkawinan = statusperkawinan;
    }

    @Override
    public String toString() {
        return "Pegawai{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", nip='" + nip + '\'' +
                ", jk='" + jk + '\'' +
                ", tmplahir='" + tmplahir + '\'' +
                ", statusperkawinan='" + statusperkawinan + '\'' +
                ", tgllahir=" + tgllahir +
                ", namapasangan='" + namapasangan + '\'' +
                ", tgllahirpasangan=" + tgllahirpasangan +
                '}';
    }
}