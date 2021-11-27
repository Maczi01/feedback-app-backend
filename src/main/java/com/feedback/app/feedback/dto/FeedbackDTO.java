package com.feedback.app.feedback.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Builder
@Getter
@Setter
public class FeedbackDTO {

    private Long id;
    private String title;
    private String description;
    private Date date;
    private String user;
    private String product;
    private Double grade;

}
