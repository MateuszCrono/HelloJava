package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeatufier;
import com.kodilla.stream.iterate.NumbersGenerator;


public class StreamMain {

    public static void main(String[] args) {

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

//        PoemBeatufier poemBeatufier = new PoemBeatufier();
//
//        poemBeatufier.beautify(" <- Adding gorgeous forward slashes before text", a -> "/// " + a);
//
//        poemBeatufier.beautify("Changing to breathtaking Capital letters ", String::toUpperCase);
//
//        poemBeatufier.beautify("Repeating the same text over again -> ", a -> a.repeat(2));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}