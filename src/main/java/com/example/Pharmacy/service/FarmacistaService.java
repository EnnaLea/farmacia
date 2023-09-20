package com.example.Pharmacy.service;


import com.example.Pharmacy.converter.FarmacistaConverter;
import com.example.Pharmacy.dao.FarmacistaRepository;
import com.example.Pharmacy.dto.FarmacistaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmacistaService {

    @Autowired
    FarmacistaRepository repository;

    @Autowired
    FarmacistaConverter converter;

    public FarmacistaDTO loginAdmin(String username, String password){
        return converter.toDto(repository.findByUsernameAndPassword(username, password));
    }

}
