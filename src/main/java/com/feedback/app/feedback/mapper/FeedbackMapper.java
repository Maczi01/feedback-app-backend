package com.feedback.app.feedback.mapper;

import com.feedback.app.common.Mapper;
import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.model.Feedback;
import com.feedback.app.user.dto.UserDTO;
import com.feedback.app.user.mapper.UserMapper;
import com.feedback.app.user.model.User;
import com.feedback.app.user.service.WrongEmailException;
import org.springframework.stereotype.Component;

@Component
public class FeedbackMapper implements Mapper {

    private UserMapper userMapper;

    public FeedbackMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public FeedbackDTO entityToDTO(Feedback feedback) {
        return FeedbackDTO.builder()
                .id(feedback.getId())
                .title(feedback.getTitle())
                .description(feedback.getDescription())
                .user(userMapper.entityToDTO(feedback.getUser()).getName())
                .product(feedback.getProduct().getName())
                .date(feedback.getDate())
                .grade(feedback.getGrade())
                .build();
    }

    public FeedbackDTO toEntity(Feedback feedback) {
        return FeedbackDTO.builder()
                .id(feedback.getId())
                .title(feedback.getTitle())
                .description(feedback.getDescription())
                .grade(feedback.getGrade())
                .date(feedback.getDate())
                .build();
    }

}
