package com.feedback.app.feedback.model;

import com.feedback.app.product.model.Product;
import com.feedback.app.user.model.User;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "feedbacks")
public class Feedback {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private Date date;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
    private Double grade;

}
