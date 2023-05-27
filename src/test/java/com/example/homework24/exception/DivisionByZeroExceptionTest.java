package com.example.homework24.exception;

import com.example.homework24.service.CalculatorServiceImpl;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class DivisionByZeroExceptionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void testDivisionByZeroException() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        thrown.expect(DivisionByZeroException.class);
        thrown.expectMessage("Деление на 0 не возможно");
        calculatorService.divide(1, 1);
    }
}
