package com.example.Pharmacy.controller;


import com.example.Pharmacy.dto.LoginDTO;
import com.example.Pharmacy.dto.UserDTO;
import com.example.Pharmacy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/login")
    public UserDTO login(@RequestBody LoginDTO loginDTO){

        return service.login(loginDTO.getUsername(), loginDTO.getPassword());

    }

    @GetMapping("/finduser")
    public UserDTO find(@RequestParam("id") Long id){
       return service.find(id);
    }


}
