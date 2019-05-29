package com.example.sevenLab.calcMinNumberTest;

import com.example.sevenLab.logic.calcMinNumber.CalcMinNumberRecursive;
import com.example.sevenLab.logic.myException.MyException;
import org.junit.Test;

import java.util.Arrays;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class CalcMinNumberRecursiveTest {

    private CalcMinNumberRecursive сalcMinNumberRecursive = new CalcMinNumberRecursive();

    @Test
    public void minElem() throws MyException {
        assertEquals("Minimum number",3, сalcMinNumberRecursive.minElem(Arrays.asList(50, 19, 3, 4, 42)));
    }

    @Test(expected = MyException.class)
    public void minElem1() throws MyException {
        assertEquals("Minimum number",3, сalcMinNumberRecursive.minElem(Arrays.asList()));
    }
}