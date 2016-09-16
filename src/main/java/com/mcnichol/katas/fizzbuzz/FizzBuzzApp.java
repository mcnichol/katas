package com.mcnichol.katas.fizzbuzz;

public class FizzBuzzApp {

    public String execute(Integer userInput) {
        validate(userInput);

        String result;

        if (isInputDivisibleBy(15, userInput)) {
            result = "FizzBuzz";
        } else if (isInputDivisibleBy(3, userInput)) {
            result = "Fizz";
        } else if (isInputDivisibleBy(5, userInput)) {
            result = "Buzz";
        } else {
            result = String.valueOf(userInput);
        }

        return result;
    }

    private void validate(Integer userInput) {
        if(userInput == 0){
            throw new IllegalArgumentException("Input value must be greater than 0");
        }
    }

    private boolean isInputDivisibleBy(Integer divisor, Integer userInput) {
        return userInput % divisor == 0;
    }
}