package com.feedback.app.feedback.controller;

import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.mapper.FeedbackMapper;
import com.feedback.app.feedback.service.FeedbackNotFoundException;
import com.feedback.app.feedback.service.FeedbackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/feedbacks")
public class FeedbackController {

    private FeedbackService feedbackService;
    private FeedbackMapper feedbackMapper;

    public FeedbackController(FeedbackService feedbackService, FeedbackMapper feedbackMapper) {
        this.feedbackService = feedbackService;
        this.feedbackMapper = feedbackMapper;
    }

    @GetMapping("{id}")
    public FeedbackDTO getFeedbackById(@PathVariable Long id) throws FeedbackNotFoundException {
        return feedbackMapper.entityToDTO(feedbackService.getFeedbackById(id));
    }

}
