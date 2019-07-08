package com.example.demo.repository;

import com.example.demo.model.Calisan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CalisanRepository extends JpaRepository<Calisan, Long> {


    @Query("SELECT  k FROM Calisan k WHERE k.kullaniciAdi=?1")
    Calisan findByKullaniciAdi(String username);

    @Query("SELECT  k FROM Calisan k WHERE k.id=?1")
    Calisan findbyId(Long id);

    @Query("SELECT  k FROM Calisan k WHERE k.password=?1")
    Calisan findBySifre(String sifre);

    @Query("SELECT COUNT(id) FROM Calisan ")
    int toplamKullanici();

    }
