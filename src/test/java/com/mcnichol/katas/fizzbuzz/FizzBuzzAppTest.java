package com.mcnichol.katas.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class FizzBuzzAppTest {

    private FizzBuzzApp subject;

    @Before
    public void setUp() throws Exception {
        subject = new FizzBuzzApp();
    }

    @Test
    public void execute_passedIntegerOne_returnsStringOne() throws Exception {
        String actual = subject.execute(1);

        assertThat(actual, equalTo("1"));
    }

    @Test
    public void execute_passedIntegerTwo_returnsStringTwo() throws Exception {
        String actual = subject.execute(2);

        assertThat(actual, equalTo("2"));
    }
}