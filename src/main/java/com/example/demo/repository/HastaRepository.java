package com.example.demo.repository;

import com.example.demo.model.Hasta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface HastaRepository extends JpaRepository<Hasta, Long> {

    @Query("SELECT  k FROM Hasta k WHERE k.id=?1")
    Hasta findbyId(Long id);
}
