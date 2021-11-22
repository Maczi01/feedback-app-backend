package com.feedback.app.feedback.repository;

import com.feedback.app.feedback.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

//    @Query("select f from Feedback f join User.id on f.user.id")
    @Query(value = "select f.id, f.title, f.date, f.description, f.grade, f.product_id, f.user_id from feedback f join users u on f.user_id = u.id where f.user_id = :id", nativeQuery = true)
    List<Feedback> getFeedbackByUserId(@Param("id") Long id);

}
