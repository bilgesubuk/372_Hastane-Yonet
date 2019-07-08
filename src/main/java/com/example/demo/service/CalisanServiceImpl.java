package com.example.demo.service;

import com.example.demo.model.Calisan;
import com.example.demo.repository.CalisanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalisanServiceImpl implements CalisanService {

    @Autowired
    CalisanRepository calisanRepository;



    @Override
    public void save(Calisan calisan) {
        calisanRepository.save(calisan);
    }

    @Override
    public Calisan findByKullaniciAdi(String username) {
        return calisanRepository.findByKullaniciAdi(username);
    }

    @Override

    public Calisan FindById(Long id) {
        return calisanRepository.findbyId(id);
    }
    @Override
    public Calisan findBySifre(String sifre) {
        return calisanRepository.findBySifre(sifre);
    }

    @Override
    public int toplamKullanici() {
        return calisanRepository.toplamKullanici();
    }

    @Override
    public List<Calisan> findAll() {
        return calisanRepository.findAll();
    }

    @Override
    public void delete(Calisan calisan) {


    }
}