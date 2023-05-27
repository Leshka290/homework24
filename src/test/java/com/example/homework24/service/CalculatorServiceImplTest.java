package com.example.homework24.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplTest {

    private final int numTest1 = 5;
    private final int numTest2 = 4;

    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void testHelloString() {
        String helloStr = "Добро пожаловать в калькулятор";
        assertEquals(helloStr, calculatorService.helloString());
    }

    @Test
    public void testPlus() {
        String numTest = numTest1 + " + " + numTest2 + " = " + (numTest1 + numTest2);
        assertEquals(numTest, calculatorService.plus(5, 4));
    }

    @Test
    public void testMinus() {
        String numTest = numTest1 + " - " + numTest2 + " = " + (numTest1 - numTest2);
        assertEquals(numTest, calculatorService.minus(5, 4));
    }

    @Test
    public void testMultiply() {
        String numTest = numTest1 + " * " + numTest2 + " = " + (numTest1 * numTest2);
        assertEquals(numTest, calculatorService.multiply(5, 4));
    }

    @Test
    public void testDivide() {
        String numTest = numTest1 + " / " + numTest2 + " = " + (numTest1 / numTest2);
        assertEquals(numTest, calculatorService.divide(5, 4));
    }

    @Test
    public void testDivideNum2NotZero() {
        assertDoesNotThrow(() -> calculatorService.divide(1, 1));
    }
}
