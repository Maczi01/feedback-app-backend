package com.feedback.app.feedback.dto;

import com.feedback.app.feedback.model.Feedback;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class FeedbackMapper {

    public FeedbackDTO entityToDTO(Feedback feedback){
        return FeedbackDTO.builder()
                .id(feedback.getId())
                .title(feedback.getTitle())
                .description(feedback.getDescription())
                .product(feedback.getProduct().getName())
                .date(feedback.getDate())
                .grade(feedback.getGrade())
                .build();
    }


}
