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

}
