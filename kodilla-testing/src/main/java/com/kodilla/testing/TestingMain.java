package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("Test OK!");
        } else {
            System.out.println("Error!");
        }

        if(Calculator.add(5,7) == 12) {
            System.out.println("Add(int) test -> correct!" );
        } else {
            System.out.println("Add(int) test -> failed!");
        }

        if(Calculator.substract(5,7) == -2) {
            System.out.println("Substract(int) test -> correct!" );
        } else {
            System.out.println("Substract(int) test -> failed!");
        }

        if(Calculator.add("5","7") == 12) {
            System.out.println("Add(String) test -> correct!" );
        } else {
            System.out.println("Add(String) test -> failed!");
        }

        if(Calculator.substract("5","7") == -2) {
            System.out.println("Substract(String) test -> correct!" );
        } else {
            System.out.println("Substract(String) test -> failed!");
        }

        if(Calculator.add("five","seven") == 12) {
            System.out.println("Add(String) test -> correct!" );
        } else {
            System.out.println("Add(String) test -> failed!");
        }

        if(Calculator.substract("five","seven") == -2) {
            System.out.println("Substract(String) test -> correct!" );
        } else {
            System.out.println("Substract(String) test -> failed!");
        }

    }
}
