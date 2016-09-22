package com.mcnichol.katas.fizzbuzz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzControllerTest {

    @Mock FizzBuzz mockFizzBuzz;
    private MockMvc fizzBuzzController;

    @Before
    public void setUp() throws Exception {
        fizzBuzzController = MockMvcBuilders.standaloneSetup(new FizzBuzzController(mockFizzBuzz)).build();
    }

    @Test
    public void getFizzBuzz_passedInteger_returnsApplicationJSON_andResponseString() throws Exception {
        String expected = "1";
        doReturn(expected).when(mockFizzBuzz).execute(1);

        fizzBuzzController.perform(get("/fizzbuzz/{input}", 1))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.response").value(any(String.class)));
    }
}