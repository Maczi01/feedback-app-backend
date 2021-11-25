package com.feedback.app.feedback.repository;

import com.feedback.app.feedback.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

    @Query("select f from Feedback as f inner join User u on f.user.id =  u.id where f.user.id = :id")
    List<Feedback> getFeedbackByUserId(@Param("id") Long id);

    @Query("select f from Feedback as f inner join Product p on f.user.id =  p.id where f.user.id = :id")
    List<Feedback> getFeedbackByProductId(@Param("id") Long id);

    @Query(value = "select f.id, f.title, f.description, f.date, f.grade, f.user_id, f.product_id" +
            " from feedbacks as f order by f.date desc limit :amount", nativeQuery = true)
    List<Feedback> getLatestFeedbacks(@Param("amount") int amount);
}

