package com.example.springboot_sample.controller;

import com.example.springboot_sample.util.MyProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HelloController {
    private final MyProperties myProperties;


    @GetMapping
    public ResponseEntity<MyProperties> hello() {
        return ResponseEntity.ok(myProperties);
    }
}
