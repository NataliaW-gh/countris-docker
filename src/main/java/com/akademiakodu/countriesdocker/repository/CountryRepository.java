package com.akademiakodu.countriesdocker.repository;

import com.akademiakodu.countriesdocker.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

    //metoda abstrakcyjna wyciagajaca państwo po zaanym kodzie

    Country findByCode(String code);
}
