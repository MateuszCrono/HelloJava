package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main (String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "No Value";
        try {
            result = secondChallenge.probablyIWillThrowException(1,2);
            System.out.println("Try was successful");
        } catch (Exception e) {
            System.out.println("Exception occurred" + e);
        }  finally {
            System.out.println(result);
        }

    }
}
