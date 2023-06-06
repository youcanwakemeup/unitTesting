package pro.sky.mavenspringhomework.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.mavenspringhomework.exceptions.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorImplTest {
    private double firstNum;
    private double secondNum;
    private double thirdNum;
    private double fourthNum;
    private CalculatorImpl calculator;
    @BeforeEach
    public void setUp() {
         firstNum = 10;
         secondNum = 5;
         thirdNum = 6;
         fourthNum = 3;
        this.calculator = new CalculatorImpl();
    }
    @Test
    public void checkAddition() {
        double expectedFirst = firstNum + secondNum;
        double expectedSecond = thirdNum + fourthNum;
        double actualFirst = calculator.sum(firstNum, secondNum);
        double actualSecond = calculator.sum(thirdNum, fourthNum);
        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedSecond, actualSecond);
    }
    @Test
    public void checkDifference() {
        double expectedFirst = firstNum - secondNum;
        double expectedSecond = thirdNum - fourthNum;
        double actualFirst = calculator.difference(firstNum, secondNum);
        double actualSecond = calculator.difference(thirdNum, fourthNum);
        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedSecond, actualSecond);
    }
    @Test
    public void checkMultiplication() {
        double expectedFirst = firstNum * secondNum;
        double expectedSecond = thirdNum * fourthNum;
        double actualFirst = calculator.multiplication(firstNum, secondNum);
        double actualSecond = calculator.multiplication(thirdNum, fourthNum);
        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedSecond, actualSecond);
    }
    @Test
    public void checkDivision() {
        double expectedFirst = firstNum / secondNum;
        double expectedSecond = thirdNum / fourthNum;
        double actualFirst = calculator.division(firstNum, secondNum);
        double actualSecond = calculator.division(thirdNum, fourthNum);
        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedSecond, actualSecond);
        assertThrows(DivisionByZeroException.class, () -> calculator.division(firstNum, 0));
    }
}
