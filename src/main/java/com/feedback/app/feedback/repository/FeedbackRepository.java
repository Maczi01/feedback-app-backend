package com.feedback.app.feedback.repository;

import com.feedback.app.feedback.model.Feedback;
import com.feedback.app.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

    List<Feedback> getFeedbackByProductId(Long id);


}
