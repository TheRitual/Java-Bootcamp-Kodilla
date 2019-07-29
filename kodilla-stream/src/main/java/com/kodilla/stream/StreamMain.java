package com.kodilla.stream;



/*import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;*/

//import com.kodilla.stream.person.People;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - STREAMS!");

        BookDirectory bd = new BookDirectory();
        bd.getList().stream()
                .filter(book -> book.getPublicationYear() > 2005)
                .forEach(System.out::println);

        System.out.println();

        List<Book> resultList = bd.getList().stream()
                .filter(book -> book.getPublicationYear() > 2005)
                .collect(Collectors.toList());

        resultList.stream().forEach(System.out::println);

  /*      People.getList().stream()
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1)
                .equals("M"))
                .forEach(System.out::println);*/


        /*SaySomething ss = new SaySomething();
        ss.say();

        Processor proc = new Processor();
        ExecuteSaySomething ess = new ExecuteSaySomething();
        proc.execute(ess);

        Executor thirdLine = () -> System.out.println("What would you do?");
        proc.execute(thirdLine);

        proc.execute(() -> System.out.println("What if I fell to the floor?"));

        System.out.println();

        ExpressionExecutor ee = new ExpressionExecutor();
        ee.execute(12, 13, (a, b) -> (a + b));
        ee.execute(12, 13, (a, b) -> a - b);
        ee.execute(12, 13, (a, b) -> a * b);
        ee.execute(12, 13, (a, b) -> a / b);

        System.out.println();

        ee.execute(12, 13, FunctionalCalculator::add);
        ee.execute(12, 13, FunctionalCalculator::substract);
        ee.execute(12, 13, FunctionalCalculator::multiply);
        ee.execute(12, 13, FunctionalCalculator::divide);

        System.out.println();

        System.out.println(PoemBeautifier.beautify("A warning to the people, the good and the evil", String::toUpperCase));
        System.out.println(PoemBeautifier.beautify("This is WAR", String::toLowerCase));
        System.out.println(PoemBeautifier.beautify("To the soldier, the civilian, the martyr, the victim", txt -> txt.replace(' ', '_')));
        System.out.println(PoemBeautifier.beautify("This is war", txt -> txt.toUpperCase().replace(' ', '_')));
        System.out.println(PoemBeautifier.beautify("It's the moment of truth and the moment to lie", txt -> txt.toLowerCase().replace(' ', '_')));
        System.out.println(PoemBeautifier.beautify("And the moment to live and the moment to die",
                txt -> txt.toUpperCase()
                        .replace("A","𝓐")
                        .replace("B","𝓑")
                        .replace("C","𝓒")
                        .replace("D","𝓓")
                        .replace("E","𝓔")
                        .replace("F","𝓕")
                        .replace("G","𝓖")
                        .replace("H","𝓗")
                        .replace("I","𝓘")
                        .replace("J","𝓙")
                        .replace("K","𝓚")
                        .replace("L","𝓛")
                        .replace("M","𝓜")
                        .replace("N","𝓝")
                        .replace("O","𝓞")
                        .replace("P","𝓟")
                        .replace("Q","𝓠")
                        .replace("R","𝓡")
                        .replace("S","𝓢")
                        .replace("T","𝓣")
                        .replace("U","𝓤")
                        .replace("V","𝓥")
                        .replace("W","𝓦")
                        .replace("X","𝓧")
                        .replace("Y","𝓨")
                        .replace("Z","𝓩")));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

    }
}
