package com.feedback.app.user.service;

import com.feedback.app.feedback.dto.FeedbackDTO;
import com.feedback.app.feedback.mapper.FeedbackMapper;
import com.feedback.app.product.model.Product;
import com.feedback.app.product.service.ProductNotFoundException;
import com.feedback.app.user.dto.UserDTO;
import com.feedback.app.user.mapper.UserMapper;
import com.feedback.app.user.model.User;
import com.feedback.app.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;
    private FeedbackMapper feedbackMapper;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO getUserById(Long id) {
        User userById = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Can not find product with id: " + id));
        UserDTO userDTO = userMapper.toDTO(userById);
        List<FeedbackDTO> collect = userById.getFeedbacks()
                .stream()
                .map(feedback -> feedbackMapper.toDTO(feedback))
                .collect(Collectors.toList());
        userDTO.setFeedbackList(collect);
        return userDTO;
    }

    public UserDTO addNewUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        User savedUser = userRepository.save(user);
        return userMapper.toDTO(savedUser);
    }
}

