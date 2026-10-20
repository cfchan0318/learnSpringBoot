package com.cfchan0318.springboot.learnspringboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //Expos a "/" that returns hello world
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    // Expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Ran 5k";
    }

    @GetMapping("/team-info")
    public String getTeamInfo(){
        return "Coach: "+coachName+ ", Team Name: "+teamName;
     }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "today is good";
    }

}
