package com.example.springboot_sample.util;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Component
public class MyProperties {
    @Value("${test1}")
    String test1;

    @Value("${test2}")
    String test2;
}
