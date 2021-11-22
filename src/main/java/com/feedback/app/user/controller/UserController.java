package com.feedback.app.user.controller;

import com.feedback.app.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private UserService userService;


}
