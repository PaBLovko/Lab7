package com.example.sevenLab.logic.calcMinNumber;

import com.example.sevenLab.logic.myException.ErrorCode;
import com.example.sevenLab.logic.myException.MyException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CalcMinNumberRecursive{

    public int minElem(List<Integer> list, int min, int index) throws MyException {
        if (list.isEmpty()){
            throw new MyException(ErrorCode.NotFindElem);
        }
        if(index == 0){
            min = list.get(index);
        }
        if(min > list.get(index)) {
            min = list.get(index);
        }
        if (index < list.size() - 1){
            return minElem(list,min,++index);
        }
        return min;
    }

    public int minElem(List<Integer> list) throws MyException {
        return minElem(list, 0 ,0);
    }
}
