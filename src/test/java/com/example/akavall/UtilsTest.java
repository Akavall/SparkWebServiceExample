package com.example.akavall;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {
    @Test
    public void isPrime() throws Exception {
        boolean result = Utils.isPrime(13);
        boolean expectedResult = true;

        assertEquals(result, expectedResult);
    }
}