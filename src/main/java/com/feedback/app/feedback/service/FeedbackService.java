package com.feedback.app.feedback.service;

import com.feedback.app.feedback.model.Feedback;
import com.feedback.app.feedback.repository.FeedbackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    private FeedbackRepository feedbackRepository;

    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public List<Feedback> getFeedbackByUserId(Long id) {
       return feedbackRepository.getFeedbackByUserId(id);
    }
}
