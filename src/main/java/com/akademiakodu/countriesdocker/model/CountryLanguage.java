package com.akademiakodu.countriesdocker.model;

import jdk.jfr.events.CertificateId;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table (name = "country_language")
public class CountryLanguage {

    @Id
    @Column(name= "code")
    private String code;

    @Column(name = "language")
    private String language;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
