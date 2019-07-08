package com.example.demo.controller;

import com.example.demo.service.CalisanService;

import com.example.demo.model.Calisan;
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
public class LoginController {

    @Autowired
    CalisanService calisanService;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String registration(Model model) {
        return "login";
    }


    @RequestMapping(value = {"/newuser"}, method = RequestMethod.POST)
    public ResponseEntity<?> deneme(@RequestParam(value = "name", required = true) String name,
                                    @RequestParam(value = "surname", required = true) String surname,
                                    @RequestParam(value = "bdate", required = true) String bdate,
                                    @RequestParam(value = "username", required = true) String username,
                                    @RequestParam(value = "password", required = true) String password)

    {
        Date date1 = new Date();
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(bdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calisan k = new Calisan();
        k.setIsim(name);
        k.setSoyisim(surname);
        k.setDogum_tarihi(date1);
        k.setKullaniciAdi(username);
        k.setPassword(password);
        calisanService.save(k);

        return null;
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public ResponseEntity<?> deneme(@RequestParam(value = "username", required = true) String username,
                                    @RequestParam(value = "password", required = true) String password) {
        Calisan k= calisanService.findByKullaniciAdi(username);
        System.out.println(k.getId()+"   "+k.getGorev()+"    "+k.getPassword() +" vvvvvvvvvvvvv");
        SekreterController.current_sekreter = k;
        try {
            if (k.getPassword().equals(password)) {
                if (k.getGorev()==1) {
                    return new ResponseEntity<String>("sekreter_anasayfa/" + k.getId(), HttpStatus.OK);
                }
                return new ResponseEntity<String>("home/" + k.getId(), HttpStatus.OK);
            }
            else
                return new ResponseEntity<String>("1", HttpStatus.OK);
        }catch (NullPointerException e){
                return new ResponseEntity<String>("1", HttpStatus.OK);

        }
    }

}


