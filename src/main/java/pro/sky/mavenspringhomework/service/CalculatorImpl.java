package pro.sky.mavenspringhomework.service;

import org.springframework.stereotype.Service;
import pro.sky.mavenspringhomework.exceptions.DivisionByZeroException;

@Service
public class CalculatorImpl implements Calculator {
    @Override
    public double sum(double firstNum, double secondNum) {
        return firstNum+secondNum;
    }
    @Override
    public double difference(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }
    @Override
    public double division(double firstNum, double secondNum) {
        if (secondNum == 0) {
            throw new DivisionByZeroException("На 0 делить нельзя!");
        } else {
            return firstNum/secondNum;
        }
    }
    @Override
    public double multiplication(double firstNum, double secondNum) {
        return firstNum*secondNum;
    }
    @Override
    public String greet() {
        return "Добро пожаловать в калькулятор!";
    }
}
