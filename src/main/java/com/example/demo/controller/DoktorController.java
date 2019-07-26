package com.example.demo.controller;

import com.example.demo.model.Doktor;
import com.example.demo.model.Hasta;
import com.example.demo.model.Randevu;
import com.example.demo.service.DoktorService;
import com.example.demo.service.HastaService;
import com.example.demo.service.RandevuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
public class DoktorController {
    @Autowired
    DoktorService doktorService;
    @Autowired
    HastaService hastaService;
    @Autowired
    RandevuService randevuService;
    @RequestMapping(value = {"/doktorlari_getir"}, method = RequestMethod.GET)
    public ResponseEntity<?> getPeriods() {
            List<Doktor> doktorList = doktorService.findAll();
            return new ResponseEntity<>(doktorList, HttpStatus.OK);
    }
    public static class Inner{
        public String start;
        public String end;
        public String ns;
        public String day;
        public Long randevu_id;
    }
    @RequestMapping(value = {"/hasta_goruntule_doktor"}, method = RequestMethod.POST)
    public ResponseEntity<?> hasta_goruntule_doktor(@RequestParam(value = "id", required = true) Long id){
        Set<Randevu> randevular = doktorService.FindById(id).getRandevular();
        ArrayList<Inner> inar = new ArrayList<>();
        for (Randevu randevu:randevular
             ) {
            Inner a = new Inner();
            a.day =randevu.getRandevu_tarihi();
            int hour=randevu.getStartTime()/60;
            int minute=randevu.getStartTime()%60;
            a.start = String.valueOf(hour+":"+minute);
             hour=randevu.getEndTime()/60;
             minute=randevu.getEndTime()%60;
            a.end = String.valueOf(hour+":"+minute);
            Hasta hasta = (randevu.getHasta());
            a.ns = hasta.getIsim()+ " "+ hasta.getSoyisim();
            a.randevu_id = randevu.getId();
            inar . add(a);
        }
        return new ResponseEntity<ArrayList<Inner>>(inar, HttpStatus.OK);
    }

    @GetMapping(path = "doktor_anasayfa/{id}")
    public String bireysel(@PathVariable String id, Model model) {
        return "doktor_anasayfa";
    }
    @RequestMapping(value = {"/randevu_sil"}, method = RequestMethod.POST)
    public ResponseEntity<?> randevu_sil(@RequestParam(value = "id", required = true) Long id) {
        Randevu randevu=randevuService.FindById(id);
        randevuService.delete(randevu);

        return null;


    }
}
