package com.example.testspring.controller;

import com.example.testspring.aspect.ArithmeticCalculator;
import com.example.testspring.aspect.UnitCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ArithmeticCalculator arithmeticCalculator;

    @Autowired
    private UnitCalculator unitCalculator;

    @GetMapping
    public void test() {

        arithmeticCalculator.add(1, 2);
        arithmeticCalculator.sub(4, 3);
        arithmeticCalculator.mul(2, 3);
        arithmeticCalculator.div(4, 2);

        unitCalculator.kilogramToPound(10);
        unitCalculator.kilometerToMile(5);

        System.out.println("testing");
    }

}
