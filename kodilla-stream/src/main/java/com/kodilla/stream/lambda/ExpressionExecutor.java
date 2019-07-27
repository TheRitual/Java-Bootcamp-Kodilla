package com.kodilla.stream.lambda;

public class ExpressionExecutor {
    public void execute(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpresion(a,b);
        System.out.println("Result: " + result);
    }
}
