package com.kodilla.stream;                                                   // [1]

import com.kodilla.stream.lambda.ExpressionExecutor;                          // [2]

public class StreamMain {                                                     // [3]

    public static void main(String[] args) {                                   // [4]
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();       // [5]

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);           // [6]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);           // [7]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);           // [8]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);           // [9]
    }
}
