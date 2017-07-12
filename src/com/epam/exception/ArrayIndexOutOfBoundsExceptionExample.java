package com.epam.exception;

/**
 * Created by sydubabu_vasantha on 7/12/2017.
 */
public class ArrayIndexOutOfBoundsExceptionExample {

    private static void readArray() {
        int num[] = {1, 2, 3, 4};
        System.out.println(num[6]);
    }

    public static void main(String[] args) {
        readArray();
    }
}
