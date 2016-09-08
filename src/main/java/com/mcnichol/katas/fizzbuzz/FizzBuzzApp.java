package com.mcnichol.katas.fizzbuzz;

public class FizzBuzzApp {

    public String execute(Integer userInput) {
        String result;
        if (userInput == 3) {
            result = "Fizz";
        } else if (userInput == 1) {
            result = "1";
        } else {
            result = "2";
        }

        return result;
    }
}
