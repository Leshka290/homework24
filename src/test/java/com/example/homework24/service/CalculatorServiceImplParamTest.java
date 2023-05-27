package com.example.homework24.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParamTest {

    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    private void nullPointerExceptionMethod(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException();
        }
    }

    @ParameterizedTest
    @CsvSource({"5, 4", "2, 1"})
    public void testPlus(Integer numTest1, Integer numTest2) {
        nullPointerExceptionMethod(numTest1, numTest2);

        String numTest = numTest1 + " + " + numTest2 + " = " + (numTest1 + numTest2);
        assertEquals(numTest, calculatorService.plus(numTest1, numTest2));
    }

    @ParameterizedTest
    @CsvSource({"5, 4", "6, 1"})
    public void testMinus(Integer numTest1, Integer numTest2) {
        nullPointerExceptionMethod(numTest1, numTest2);

        String numTest = numTest1 + " - " + numTest2 + " = " + (numTest1 - numTest2);
        assertEquals(numTest, calculatorService.minus(numTest1, numTest2));
    }

    @ParameterizedTest
    @CsvSource({"5, 4", "6, 1"})
    public void testMultiply(Integer numTest1, Integer numTest2) {
        nullPointerExceptionMethod(numTest1, numTest2);

        String numTest = numTest1 + " * " + numTest2 + " = " + (numTest1 * numTest2);
        assertEquals(numTest, calculatorService.multiply(numTest1, numTest2));
    }

    @ParameterizedTest
    @CsvSource({"5, 4", "6, 1"})
    public void testDivide(Integer numTest1, Integer numTest2) {
        nullPointerExceptionMethod(numTest1, numTest2);

        String numTest = numTest1 + " / " + numTest2 + " = " + (numTest1 / numTest2);
        assertEquals(numTest, calculatorService.divide(numTest1, numTest2));
    }
}
