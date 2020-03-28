package com.akademiakodu.countriesdocker.service;

import com.akademiakodu.countriesdocker.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

}
