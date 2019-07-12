package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Hastalik", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "ICD10"))

public class Hastalik {

    @Column(unique = true)
    private String IDD10;

    private String isim;

    public String getIDD10() {
        return IDD10;
    }

    public String getIsim() {
        return isim;
    }

    public void setIDD10(String IDD10) {
        this.IDD10 = IDD10;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
