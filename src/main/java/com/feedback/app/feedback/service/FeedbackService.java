package com.feedback.app.feedback.service;

import com.feedback.app.feedback.model.Feedback;
import com.feedback.app.feedback.repository.FeedbackRepository;
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

    public Feedback getFeedbackById(Long id) throws FeedbackNotFoundException {
        return feedbackRepository.findById(id)
                .orElseThrow(() -> new FeedbackNotFoundException("Can not find product with id: " + id));
    }

    public List<Feedback> getFeedbackByProductId(Long id) {
        return feedbackRepository.getFeedbackByProductId(id);
    }
}
