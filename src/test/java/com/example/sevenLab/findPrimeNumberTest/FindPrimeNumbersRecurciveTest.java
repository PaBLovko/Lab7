package com.example.sevenLab.findPrimeNumberTest;

import com.example.sevenLab.logic.findPrimeNumber.FindPrimeNumbersRecurcive;
import com.example.sevenLab.logic.myException.MyException;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FindPrimeNumbersRecurciveTest {

    private FindPrimeNumbersRecurcive findPrimeNumbersRecurcive = new FindPrimeNumbersRecurcive();

    @Test
    public void findPrimeNumbers() throws MyException {
        assertThat("Массив простых чисел",findPrimeNumbersRecurcive.findPrimeNumbers(Arrays.asList(50, 11, 3, 4, 42), new ArrayList<>(), 0),
                CoreMatchers.hasItems(3,11));
    }

    @Test(expected = MyException.class)
    public void findPrimeNumbers1() throws MyException {
        assertThat("Массив простых чисел",findPrimeNumbersRecurcive.findPrimeNumbers(Arrays.asList(), new ArrayList<>(), 0),
                CoreMatchers.hasItems(3,11));
    }
}