package com.grupogodo.corp.training;

public class Calculator {
    
    public int sum(int addend1, int addend2) {
        return addend1 + addend2;
    }
    
    public int subtract(int minuend, int subtrahend) {
        return minuend-subtrahend;
    }
    
    public int mult(int multiplicand, int multiplier) {
        return multiplicand*multiplier;
    }
    
    public int div(int dividend, int divisor) {
        return dividend/divisor;
    }
    
    public int sqrt(int radicand) {
        return (int) Math.sqrt(radicand);
    }
}
