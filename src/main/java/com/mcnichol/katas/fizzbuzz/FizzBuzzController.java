package com.mcnichol.katas.fizzbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fizzbuzz")
public class FizzBuzzController {
    private FizzBuzz fizzBuzz;

    @Autowired
    FizzBuzzController(FizzBuzz fizzBuzz){
        this.fizzBuzz = fizzBuzz;
    }

    @RequestMapping("/{input}")
    public ResponseEntity<FizzBuzzResponse> getFizzBuzz(@PathVariable("input") Integer input){

      return new ResponseEntity<>(new FizzBuzzResponse(fizzBuzz.execute(input)), HttpStatus.OK);
    }
}
