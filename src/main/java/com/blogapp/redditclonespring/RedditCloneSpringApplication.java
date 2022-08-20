package com.blogapp.redditclonespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class RedditCloneSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedditCloneSpringApplication.class, args);
    }

}
