package com.example.demo.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Hastane", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "isim"))

public class Hastane {

    @Column(unique = true)
    private String isim;

    private int oda_sayisi;
    private int ameliyathane_sayisi;
    private int hasta_kapasitesi;
    private Date kurulus_yili;

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public Date getKurulus_yili() {
        return kurulus_yili;
    }

    public int getAmeliyathane_sayisi() {
        return ameliyathane_sayisi;
    }

    public int getHasta_kapasitesi() {
        return hasta_kapasitesi;
    }

    public int getOda_sayisi() {
        return oda_sayisi;
    }

    public void setAmeliyathane_sayisi(int ameliyathane_sayisi) {
        this.ameliyathane_sayisi = ameliyathane_sayisi;
    }

    public void setHasta_kapasitesi(int hasta_kapasitesi) {
        this.hasta_kapasitesi = hasta_kapasitesi;
    }

    public void setKurulus_yili(Date kurulus_yili) {
        this.kurulus_yili = kurulus_yili;
    }

    public void setOda_sayisi(int oda_sayisi) {
        this.oda_sayisi = oda_sayisi;
    }
    
}
