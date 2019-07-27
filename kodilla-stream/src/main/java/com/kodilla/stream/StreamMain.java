package com.kodilla.stream;

import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

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
    }
}
