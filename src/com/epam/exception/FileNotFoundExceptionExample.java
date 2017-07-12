package com.epam.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by sydubabu_vasantha on 7/12/2017.
 */
public class FileNotFoundExceptionExample {

    private static void readFile() throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }

    public static void main(String[] args) throws Exception{
        readFile();
    }
}

