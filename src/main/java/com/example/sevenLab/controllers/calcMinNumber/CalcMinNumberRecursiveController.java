package com.example.sevenLab.controllers.calcMinNumber;

import com.example.sevenLab.logic.calcMinNumber.CalcMinNumberRecursive;
import com.example.sevenLab.logic.calcMinNumber.Min;
import com.example.sevenLab.logic.myException.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalcMinNumberRecursiveController implements Min {

    @Autowired
    CalcMinNumberRecursive minElem;

    @RequestMapping(value = "/сalcMinNumberRecursive", method = RequestMethod.GET)
    @ResponseBody
    public int minElem(@RequestBody List<Integer> list) throws MyException {
        return minElem.minElem(list);
    }
}
