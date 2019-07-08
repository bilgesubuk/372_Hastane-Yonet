package com.example.demo.controller;

import com.example.demo.model.Calisan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class SekreterController {
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
    public ResponseEntity<?> deneme(@RequestParam(value = "cinsiyet", required = true) String cinsiyet){
        System.out.println(cinsiyet);
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
