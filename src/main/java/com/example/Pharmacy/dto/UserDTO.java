package com.example.Pharmacy.dto;

import com.example.Pharmacy.model.User;
import com.example.Pharmacy.model.User.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private Long id;

    private String username;

    private String password;

    private UserType userType;


}


