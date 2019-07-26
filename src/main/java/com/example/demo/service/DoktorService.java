package com.example.demo.service;

import com.example.demo.model.Calisan;
import com.example.demo.model.Doktor;
import java.util.List;

public interface DoktorService {
    List<Doktor> findAll();

    public Doktor FindById(Long id);

}
