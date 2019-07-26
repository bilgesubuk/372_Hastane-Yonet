package com.example.demo.service;

import com.example.demo.model.Calisan;
import com.example.demo.model.Hasta;

import java.util.List;

public interface HastaService {
    List<Hasta> findAll();

    public Hasta FindById(Long id);
    void save(Hasta hasta);

}
