package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() {
        ClassLoader cl = getClass().getClassLoader();
        try {
            File file = new File(cl.getResource("io/names.txt").getFile());
            Path path = Paths.get(file.getPath());
            Stream<String> fileLines;
            fileLines = Files.lines(path);
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Something went wrong. Call the IT Police!");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Can't find file. " + e);
        }
    }
}