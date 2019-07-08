package com.example.demo.service;

import com.example.demo.model.Calisan;

import java.util.List;

public interface CalisanService {


    void save(Calisan calisan);

    Calisan findByKullaniciAdi(String username);
    Calisan FindById(Long id);
    Calisan findBySifre(String sifre);
    int toplamKullanici();
    List<Calisan> findAll();

    void delete(Calisan calisan);
}
