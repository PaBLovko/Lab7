package com.example.sevenLab.findPrimeNumberTest;

import com.example.sevenLab.logic.findPrimeNumber.IsPrime;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPrimeTest {

    @Test
    public void isPrime() {
        assertTrue("Число простое", IsPrime.isPrime(11));
    }
}