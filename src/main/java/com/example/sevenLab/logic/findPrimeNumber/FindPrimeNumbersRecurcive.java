package com.example.sevenLab.logic.findPrimeNumber;

import com.example.sevenLab.logic.myException.ErrorCode;
import com.example.sevenLab.logic.myException.MyException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FindPrimeNumbersRecurcive {

    public List<Integer> findPrimeNumbers(List<Integer> list, List<Integer> result, int index) throws MyException {
        if (list.isEmpty()) {
            throw new MyException(ErrorCode.NotFindElem);
        }
        if(IsPrime.isPrime(list.get(index))){
            result.add(list.get(index));
        }
        if(index < list.size()-1){
            return findPrimeNumbers(list, result, ++index);
        }
        return result;
    }

    public List<Integer> findPrimeNumbers(List<Integer> list) throws MyException {
        return findPrimeNumbers(list, new ArrayList<>(), 0);
    }
}
