package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "calisan", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "kullaniciAdi"))

public class Calisan {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    private Long id;
    private Date dogum_tarihi;
    private String isim;
    private String soyisim;


    private int gorev;


    @Column(unique = true)
    private String kullaniciAdi;

    private String password;


    private double maas;
    @Column(unique = true)
    private long tc;
    private int calisma_saati;

    public double getMaas() { return maas; }
    public long getTc() { return tc; }
    public int getCalisma_saati() { return calisma_saati; }

    public void setMaas(int maas) { this.maas = maas; }
    public void setTc(int tc) { this.tc = tc; }
    public void setCalisma_saati(int calisma_saati) { this.calisma_saati = calisma_saati; }

    public int getGorev() {
        return gorev;
    }

    public void setGorev(int gorev) {
        this.gorev = gorev;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDogum_tarihi() {
        return dogum_tarihi;
    }

    public void setDogum_tarihi(Date dogum_tarihi) {
        this.dogum_tarihi = dogum_tarihi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}

