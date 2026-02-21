package edu.university.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void shouldReturnNumberWhenNotMultipleOf3Or5() {
        // Arrange
        int input = 1;
        String expected = "1";
        // Act
        String actual = FizzBuzz.fizzbuzz(input);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFizzWhenMultipleOf3() {
        int input = 3;
        String expected = "Fizz";
        String actual = FizzBuzz.fizzbuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnBuzzWhenMultipleOf5() {
        int input = 5;
        String expected = "Buzz";
        String actual = FizzBuzz.fizzbuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFizzBuzzWhenMultipleOf3And5() {
        int input = 15;
        String expected = "FizzBuzz";
        String actual = FizzBuzz.fizzbuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFizzBuzzWhenZero() {
        int input = 0;
        String expected = "FizzBuzz";
        String actual = FizzBuzz.fizzbuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFizzWhenNegativeMultipleOf3() {
        int input = -3;
        String expected = "Fizz";
        String actual = FizzBuzz.fizzbuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnBuzzWhenNegativeMultipleOf5() {
        int input = -5;
        String expected = "Buzz";
        String actual = FizzBuzz.fizzbuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFizzBuzzWhenNegativeMultipleOf3And5() {
        int input = -15;
        String expected = "FizzBuzz";
        String actual = FizzBuzz.fizzbuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFizzWhenLargeMultipleOf3() {
        int input = 99999;
        String expected = "Fizz";
        String actual = FizzBuzz.fizzbuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnNumberWhenNotMultipleOf3Or5Positive() {
        int input = 2;
        String expected = "2";
        String actual = FizzBuzz.fizzbuzz(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnNumberWhenNotMultipleOf3Or5Negative() {
        int input = -2;
        String expected = "-2";
        String actual = FizzBuzz.fizzbuzz(input);
        assertEquals(expected, actual);
    }
}
