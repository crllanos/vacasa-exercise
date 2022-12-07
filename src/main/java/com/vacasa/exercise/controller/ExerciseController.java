package com.vacasa.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/v1/")
public class ExerciseController {

    @GetMapping(params = "q")
    public String handler(@RequestParam("q") String q){
        return "holi";
    }

}
