package pro.sky.mavenspringhomework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.mavenspringhomework.service.Calculator;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final Calculator calculator;
    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public String showGreetings() {
        return calculator.greet();
    }
    @GetMapping("/plus")
    public double showSum(@RequestParam double num1, @RequestParam double num2) {
        return calculator.sum(num1, num2);
    }
    @GetMapping("/minus")
    public double showDifference(@RequestParam double num1, @RequestParam double num2) {
        return calculator.difference(num1, num2);
    }
    @GetMapping("/multiply")
    public double showMultiplication(@RequestParam double num1, @RequestParam double num2) {
        return calculator.multiplication(num1, num2);
    }
    @GetMapping("/divide")
    public double showDivision(@RequestParam double num1, @RequestParam double num2) {
        return calculator.division(num1, num2);
    }
}
