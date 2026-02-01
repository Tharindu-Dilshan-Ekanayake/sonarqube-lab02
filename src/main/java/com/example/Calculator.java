package com.example;

public class Calculator {

    /**
     * Performs arithmetic operations on two integers.
     * @param a first operand
     * @param b second operand
     * @param op operation to perform: add, sub, mul, div, mod, pow
     * @return result of the operation, or 0 for unknown operations
     */
    public int calculate(int a, int b, String op) {
        switch (op) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                return (b == 0) ? 0 : a / b;
            case "mod":
                return a % b;
            case "pow":
                return (int) Math.pow(a, b);
            default:
                return 0;
        }
    }

    /**
     * Adds two numbers.
     * @param x first number
     * @param y second number
     * @return sum of x and y
     */
    public int add(int x, int y) {
        return x + y;
    }
}
