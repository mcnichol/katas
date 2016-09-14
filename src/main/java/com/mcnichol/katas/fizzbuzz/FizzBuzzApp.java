package com.mcnichol.katas.fizzbuzz;

public class FizzBuzzApp {

    public String execute(Integer userInput) {
        String result;

        if (userInput % 3 == 0) {
            result = "Fizz";
        } else if (userInput == 5) {
            result = "Buzz";
        } else {
            result = String.valueOf(userInput);
        }

        return result;
    }
}