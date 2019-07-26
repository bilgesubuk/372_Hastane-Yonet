package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Randevu", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "id"))
public class Randevu {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    private String randevu_tarihi;

    private int startTime;
    private int endTime;

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public String getRandevu_tarihi() {
        return randevu_tarihi;
    }

    public void setRandevu_tarihi(String randevu_tarihi) {
        this.randevu_tarihi = randevu_tarihi;
    }

    @ManyToOne
    private Sekreter sekreter;

    public Sekreter getSekreter() {
        return sekreter;
    }

    public void setSekreter(Sekreter sekreter) {
        this.sekreter = sekreter;
    }
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    private Doktor doktor;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    private Hasta hasta;

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }
}
