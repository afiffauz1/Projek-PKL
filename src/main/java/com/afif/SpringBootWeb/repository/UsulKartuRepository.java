package com.afif.SpringBootWeb.repository;

import com.afif.SpringBootWeb.model.UsulKartu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsulKartuRepository extends JpaRepository<UsulKartu, Integer> {
    List<UsulKartu> findByNip_Nip (String n);
}
