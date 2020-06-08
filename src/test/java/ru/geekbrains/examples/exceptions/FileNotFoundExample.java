package ru.geekbrains.examples.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExample {

//    public static void main(String[] args) {
//        File file = new File("/path/to/file");
//        try {
//            FileReader reader = new FileReader(file);
//            System.out.println("Dangerous code!");
//        } catch (FileNotFoundException exception) {
//            System.out.println("Exception has been catched!");
//        } finally {
//            System.out.println("I'm finally and I have been executed!");
//        }
//    }

    public static void main(String[] args) {
        FileReaderExample reader = new FileReaderExample();
        try {
            reader.readFile("123");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
