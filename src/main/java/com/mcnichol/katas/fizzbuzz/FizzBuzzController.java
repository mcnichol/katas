package com.mcnichol.katas.fizzbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {
    private FizzBuzz fizzBuzz;

    @Autowired
    FizzBuzzController(FizzBuzz fizzBuzz){
        this.fizzBuzz = fizzBuzz;
    }

}
