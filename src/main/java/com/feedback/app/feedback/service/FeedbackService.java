package com.feedback.app.feedback.service;

import com.feedback.app.feedback.model.Feedback;
import com.feedback.app.feedback.repository.FeedbackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FeedbackService {

    private FeedbackRepository feedbackRepository;

    public List<Feedback> getFeedbackForProduct(Long id){
        return feedbackRepository.getFeedbackByProductId(id);
    }




}
