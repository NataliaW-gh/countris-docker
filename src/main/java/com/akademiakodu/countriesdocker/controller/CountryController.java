package com.akademiakodu.countriesdocker.controller;

import com.akademiakodu.countriesdocker.model.Country;
import com.akademiakodu.countriesdocker.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/{code}")
    public String getCountryInfo(@PathVariable String code) {
        Country country = new Country();
    }

}
