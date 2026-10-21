package com.cfchan0318.springboot.learnspringboot.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes!!!!!!!!!!!!!!";
    }
}
