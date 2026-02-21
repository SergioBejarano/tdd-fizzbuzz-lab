package edu.university.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void testFizzBuzzReturnsNumber() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }

    @Test
    void testFizzBuzzMultiplo3() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    }

    @Test
    void testFizzBuzzMultiplo5() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    }

    @Test
    void testFizzBuzzMultiplo3y5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }

        @Test
        void testFizzBuzzZero() {
            assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(0));
        }

        @Test
        void testFizzBuzzNegativeThree() {
            assertEquals("Fizz", FizzBuzz.fizzbuzz(-3));
        }

        @Test
        void testFizzBuzzNegativeFive() {
            assertEquals("Buzz", FizzBuzz.fizzbuzz(-5));
        }

        @Test
        void testFizzBuzzNegativeFifteen() {
            assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(-15));
        }

        @Test
        void testFizzBuzzLargeNumber() {
            assertEquals("Fizz", FizzBuzz.fizzbuzz(99999));
        }

        @Test
        void testFizzBuzzNotMultiple() {
            assertEquals("2", FizzBuzz.fizzbuzz(2));
            assertEquals("-2", FizzBuzz.fizzbuzz(-2));
        }
}
