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

    @Test
    public void execute_passedIntegerThree_returnsFizz() throws Exception {
        String actual = subject.execute(3);

        assertThat(actual, equalTo("Fizz"));
    }

    @Test
    public void execute_passedIntegerFour_returnsStringFour() throws Exception {
        String actual = subject.execute(4);

        assertThat(actual, equalTo("4"));
    }

    @Test
    public void execute_passedIntegerFive_returnsBuzz() throws Exception {
        String actual = subject.execute(5);

        assertThat(actual, equalTo("Buzz"));
    }

    @Test
    public void execute_passedIntegerSix_returnsFizz() throws Exception {
        String actual = subject.execute(6);

        assertThat(actual, equalTo("Fizz"));
    }

    @Test
    public void execute_passedIntegerTen_returnsBuzz() throws Exception {
        String actual = subject.execute(10);

        assertThat(actual, equalTo("Buzz"));
    }

    @Test
    public void execute_passedIntegerFifteen_returnsFizzBuzz() throws Exception {
        String actual = subject.execute(15);

        assertThat(actual, equalTo("FizzBuzz"));
    }

    @Test
    public void execute_passedIntegerThirty_returnsFizzBuzz() throws Exception {
        String actual = subject.execute(30);

        assertThat(actual, equalTo("FizzBuzz"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void execute_passedIntegerZero_throwsException() throws Exception {
        subject.execute(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void execute_passedIntegerNegativeOne_throwsException() throws Exception {
        subject.execute(-1);
    }
}