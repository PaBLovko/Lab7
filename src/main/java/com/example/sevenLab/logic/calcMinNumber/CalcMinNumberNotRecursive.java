package com.example.sevenLab.logic.calcMinNumber;

import com.example.sevenLab.logic.myException.ErrorCode;
import com.example.sevenLab.logic.myException.MyException;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.NoSuchElementException;

@Component
public class CalcMinNumberNotRecursive{

    public int minElem(List<Integer> list) throws MyException {
        try{
            return list.stream().mapToInt(v->v).min().orElseThrow(NoSuchElementException::new);
        }catch (NoSuchElementException e) {throw new MyException(ErrorCode.NotFindElem);}
    }
}