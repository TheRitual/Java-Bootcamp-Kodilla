package com.kodilla.exception.test;

public class ExceptionHandler {
    public static void main(String[] args) {
        SecondChallenge sc = new SecondChallenge();

        try{
            sc.probablyIWillThrowException(10,29);
        } catch(Exception e) {
            System.out.println("Wrong stuff is happening! " + e);
        }
    }
}
