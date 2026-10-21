package com.cfchan0318.springboot.learnspringboot.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practise your backhand volley";
    }
}
