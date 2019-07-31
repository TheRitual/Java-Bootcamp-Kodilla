package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithotHandling;

import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReaderWithotHandling fileReader = new FileReaderWithotHandling();
        try {
            fileReader.readFile();
        } catch (FileReaderException e){
            System.out.println(e);
        }
    }
}
