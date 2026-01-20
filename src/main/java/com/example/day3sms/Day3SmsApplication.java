package com.example.day3sms;
//controller -> request
//service -> logic
//repository -> database
//model -> data schema
//controller (uses) -> sevice(buisness logic is written) -> repository(speak up to database)\

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day3SmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day3SmsApplication.class, args);
    }

}
