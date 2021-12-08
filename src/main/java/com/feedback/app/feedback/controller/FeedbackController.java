package com.feedback.app.feedback.controller;

import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.service.FeedbackNotFoundException;
import com.feedback.app.feedback.service.FeedbackService;
import com.feedback.app.user.dto.UserDTO;
import io.swagger.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/v1/feedbacks")
public class FeedbackController {

    private FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping("{id}")
    public ResponseEntity<FeedbackDTO> getFeedbackById(@PathVariable Long id) {
        return ResponseEntity.ok(feedbackService.getFeedbackById(id));
    }

    @GetMapping("/latest")
    public ResponseEntity<List<FeedbackDTO>> getLatestFeedbacks(@RequestParam(defaultValue = "5") int amount){
        return ResponseEntity.ok(feedbackService.getLatestFeedbacks(amount));
    }

    @PostMapping
    public ResponseEntity<FeedbackDTO> addNewUser(@RequestBody FeedbackDTO feedback) {
        FeedbackDTO createdFeedback = feedbackService.addNewFeedback(feedback);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdFeedback.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdFeedback);
    }

}
