package com.example.Pharmacy.converter;

import com.example.Pharmacy.dto.UserDTO;
import com.example.Pharmacy.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public User toEntity(UserDTO userDTO){
        User user = null;
         if(userDTO != null){
//             user = new User();
             user = User.builder()
                     .id(userDTO.getId())
                     .username(userDTO.getUsername())
                     .password(userDTO.getPassword())
                     .userType(userDTO.getUserType())
                     .build();
         }
        return user;
    }

    public UserDTO toDto(User user){
        UserDTO userDTO = null;

        if(user != null){
//            userDTO = new UserDTO();
            userDTO = UserDTO.builder()
                    .id(user.getId())
                    .username(user.getUsername())
                    .password(user.getPassword())
                    .userType(user.getUserType())
                    .build();
        }

        return userDTO;
    }
}
