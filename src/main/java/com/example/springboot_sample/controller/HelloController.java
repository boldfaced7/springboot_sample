package com.example.springboot_sample.controller;

import com.example.springboot_sample.service.RedisService;
import com.example.springboot_sample.util.MyProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HelloController {
    private final MyProperties myProperties;
    private final RedisService redisService;

    @GetMapping
    public ResponseEntity<?> hello() {
        redisService.setValues(myProperties.getTest1(), myProperties.getTest2());
        String key = myProperties.getTest1();
        String values = redisService.getValues(myProperties.getTest1());
        return ResponseEntity.ok(key + values);
    }
}
