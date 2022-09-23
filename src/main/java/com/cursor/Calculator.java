package com.cursor;

public class Calculator {
    private int result;

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int add(int b) {
        return result += b;
    }

    public int multiply(int b) {
        return result *= b;
    }

    public int division(int b) {
        return result /= b;
    }

    public int subtract(int b) {
        return result -= b;
    }

    public int getResult() {
        return result;
    }

    public boolean isResultNegative(int result) {
        if (result < 0) return true;
        return false;
    }
}
