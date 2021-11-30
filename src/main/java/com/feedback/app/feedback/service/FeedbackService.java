package com.feedback.app.feedback.service;

import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.mapper.FeedbackMapper;
import com.feedback.app.feedback.model.Feedback;
import com.feedback.app.feedback.repository.FeedbackRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeedbackService {

    private FeedbackRepository feedbackRepository;
    private FeedbackMapper feedbackMapper;


    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public List<Feedback> getFeedbackByUserId(Long id) {
       return feedbackRepository.getFeedbackByUserId(id);
    }

    public FeedbackDTO getFeedbackById(Long id) throws FeedbackNotFoundException {
        Feedback feedback = feedbackRepository.findById(id)
                .orElseThrow(() -> new FeedbackNotFoundException("Can not find product with id: " + id));
        return feedbackMapper.toDTO(feedback);
    }

    public List<Feedback> getFeedbackByProductId(Long id) {
        return feedbackRepository.getFeedbackByProductId(id);
    }

    public List<FeedbackDTO> getLatestFeedbacks(int amount) {
        return feedbackRepository.getLatestFeedbacks(amount)
                .stream()
                .map(feedback -> feedbackMapper.toDTO(feedback))
                .collect(Collectors.toList());
    }
}
