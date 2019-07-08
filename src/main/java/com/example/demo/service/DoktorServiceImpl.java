package com.example.demo.service;

import com.example.demo.model.Doktor;
import com.example.demo.model.Hasta;
import com.example.demo.repository.DoktorRepository;
import com.example.demo.repository.HastaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoktorServiceImpl implements DoktorService {
    @Autowired
    DoktorRepository doktorRepository;

    @Override
    public List<Doktor> findAll() {
        return doktorRepository.findAll();
    }
}
