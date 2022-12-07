package com.vacasa.exercise.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ExerciseServiceTest {

    @InjectMocks
    private ExerciseService service;

    @Test
    public void shouldAddInt_ok(){
        Assertions.assertEquals(service.handler("1+1+2"), "4");
    }

    @Test
    public void shouldAddInt_error(){
        Assertions.assertNotEquals(service.handler("2+2"), "5");
    }

    @Test
    public void shouldAddDouble_ok(){
        Assertions.assertEquals(service.handler("2.5+2.5"), "5.0");
    }

    @Test
    public void shouldCountLetters_ok(){
        Assertions.assertEquals(service.handler("la copa se mira"), "5.0");
    }
}