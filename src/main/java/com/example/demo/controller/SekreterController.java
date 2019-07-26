package com.example.demo.controller;

import com.example.demo.model.Calisan;
import com.example.demo.model.Hasta;
import com.example.demo.model.Randevu;
import com.example.demo.service.HastaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class SekreterController {

    @Autowired
    HastaService hastaService;

public static Calisan current_sekreter=new Calisan();
    @RequestMapping(value = "/sekreter", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new Calisan());
        return "sekreter_hasta_kaydi";
    }
    @RequestMapping(value = "/hasta_kaydi", method = RequestMethod.GET)
    public String registration2(Model model) {
        System.out.println(current_sekreter.getId());
        return "sekreter_hasta_kaydi";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String registration3(Model model) {
        System.out.println("test2");
        return "sekreter_hasta_kaydi";
    }
    @GetMapping(path = "sekreter_anasayfa/{id}")
    public String bireysel(@PathVariable String id, Model model) {
        return "sekreter_anasayfa";
    }

    @GetMapping(path = "profil/{id}")
    public String profil(@PathVariable String id, Model model) {
        return "profil";
    }

    @RequestMapping(value = {"/hasta_kaydet"}, method = RequestMethod.POST)
    public ResponseEntity<?> hastaKaydet(@RequestParam(value = "cinsiyet", required = true) String cinsiyet,
                                    @RequestParam(value = "yas", required = true) String yas,
                                    @RequestParam(value = "kan_grubu", required = true) String kan_grubu,
                                    @RequestParam(value = "hasta_tc", required = true) Long hasta_tc,
                                    @RequestParam(value = "hasta_adi", required = true) String hasta_adi){

        Hasta hasta=new Hasta();
        hasta.setCinsiyet(cinsiyet);
        hasta.setHastaTc(hasta_tc);
        hasta.setIsim(hasta_adi);
        hasta.setKan(kan_grubu);
        hasta.setYas(yas);
        hastaService.save(hasta);
        return new ResponseEntity<String>("0", HttpStatus.OK);
}

    @RequestMapping(value = {"/sekreter_randevu_sayfasi"})
    public String randevu_sayfasi(){
        return "sekreter_randevu_sayfasi";
    }


    @RequestMapping(value = {"/sekreter_randevu_saati"})
    public String randevu_saati(@RequestParam(value = "id", required = true) String id,
                                @RequestParam(value = "doktor_id", required = true) String doktor_id) {
            System.out.println(id+"    "+doktor_id);
            return "sekreter_randevu_saati";
    }


    @RequestMapping(value = {"/sekreter_doktor_secimi"})
    public String doktor_secimi(@RequestParam("id") String id){
        System.out.println(id);
        return "sekreter_doktor_secimi";
    }
}
