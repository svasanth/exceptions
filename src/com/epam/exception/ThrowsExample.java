package com.epam.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.rmi.RemoteException;

/**
 * Created by Sydubabu_Vasantha on 6/15/2017.
 */


public class ThrowsExample {

    private static void throwsExample() throws RemoteException, RuntimeException {
        // Method implementation
        throw new RemoteException();
    }

    public static void main(String[] args) throws FileNotFoundException, RemoteException {
        throwsExample();
    }
}
