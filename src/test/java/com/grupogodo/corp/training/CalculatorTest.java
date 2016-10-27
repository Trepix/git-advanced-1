package com.grupogodo.corp.training;

import static org.junit.Assert.assertEquals;

import java.security.InvalidParameterException;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
    
    private static Calculator calculator;
    
    @BeforeClass
    public static void initTestSuit() {
        calculator = new Calculator();
    }
    
    @Test
    public void given3And4_WhenICallSum_Returns7() {
        int addend1 = 3;
        int addend2 = 4;
        int expected = 7;
        assertEquals(expected, calculator.sum(addend1, addend2));
    }
    
    @Test
    public void given4And3_WhenICallSubtract_ThenReturnsMinus1() {
        int minuend = 3;
        int subtrahend = 4;
        int expected = -1;
        assertEquals(expected, calculator.subtract(minuend, subtrahend));
    }
    
    @Test
    public void given3AndMinus4_WhenICallMult_ThenReturnsMinus12() {
        int multiplicand = 3;
        int multiplier = -4;
        int expected = -12;
        assertEquals(expected, calculator.mult(multiplicand, multiplier));
    }
    
    @Test(expected=ArithmeticException.class)
    public void given1And0_WhenICallDiv_ThenThrowsArithmeticException() {
        int dividend = 1;
        int divisor = 0;
        calculator.div(dividend, divisor);
    }
    
    @Test
    public void given4_WhenICallSqrt_ThenReturns2() {
        int radicand = 4;
        int expected = 2;
        assertEquals(expected, calculator.sqrt(radicand));
    }
    
    @Ignore
    @Test(expected=InvalidParameterException.class)
    public void givenMinus4_WhenICallSqrt_ThenThrowsArithmeticException() {
        int radicand = -4;
        calculator.sqrt(radicand);
    }
}
