package com.mcnichol.katas.stringcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public Integer add(String input) {
        int result = 0;

        if (input != null && input.length() > 0) {
            Pattern compile = Pattern.compile("-?\\d+");
            Matcher matcher = compile.matcher(input);

            List<Integer> inputValues = new ArrayList<>();
            while (matcher.find()) {
                int number = Integer.parseInt(matcher.group());
                inputValues.add(number);
            }

            List<Integer> negativeValues = new ArrayList<>();
            for (int value : inputValues) {
                if (value < 0) {
                    negativeValues.add(value);
                } else if (value <= 1000) {
                    result += value;
                }
            }

            if (negativeValues.size() > 0) {
                throw new NegativeNotAllowed(negativeValues.toString());
            }
        }

        return result;
    }
}