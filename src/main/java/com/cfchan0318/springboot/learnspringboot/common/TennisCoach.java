package com.cfchan0318.springboot.learnspringboot.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practise your backhand volley";
    }
}
