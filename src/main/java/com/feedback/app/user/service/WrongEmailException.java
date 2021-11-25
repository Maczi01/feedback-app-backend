package com.feedback.app.user.service;


public class WrongEmailException extends Exception{
    public WrongEmailException(String message) {
        super(message);
    }
}
