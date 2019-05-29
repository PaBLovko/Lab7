package com.example.sevenLab.logic.findPrimeNumber;

import com.example.sevenLab.logic.myException.MyException;

import java.util.List;

public interface Prime {
    List<Integer> findPrimeNumbers(List<Integer> list) throws MyException;
}