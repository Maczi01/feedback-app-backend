package com.feedback.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableJpaRepositories
@SpringBootApplication(scanBasePackages = {
        "com.feedback.app.feedback",
        "com.feedback.app.product",
        "com.feedback.app.user"})
@EnableSwagger2
public class FeedbackAppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeedbackAppBackendApplication.class, args);
    }

}
