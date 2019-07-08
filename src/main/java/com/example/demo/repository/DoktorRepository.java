package com.example.demo.repository;

import com.example.demo.model.Doktor;
import com.example.demo.model.Hasta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface DoktorRepository extends JpaRepository<Doktor, Long> {

    @Query("SELECT  k FROM Doktor k WHERE k.id=?1")
    Doktor findbyId(Long id);
}
