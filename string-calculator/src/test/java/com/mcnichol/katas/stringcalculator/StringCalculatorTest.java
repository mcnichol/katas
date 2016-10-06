package com.mcnichol.katas.stringcalculator;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void setUp() throws Exception {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void add_takesEmptyString_returnsIntegerZero() throws Exception {
        Integer actual = stringCalculator.add("");
        assertThat(actual, equalTo(0));
    }

    @Test
    public void add_takesStringOne_returnsIntegerOne() throws Exception {
        Integer actual = stringCalculator.add("1");
        assertThat(actual, equalTo(1));
    }

    @Test
    public void add_takesStringOneAndTwo_returnsIntegerThree() throws Exception {
        Integer actual = stringCalculator.add("1,2");
        assertThat(actual, equalTo(3));
    }

    @Test
    public void add_takesNull_returnsIntegerZero() throws Exception {
        Integer actual = stringCalculator.add(null);
        assertThat(actual, equalTo(0));

    }

    @Test
    public void add_takesNewlineSeparatedNumbers_returnsSumOfNumbers() throws Exception {
        Integer actual = stringCalculator.add(("1\n2"));
        assertThat(actual,equalTo(3));
    }

    @Test
    public void add_takesCustomDelimiter_splitsOnCustomDelimiter_returnsTotal() throws Exception {
        Integer actual = stringCalculator.add("//:1:2");
        assertThat(actual, equalTo(3));
    }

    @Test
    public void add_takesNegativeNumber_throwsException(){
        try{
            stringCalculator.add("-1,2");
            fail("NegativeNotAllowed Runtime Exception should have been thrown");
        }catch(NegativeNotAllowed e){
            assertThat(e.getMessage(), equalTo("Negative Not Allowed: [-1]"));
        }
    }

    @Test
    public void add_takesMultipleNegativeNumbers_throwsException_showsAllNegatives(){
        try{
            stringCalculator.add("-1,2,-3,4");
            fail("NegativeNotAllowed Runtime Exception should have been thrown");
        }catch(NegativeNotAllowed e){
            assertThat(e.getMessage(), equalTo("Negative Not Allowed: [-1, -3]"));
        }
    }

    @Test
    public void add_ignoresNumbersLargerThan1000_returnsRemainingTotal() throws Exception {
        Integer actual = stringCalculator.add("1,2,1001");
        assertThat(actual, equalTo(3));
    }

    @Test
    public void add_takesDelimitersOfAnyLength_returnsTotal() throws Exception {
        Integer actual = stringCalculator.add("//[***]1***2");
        assertThat(actual, equalTo(3));
    }
}