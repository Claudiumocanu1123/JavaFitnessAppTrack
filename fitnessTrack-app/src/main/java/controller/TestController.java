package com.fitness.fitnessTrack_app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {
    @GetMapping("/test")
    public String sayHi()
    {
        return "salut eu sunt mario si sunt smecher";
    }
    @GetMapping("/salut")
    public int functie()
    {
       int a = 5;
       int b = 6;
       int suma = a+b;
       return suma;
    }

}
