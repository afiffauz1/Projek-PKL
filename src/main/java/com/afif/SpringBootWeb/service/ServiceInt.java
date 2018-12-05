package com.afif.SpringBootWeb.service;

import com.afif.SpringBootWeb.model.AdminAccess;
import com.afif.SpringBootWeb.model.Pegawai;
import com.afif.SpringBootWeb.model.UsulKartu;

import java.util.List;

public interface ServiceInt {


    List<UsulKartu> cariusul(String c);
    List<Pegawai> caripegawai(String a);
}