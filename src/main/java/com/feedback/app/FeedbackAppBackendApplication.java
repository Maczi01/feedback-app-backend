package com.feedback.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@SpringBootApplication(scanBasePackages = {"app"})
public class FeedbackAppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeedbackAppBackendApplication.class, args);
    }

}
