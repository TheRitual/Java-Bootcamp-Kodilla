package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public static String beautify(String txt, PoemDecorator poemDecor) {
        return poemDecor.decorate(txt);
    }
}
