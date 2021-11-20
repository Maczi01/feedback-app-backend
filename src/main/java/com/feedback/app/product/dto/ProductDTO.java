package com.feedback.app.product.dto;

import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.model.Feedback;
import com.feedback.app.product.model.Category;
import lombok.Builder;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Builder
public class ProductDTO {

    private Long id;
    private String name;
    List<String> categories = new ArrayList<>();
    private List<FeedbackDTO> feedbacks = new ArrayList<>();
    private Double averageGrade;

}
