package com.example.sevenLab.findPrimeNumberTest;

import com.example.sevenLab.logic.findPrimeNumber.FindPrimeNumbersNotRecurcive;
import com.example.sevenLab.logic.myException.MyException;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FindPrimeNumbersNotRecurciveTest {

    private FindPrimeNumbersNotRecurcive findPrimeNumbersNotRecurcive = new FindPrimeNumbersNotRecurcive();

    @Test
    public void findPrimeNumbers() throws MyException {
        assertThat("Массив простых чисел", findPrimeNumbersNotRecurcive.findPrimeNumbers(Arrays.asList(50, 11, 3, 4, 42)),
                CoreMatchers.hasItems(3,11));
    }

    @Test(expected = MyException.class)
    public void findPrimeNumbers1() throws MyException {
        assertThat("Массив простых чисел", findPrimeNumbersNotRecurcive.findPrimeNumbers(Arrays.asList()),
                CoreMatchers.hasItems(3,11));
    }
}