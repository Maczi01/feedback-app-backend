package com.feedback.app.feedback.controller;

import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.mapper.FeedbackMapper;
import com.feedback.app.feedback.model.Feedback;
import com.feedback.app.feedback.service.FeedbackNotFoundException;
import com.feedback.app.feedback.service.FeedbackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("api/v1/feedbacks")
public class FeedbackController {

    private FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping("{id}")
    public FeedbackDTO getFeedbackById(@PathVariable Long id) throws FeedbackNotFoundException {
        return feedbackService.getFeedbackById(id);
    }

    @GetMapping("/latest")
    public List<FeedbackDTO> getLatestFeedbacks(@RequestParam(defaultValue = "5") int amount){
        return feedbackService.getLatestFeedbacks(amount);
    }


}
