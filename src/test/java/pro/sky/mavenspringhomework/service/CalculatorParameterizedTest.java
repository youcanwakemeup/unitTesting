package pro.sky.mavenspringhomework.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;



public class CalculatorParameterizedTest {
    private Calculator calculator;
    public CalculatorParameterizedTest() {
        this.calculator = new CalculatorImpl();
    }
    public static Stream<Arguments> provideSumParamsForTest() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(1, 4, 5),
                Arguments.of(0, 3, 3)
        );
    }
    public static Stream<Arguments> provideDiffParamsForTest() {
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(1, 4, -3),
                Arguments.of(0, 3, -3)
                );
    }
    public static Stream<Arguments> provideMultParamsForTest() {
        return Stream.of(
                Arguments.of(2, 3, 6),
                Arguments.of(1, 4, 4),
                Arguments.of(0, 3, 0)
                );
    }
    public static Stream<Arguments> provideDivParamsForTest() {
        return Stream.of(
                Arguments.of(3, 3, 1),
                Arguments.of(1, 4, 0.25),
                Arguments.of(0, 3, 0)
                );
    }
    @ParameterizedTest
    @MethodSource("provideSumParamsForTest")
    public void testSum(double a, double b, double expectedResult) {
        double actualResult = calculator.sum(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideDiffParamsForTest")
    public void testDiff(double a, double b, double expectedResult) {
        double actualResult = calculator.difference(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideMultParamsForTest")
    public void testMult(double a, double b, double expectedResult) {
        double actualResult = calculator.multiplication(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideDivParamsForTest")
    public void testDiv(double a, double b, double expectedResult) {
        double actualResult = calculator.division(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
