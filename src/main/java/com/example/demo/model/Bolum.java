package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "Bolum", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "isim"))

public class Bolum {

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

    @Column(unique = true)
    private String isim;

    public void setIsim(String isim) { this.isim = isim; }
    public String getIsim() { return isim; }


    @ManyToOne
    private Hastane hastane;

    public Hastane getHastane() {
        return hastane;
    }

    public void setHastane(Hastane hastane) {
        this.hastane = hastane;
    }

}
