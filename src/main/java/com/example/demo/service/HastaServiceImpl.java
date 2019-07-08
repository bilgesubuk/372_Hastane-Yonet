package com.example.demo.service;

import com.example.demo.model.Hasta;
import com.example.demo.repository.CalisanRepository;
import com.example.demo.repository.HastaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HastaServiceImpl implements HastaService {
    @Autowired
    HastaRepository hastaRepository;

    @Override
    public List<Hasta> findAll() {
        return hastaRepository.findAll();
    }

}
