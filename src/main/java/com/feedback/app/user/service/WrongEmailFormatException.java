package com.feedback.app.user.service;

public class WrongEmailFormatException extends RuntimeException {
    public WrongEmailFormatException(String message) {
        super(message);
    }
}
