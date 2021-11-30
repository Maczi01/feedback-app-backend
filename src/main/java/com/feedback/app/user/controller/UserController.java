package com.feedback.app.user.controller;

import com.feedback.app.user.dto.UserDTO;
import com.feedback.app.user.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public UserDTO addNewUser(@RequestBody UserDTO userDTO) {
        return userService.addNewUser(userDTO);
    }
}
