package com.feedback.app.user.controller;

import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.mapper.FeedbackMapper;
import com.feedback.app.feedback.service.FeedbackService;
import com.feedback.app.user.dto.UserDTO;
import com.feedback.app.user.mapper.UserMapper;
import com.feedback.app.user.model.User;
import com.feedback.app.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    private UserService userService;
    private UserMapper userMapper;
    private FeedbackMapper feedbackMapper;
    private FeedbackService feedbackService;

    public UserController(UserService userService, UserMapper userMapper, FeedbackMapper feedbackMapper, FeedbackService feedbackService) {
        this.userService = userService;
        this.userMapper = userMapper;
        this.feedbackMapper = feedbackMapper;
        this.feedbackService = feedbackService;
    }

    @GetMapping("/users/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        User userById = userService.getUserById(id);
        List<FeedbackDTO> feedbacksByUserId = feedbackService.getFeedbackByUserId(id)
                .stream()
                .map(feedback -> feedbackMapper.entityToDTO(feedback))
                .collect(Collectors.toList());
        UserDTO userDTO = userMapper.entityToDTO(userById);
        userDTO.setFeedbackList(feedbacksByUserId);
        return userDTO;
    }


}
