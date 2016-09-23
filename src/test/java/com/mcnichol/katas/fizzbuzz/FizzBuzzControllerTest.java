package com.mcnichol.katas.fizzbuzz;

import org.hamcrest.core.StringContains;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.*;


@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzControllerTest {

    @Mock
    FizzBuzz mockFizzBuzz;
    private MockMvc fizzBuzzController;

    @Before
    public void setUp() throws Exception {
        fizzBuzzController = MockMvcBuilders.standaloneSetup(new FizzBuzzController(mockFizzBuzz)).build();
    }

    @Test
    public void getFizzBuzz_passedInteger_returnsApplicationJSON_andResponseString() throws Exception {
        String expected = "1";
        int userInput = 1;
        doReturn(expected).when(mockFizzBuzz).execute(userInput);

        fizzBuzzController.perform(get("/fizzbuzz/{input}", userInput))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.response").value(any(String.class)));
    }

    @Test
    public void getFizzBuzz_passedIntegerOne_returnsStringOne() throws Exception {
        int userInput = 1;
        String expected = "1";
        doReturn(expected).when(mockFizzBuzz).execute(userInput);

        fizzBuzzController.perform(get("/fizzbuzz/{input}", userInput))
                .andExpect(jsonPath("$.response").value(is(expected)));
    }

    @Test
    public void getFizzBuzz_passedIntegerTwo_returnsStringTwo() throws Exception {
        int userInput = 2;
        String expected = "2";
        doReturn(expected).when(mockFizzBuzz).execute(userInput);

        fizzBuzzController.perform(get("/fizzbuzz/{input}", userInput))
                .andExpect(jsonPath("$.response").value(is(expected)));
    }

    @Test
    public void getFizzBuzz_passedIntegerThree_returnsStringThree() throws Exception {
        int userInput = 3;
        String expected = "Fizz";
        doReturn(expected).when(mockFizzBuzz).execute(userInput);

        fizzBuzzController.perform(get("/fizzbuzz/{input}", userInput))
                .andExpect(jsonPath("$.response").value(is(expected)));
    }

    @Test
    public void getFizzBuzz_passedIntegerLessThanOne_handlesIllegalArgument() throws Exception {
        int userInput = 0;
        doThrow(IllegalArgumentException.class).when(mockFizzBuzz).execute(userInput);

        fizzBuzzController.perform(get("/fizzbuzz/{input}", userInput))
                .andExpect(status().isNotAcceptable())
                .andExpect(jsonPath("$.response").value(StringContains.containsString("Invalid Input:")));
    }
}