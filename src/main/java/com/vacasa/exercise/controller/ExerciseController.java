package com.vacasa.exercise.controller;

import com.vacasa.exercise.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class ExerciseController {

    @Autowired
    private ExerciseService service;

    @GetMapping("/exercise")
    public String handler(@RequestParam  String q){
        return service.handler(q);
    }

}
