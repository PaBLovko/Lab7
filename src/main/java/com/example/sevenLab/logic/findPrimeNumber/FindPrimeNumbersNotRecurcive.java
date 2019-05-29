package com.example.sevenLab.logic.findPrimeNumber;
import org.springframework.stereotype.Component;

import com.example.sevenLab.logic.myException.ErrorCode;
import com.example.sevenLab.logic.myException.MyException;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FindPrimeNumbersNotRecurcive {

    public List<Integer> findPrimeNumbers(List<Integer> list) throws MyException {
        if (list.isEmpty()){
            throw new MyException(ErrorCode.NotFindElem);
        }
        return list.stream().filter(IsPrime::isPrime).collect(Collectors.toList());
    }
}
