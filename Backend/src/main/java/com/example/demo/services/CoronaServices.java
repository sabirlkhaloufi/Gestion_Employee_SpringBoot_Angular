package com.example.demo.services;

import com.example.demo.model.Cases;
import com.example.demo.model.Country;
import com.example.demo.repository.CasesRepository;
import com.example.demo.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CoronaServices {
    @Autowired
    private CasesRepository casesRepo;
    @Autowired
    private CountryRepository countryRepository;


    public List<Cases> loadAllData(){

        List<Cases> cases = new ArrayList<>();

        casesRepo.findAll().forEach(cas->cases.add(cas));
        return  cases;
    }
    public List<Country> loadAllCountries(){
        return countryRepository.findAll();

    }
}
