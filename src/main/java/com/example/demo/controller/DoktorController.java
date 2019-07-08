package com.example.demo.controller;

import com.example.demo.model.Doktor;
import com.example.demo.service.DoktorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class DoktorController {
    @Autowired
    DoktorService doktorService;
    @RequestMapping(value = {"/doktorlari_getir"}, method = RequestMethod.GET)
    public ResponseEntity<?> getPeriods() {
            List<Doktor> doktorList = doktorService.findAll();
            return new ResponseEntity<>(doktorList, HttpStatus.OK);
    }
}
