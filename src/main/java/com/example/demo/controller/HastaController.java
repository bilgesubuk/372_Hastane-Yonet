package com.example.demo.controller;

import com.example.demo.model.Hasta;
import com.example.demo.service.HastaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HastaController {
    @Autowired
    HastaService hastaService;
    @RequestMapping(value = {"/hastalari_getir"}, method = RequestMethod.GET)
    public ResponseEntity<?> getPeriods() {
            List<Hasta> hastaList = hastaService.findAll();
            return new ResponseEntity<>(hastaList, HttpStatus.OK);
    }
}
