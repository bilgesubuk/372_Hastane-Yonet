package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Hastalik", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "ICD10"))

public class Hastalik {

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
    private String ICD10;

    private String isim;

    public String getICD10() {
        return ICD10;
    }

    public String getIsim() {
        return isim;
    }

    public void setICD10(String ICD10) {
        this.ICD10 = ICD10;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @ManyToMany
    private Set<Hasta> hasta = new HashSet<>();

    @ManyToMany
    private Set<Doktor> doktor = new HashSet<>();
}
