package com.feedback.app.user.mapper;

import com.feedback.app.user.dto.UserDTO;
import com.feedback.app.user.model.Email;
import com.feedback.app.user.model.User;
import com.feedback.app.user.service.WrongEmailException;
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

    public User toEntity(UserDTO userDTO) throws WrongEmailException {
        return User.builder()
                .id(userDTO.getId())
                .email(new Email(userDTO.getEmail()))
                .name(userDTO.getName())
                .build();

    }
}
