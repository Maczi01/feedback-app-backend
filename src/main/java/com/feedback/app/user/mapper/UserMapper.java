package com.feedback.app.user.mapper;

import com.feedback.app.common.Mapper;
import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.user.dto.UserDTO;
import com.feedback.app.user.model.Email;
import com.feedback.app.user.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper implements Mapper<UserDTO, User> {

    @Override
    public UserDTO toDTO(User user) {
        List<FeedbackDTO> feedbackList = new ArrayList<>();
        return UserDTO.builder()
                .id(user.getId())
                .email(user.getEmail().getEmail())
                .name(user.getName())
                .feedbackList(feedbackList)
                .build();
    }

    @Override
    public User toEntity(UserDTO user) {
        return User.builder()
                .id(user.getId())
                .email(new Email(user.getEmail()))
                .name(user.getName())
                .build();
    }
}