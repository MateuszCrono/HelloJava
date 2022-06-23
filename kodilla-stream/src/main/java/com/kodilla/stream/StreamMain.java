package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthDay(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }
}

//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
//                .forEach(System.out::println);                                            // [4]

//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()   // [1]
//                .filter(book -> book.getYearOfPublication() > 2005)                  // [2]
//                .collect(Collectors.toList());                                       // [3]
//
//        System.out.println("# elements: " + theResultListOfBooks.size());       // [4]
//        theResultListOfBooks.stream()                                           // [5]
//                .forEach(System.out::println);                                       // [6]
//
//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);


//        People.getList().stream()
//                .map(String::toUpperCase)                             // [1]
//                .filter(s -> s.length() > 11)                         // [2]
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")   // [3]
//                .filter(s -> s.substring(0, 1).equals("M"))           // [4]
//                .forEach(System.out::println);                        // [5]

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

//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

