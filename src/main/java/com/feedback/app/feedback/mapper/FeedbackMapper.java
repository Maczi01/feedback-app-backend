package com.feedback.app.feedback.mapper;

import com.feedback.app.common.Mapper;
import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.model.Feedback;
import com.feedback.app.user.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FeedbackMapper implements Mapper<FeedbackDTO, Feedback> {

    private UserMapper userMapper;

    public FeedbackMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Feedback toEntity(FeedbackDTO feedback) {
        return Feedback.builder()
                .id(feedback.getId())
                .title(feedback.getTitle())
                .description(feedback.getDescription())
                .grade(feedback.getGrade())
//                TODO - change method
                .date(new Date(feedback.getDate()))
                .build();
    }

    @Override
    public FeedbackDTO toDTO(Feedback feedback) {
        return FeedbackDTO.builder()
                .id(feedback.getId())
                .title(feedback.getTitle())
                .description(feedback.getDescription())
                .user(userMapper.toDTO(feedback.getUser()).getName())
                .product(feedback.getProduct().getName())
                .date(feedback.getDate().toString())
                .grade(feedback.getGrade())
                .build();
    }
}
