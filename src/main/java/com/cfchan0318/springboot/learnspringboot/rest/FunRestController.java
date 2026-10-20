package com.cfchan0318.springboot.learnspringboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

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

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "today is good";
    }

}
