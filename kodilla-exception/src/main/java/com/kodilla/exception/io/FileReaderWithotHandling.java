package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithotHandling {
    public void readFile() throws FileReaderException {
        ClassLoader cl = getClass().getClassLoader();
        File file = new File(cl.getResource("io/names.txt").getFile());
        Path path = Paths.get(file.getPath());
        Stream<String> fileLines;
        try{
            fileLines = Files.lines(path);
        } catch (IOException e) {
            throw new FileReaderException();
        }
        fileLines.forEach(System.out::println);
    }
}
