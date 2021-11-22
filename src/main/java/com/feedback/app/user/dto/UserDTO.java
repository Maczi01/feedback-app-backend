package com.feedback.app.user.dto;

import com.feedback.app.feedback.dto.FeedbackDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private List<FeedbackDTO> feedbackList = new ArrayList<>();
}
