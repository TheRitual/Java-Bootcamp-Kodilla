package com.kodilla.stream;

import com.kodilla.stream.lambda.*;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - STREAMS!");

        SaySomething ss = new SaySomething();
        ss.say();

        Processor proc = new Processor();
        ExecuteSaySomething ess = new ExecuteSaySomething();
        proc.execute(ess);

        Executor thirdLine = () -> System.out.println("What would you do?");
        proc.execute(thirdLine);

        proc.execute(() -> System.out.println("What if I fell to the floor?"));

        System.out.println();

        ExpressionExecutor ee = new ExpressionExecutor();
        ee.execute(12, 13, (a,b) -> a + b );
        ee.execute(12, 13, (a,b) -> a - b );
        ee.execute(12, 13, (a,b) -> a * b );
        ee.execute(12, 13, (a,b) -> a / b );

        System.out.println();

        ee.execute(12,13,FunctionalCalculator::add);
        ee.execute(12,13,FunctionalCalculator::substract);
        ee.execute(12,13,FunctionalCalculator::multiply);
        ee.execute(12,13,FunctionalCalculator::divide);
    }
}
