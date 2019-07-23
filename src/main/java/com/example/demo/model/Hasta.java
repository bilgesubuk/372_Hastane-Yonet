package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "hasta", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "hasta_tc"))
public class Hasta {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    private Long id;

    @Column(unique = true)
    private Long hasta_tc;

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
        return hasta_tc;
    }

    public void setHastaTc(Long hastaTc) {
        this.hasta_tc = hastaTc;
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

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Ameliyat> ameliyat;

    public void setAmeliyat(Set<Ameliyat> ameliyat) {
        this.ameliyat = ameliyat;
    }

    public Set<Ameliyat> getAmeliyat() {
        return ameliyat;
    }

    @ManyToMany
    private Set<Doktor> employees = new HashSet<>();
}
