package com.example.sevenLab.controllers.findPrimeNumbers;

import com.example.sevenLab.logic.findPrimeNumber.FindPrimeNumbersNotRecurcive;
import com.example.sevenLab.logic.findPrimeNumber.Prime;
import com.example.sevenLab.logic.myException.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FindPrimeNumbersNotRecurciveController implements Prime {

    @Autowired
    FindPrimeNumbersNotRecurcive findPrimeNumbers;

    @RequestMapping(value = "/findPrimeNumbersNotRecursive", method = RequestMethod.GET)
    @ResponseBody
    public List<Integer> findPrimeNumbers(@RequestBody List<Integer> list) throws MyException {
        return findPrimeNumbers.findPrimeNumbers(list);
    }
}
