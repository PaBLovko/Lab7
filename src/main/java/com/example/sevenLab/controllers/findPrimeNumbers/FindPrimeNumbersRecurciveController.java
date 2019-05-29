package com.example.sevenLab.controllers.findPrimeNumbers;

import com.example.sevenLab.logic.findPrimeNumber.FindPrimeNumbersRecurcive;
import com.example.sevenLab.logic.findPrimeNumber.Prime;
import com.example.sevenLab.logic.myException.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FindPrimeNumbersRecurciveController implements Prime {

    @Autowired
    FindPrimeNumbersRecurcive findPrimeNumbers;

    @RequestMapping(value = "/findPrimeNumbersRecursive", method = RequestMethod.GET)
    @ResponseBody
    public List<Integer> findPrimeNumbers(@RequestBody List<Integer> list) throws MyException {
        return findPrimeNumbers.findPrimeNumbers(list);
    }
}
