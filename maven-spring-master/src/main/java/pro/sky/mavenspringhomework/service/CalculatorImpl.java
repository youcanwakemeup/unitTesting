package pro.sky.mavenspringhomework.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {
    @Override
    public String sum(double firstNum, double secondNum) {
        return firstNum + " + " + secondNum + " = " + (firstNum+secondNum);
    }
    @Override
    public String difference(double firstNum, double secondNum) {
        return firstNum + " - " + secondNum + " = " + (firstNum - secondNum);
    }
    @Override
    public String division(double firstNum, double secondNum) {
        if (secondNum == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя!");
        }
        return firstNum + " / " + secondNum + " = " + (firstNum/secondNum);
    }
    @Override
    public String multiplication(double firstNum, double secondNum) {
        return firstNum + " * " + secondNum + " = " + (firstNum*secondNum);
    }
    @Override
    public String greet() {
        return "Добро пожаловать в калькулятор!";
    }
}
