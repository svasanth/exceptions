package com.epam.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.rmi.RemoteException;

/**
 * Created by Sydubabu_Vasantha on 6/15/2017.
 */

class FileNotFoundExceptionExample {

    public void readFile() throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }
}

class ArrayIndexOutOfBoundsExceptionExample {

    public void readArray() {
        int num[] = {1, 2, 3, 4};
        System.out.println(num[6]);
    }
}

class StackOverflowErrorExample {

    public void recursivePrint(int num) {
        System.out.println("Number: " + num);
        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }
}

class TryCatchExample{
    public void readArray() {
        int num[] = {1, 2, 3, 4};
        try {
            System.out.println(num[6]);
        } catch(ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Exception thrown:"+ aiobe);
        } finally {

        }
    }
}

class MultipleCatchBlocksExample{

    public void multipleCatchBlocks() {
        int num[] = {1, 2, 3, 4};
        try {
            System.out.println(num[6]);
            int i= 100/0;
        } catch(ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Exception thrown:"+ aiobe);
        } catch(ArithmeticException ae) {
            System.out.println("Exception thrown:"+ ae);
        }
    }
}

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        /*ArrayIndexOutOfBoundsExceptionExample arrayIndexOutOfBoundsExceptionExample = new ArrayIndexOutOfBoundsExceptionExample();
        arrayIndexOutOfBoundsExceptionExample.readArray();

        FileNotFoundExceptionExample fileNotFoundExceptionExample = new FileNotFoundExceptionExample();
        fileNotFoundExceptionExample.readFile();

        StackOverflowErrorExample stackOverflowErrorExample = new StackOverflowErrorExample();
        stackOverflowErrorExample.recursivePrint(123);

        TryCatchExample tryCatchExample = new TryCatchExample();
        tryCatchExample.readArray();*/

        MultipleCatchBlocksExample multipleCatchBlocksExample = new MultipleCatchBlocksExample();
        multipleCatchBlocksExample.multipleCatchBlocks();

    }

    private static void throwsExample() throws RemoteException, RuntimeException {
        // Method implementation
        throw new RemoteException();
    }

}
