package com.feedback.app.product.dto;

import com.feedback.app.feedback.dto.FeedbackDTO;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter

public class ProductDetailsDTO extends ProductDTO {

    private List<FeedbackDTO> feedbacks;

}
