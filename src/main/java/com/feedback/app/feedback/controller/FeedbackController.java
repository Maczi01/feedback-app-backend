package com.feedback.app.feedback.controller;

import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.mapper.FeedbackMapper;
import com.feedback.app.feedback.model.Feedback;
import com.feedback.app.feedback.service.FeedbackNotFoundException;
import com.feedback.app.feedback.service.FeedbackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping("/latest")
    public List<FeedbackDTO> getLatestFeedbacks(@RequestParam(defaultValue = "5") int amount){
        return feedbackService.getLatestFeedbacks(amount).stream()
                .map(feedback -> feedbackMapper.toEntity(feedback))
                .collect(Collectors.toList());
    }


}
