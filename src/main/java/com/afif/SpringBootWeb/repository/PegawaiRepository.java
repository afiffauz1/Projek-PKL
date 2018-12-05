package com.afif.SpringBootWeb.repository;

import com.afif.SpringBootWeb.model.Pegawai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface PegawaiRepository extends JpaRepository <Pegawai, Integer> {

    List<Pegawai> findByNip(String nip);
}
