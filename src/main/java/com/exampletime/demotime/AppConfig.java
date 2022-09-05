package com.exampletime.demotime;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class AppConfig {
    
    @Bean
    public String timenow() {
        String time = LocalTime.now().toString();
        return time;
    }
    @Bean
    public String greeting() {
        return "Hello my friends";
    }
    @Bean
    @Scope("prototype")
    public String farewell() {
        return "Bay bay my friends";
    }
}
