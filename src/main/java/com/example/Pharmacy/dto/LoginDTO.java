package com.example.Pharmacy.dto;

import com.example.Pharmacy.model.Farmacista;
import com.example.Pharmacy.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class LoginDTO {


    private String username;

    private  String password;


}
