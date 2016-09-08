package com.mcnichol.katas.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class FizzBuzzAppTest {
    @Test
    public void execute_passedIntegerOne_returnsStringOne() throws Exception {
        FizzBuzzApp subject = new FizzBuzzApp();

        String actual = subject.execute(1);

        assertThat(actual, equalTo("1"));
    }

    @Test
    public void execute_passedIntegerTwo_returnsStringTwo() throws Exception {
        FizzBuzzApp subject = new FizzBuzzApp();

        String actual = subject.execute(2);

        assertThat(actual, equalTo("2"));
    }
}