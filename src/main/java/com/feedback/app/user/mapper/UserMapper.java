package com.feedback.app.user.mapper;

import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.dto.FeedbackMapper;
import com.feedback.app.user.dto.UserDTO;
import com.feedback.app.user.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public UserDTO entityToDTO(User user){
        return UserDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .build();
    }

}
