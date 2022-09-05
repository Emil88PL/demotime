package com.exampletime.demotime;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    
    @Bean
    public String timenow() {
        String time = LocalTime.now().toString();
        return time;
    }
}
