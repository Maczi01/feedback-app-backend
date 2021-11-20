package com.feedback.app.feedback.dto;

import com.feedback.app.feedback.model.Feedback;
import com.feedback.app.product.model.Product;
import com.feedback.app.user.model.User;
import lombok.Builder;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Builder
public class FeedbackDTO {

    private Long id;
    private String title;
    private String description;
    private Date date;
    private String user;
    private String product;
    private Double grade;

}
