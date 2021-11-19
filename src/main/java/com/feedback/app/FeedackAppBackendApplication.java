package com.feedback.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.feedback.app"})
public class FeedackAppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeedackAppBackendApplication.class, args);
    }
//    TODO I need enpoints:
//    users comments
//    ten best grades from last week


}
