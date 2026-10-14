package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPositiveNumbers() {
        int[] numbers = {10, 20, 30, 40, 50};
        assertEquals(150, App.sumArray(numbers));
    }

    @Test
    public void testNegativeNumbers() {
        int[] numbers = {-1, -2, -3};
        assertEquals(-6, App.sumArray(numbers));
    }

    @Test
    public void testMixedNumbers() {
        int[] numbers = {10, -5, 20};
        assertEquals(25, App.sumArray(numbers));
    }

    @Test
    public void testEmptyArray() {
        int[] numbers = {};
        assertEquals(0, App.sumArray(numbers));
    }

    @Test
    public void testSingleElement() {
        int[] numbers = {25};
        assertEquals(25, App.sumArray(numbers));
    }
}