package com.afif.SpringBootWeb.service;

import com.afif.SpringBootWeb.model.Pegawai;
import com.afif.SpringBootWeb.model.UsulKartu;
import com.afif.SpringBootWeb.repository.PegawaiRepository;
import com.afif.SpringBootWeb.repository.UsulKartuRepository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ApkService implements ServiceInt {



    private final PegawaiRepository pegawaiRepository;
    private final UsulKartuRepository usulKartuRepository;

    public ApkService(PegawaiRepository pegawaiRepository, UsulKartuRepository usulKartuRepository) {
        this.pegawaiRepository = pegawaiRepository;
        this.usulKartuRepository = usulKartuRepository;
    }


    public void save(Pegawai pegawai){
        pegawaiRepository.save(pegawai);
    }


    @Override
    public List<UsulKartu> cariusul(String c) {
        return usulKartuRepository.findByNip_Nip(c);
    }

    @Override
    public List<Pegawai> caripegawai(String a) {
        return pegawaiRepository.findByNip(a);
    }




}

