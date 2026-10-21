package com.cfchan0318.springboot.learnspringboot.rest;

import com.cfchan0318.springboot.learnspringboot.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field
    private Coach myCoach;
    private  Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach){
        System.out.println("In constructor:"+ getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }


    /*public DemoController(Coach theCoach){
        myCoach = theCoach;
    }*/
    /*@Autowired
    public void doSomething(Coach theCoach){
        myCoach = theCoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach, "+ (myCoach == anotherCoach);
    }
}
