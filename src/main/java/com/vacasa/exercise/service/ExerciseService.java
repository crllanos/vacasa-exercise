package com.vacasa.exercise.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ExerciseService {

    public String handler(String q){

        // sums integers
        if(q.contains(",") && Arrays.stream(q.split(",")).allMatch(d -> d.matches("\\d+"))){
            return Arrays.stream(q.split(",")).mapToInt(Integer::valueOf).sum() + "";
        }

        // sums float point decimals
        if(q.contains(",") && Arrays.stream(q.split(",")).allMatch(d -> d.matches("[+-]?([0-9]*[.])?[0-9]+"))){
            return Arrays.stream(q.split(",")).mapToDouble(Double::valueOf).sum() + "";
        }

        // counts letters from a string
        List<String> aeiou = Arrays.asList("a", "e", "i", "o", "u");
        Long words = Arrays.stream(q.split(" ")).count();
        Long vowels =  Arrays.stream(q.split("")).filter(aeiou::contains).count();
        Long cons =  Arrays.stream(q.split("")).filter(s -> !aeiou.contains(s)).count();
        return String.format("words: %d, vowels: %d, consonants:%d, q:%s", words, vowels, cons, q);
    }
}
