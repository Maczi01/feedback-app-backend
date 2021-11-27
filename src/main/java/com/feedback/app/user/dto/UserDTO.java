package com.feedback.app.user.dto;

import com.feedback.app.feedback.dto.FeedbackDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private List<FeedbackDTO> feedbackList;
}
