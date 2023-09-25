package com.example.Pharmacy.service;


import com.example.Pharmacy.converter.UserConverter;
import com.example.Pharmacy.dao.UserRepository;
import com.example.Pharmacy.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    @Autowired
    UserConverter converter;

    public UserDTO findByUsernameAndPassword(String username, String password){
        return converter.toDto(((UserRepository)repository).findByUsernameAndPassword(username, password));
    }

    public UserDTO find(Long id){
       return converter.toDto(((UserRepository)repository).findByIdUser(id));
    }
}
