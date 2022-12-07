package com.vacasa.exercise.service;

import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.util.Arrays;

@Service
public class ExerciseService {

    public String handler(String q){

        // sums integers
        if(q.contains("+") && Arrays.stream(q.split("\\+")).allMatch(d -> d.matches("\\d+"))){
            return Arrays.stream(q.split("\\+")).mapToInt(Integer::valueOf).sum() + "";
        }

        // sums float point decimals
        if(q.contains("+") && Arrays.stream(q.split("\\+")).allMatch(d -> d.matches("[+-]?([0-9]*[.])?[0-9]+"))){
            return Arrays.stream(q.split("\\+")).mapToDouble(Double::valueOf).sum() + "";
        }

        // counts letters from a string

        Long words = Arrays.stream(q.split(" ")).count();
        Long vowels =  Arrays.stream(q.split("\\+")).filter(d -> d.matches("/[aeiou]/gi")).count()   ;
        Long cons = 0l;
        return String.format("words: %d, vowels: %d, cons:%d", words, vowels, cons);
    }
}
