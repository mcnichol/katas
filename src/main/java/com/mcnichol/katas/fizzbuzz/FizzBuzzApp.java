package com.mcnichol.katas.fizzbuzz;

public class FizzBuzzApp {

    public String execute(Integer userInput) {
        String result;

        if (isInputDivisibleBy(3, userInput)) {
            result = "Fizz";
        } else if (isInputDivisibleBy(5, userInput)) {
            result = "Buzz";
        } else {
            result = String.valueOf(userInput);
        }

        return result;
    }

    private boolean isInputDivisibleBy(Integer divisor, Integer userInput) {
        return userInput % divisor == 0;
    }
}