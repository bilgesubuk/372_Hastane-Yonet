package com.example.demo.model;
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
    private Date randevu_tarihi;

    public Date getRandevu_tarihi() {
        return randevu_tarihi;
    }


    public void setRandevu_tarihi(Date randevu_tarihi) {
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
}
