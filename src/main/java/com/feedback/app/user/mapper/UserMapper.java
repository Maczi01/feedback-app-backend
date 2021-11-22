package com.feedback.app.user.mapper;

import com.feedback.app.user.dto.UserDTO;
import com.feedback.app.user.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO entityToDTO(User user){
        return UserDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail().getEmail())
                .build();
    }

}
