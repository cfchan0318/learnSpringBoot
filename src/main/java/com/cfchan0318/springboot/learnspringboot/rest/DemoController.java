package com.cfchan0318.springboot.learnspringboot.rest;

import com.cfchan0318.springboot.learnspringboot.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field
    private Coach myCoach;

    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    /*@Autowired
    public void doSomething(Coach theCoach){
        myCoach = theCoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
