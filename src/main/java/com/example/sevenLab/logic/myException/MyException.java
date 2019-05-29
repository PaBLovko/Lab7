package com.example.sevenLab.logic.myException;

public class MyException extends Exception {

    private final com.example.sevenLab.logic.myException.ErrorCode code;

    public MyException(com.example.sevenLab.logic.myException.ErrorCode code) {
        super();
        this.code = code;
    }
}