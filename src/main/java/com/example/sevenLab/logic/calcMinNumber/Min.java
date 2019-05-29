package com.example.sevenLab.logic.calcMinNumber;

import com.example.sevenLab.logic.myException.MyException;

import java.util.List;

public interface Min {
    int minElem(List<Integer> list) throws MyException;
}