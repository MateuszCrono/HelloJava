package com.kodilla.stream.beautifier;

public class PoemBeatufier {


    public void beautify (String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println(result);

    }


}
