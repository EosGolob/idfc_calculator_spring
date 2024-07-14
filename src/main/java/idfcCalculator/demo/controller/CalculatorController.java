package idfcCalculator.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import idfcCalculator.demo.Enity.CalculationInput;
import idfcCalculator.demo.Enity.CalculationResult;
import idfcCalculator.demo.serviceImpl.CalculatorService;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @PostMapping("/calculate")
    public CalculationResult calculate(@RequestBody CalculationInput input) {
        return CalculatorService.calculate(input);
    }
}
