package com.feedback.app.user.mapper;

import com.feedback.app.common.Mapper;
import com.feedback.app.user.dto.UserDTO;
import com.feedback.app.user.model.Email;
import com.feedback.app.user.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<UserDTO, User> {


    @Override
    public UserDTO toDTO(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .email(new Email().getEmail())
                .name(user.getName())
                .build();
    }

    @Override
    public User toEntity(UserDTO user) {
        return User.builder()
                .id(user.getId())
                .email(new Email())
                .name(user.getName())
                .build();
    }
}