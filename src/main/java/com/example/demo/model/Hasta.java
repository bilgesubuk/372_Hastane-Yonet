package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "hasta", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "hastaTc"))
public class Hasta {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    private Long id;

    @Column(unique = true)
    private Long hastaTc;

    private String isim;
    private String soyisim;
    private String kan;
    private String cinsiyet;
    private String yas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHastaTc() {
        return hastaTc;
    }

    public void setHastaTc(Long hastaTc) {
        this.hastaTc = hastaTc;
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

    public String getKan() {
        return kan;
    }

    public void setKan(String kan) {
        this.kan = kan;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }
}
