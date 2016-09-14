package com.mcnichol.katas.fizzbuzz;

public class FizzBuzzApp {

    public String execute(Integer userInput) {
        String result;
        if (userInput == 3) {
            result = "Fizz";
        } else {
            result = String.valueOf(userInput);
        }

        return result;
    }
}
