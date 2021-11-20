package com.feedback.app.user.dto;

import com.feedback.app.feedback.model.Feedback;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
public class UserDTO {

    private Long id;
    private String name;
    private String email;

}
