package com.epam.exception;

/**
 * Created by sydubabu_vasantha on 7/12/2017.
 */
public class StackOverflowErrorExample {

    private static void recursivePrint(int num) {
        System.out.println("Number: " + num);
        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }

    public static void main(String[] args) {
        recursivePrint(1);
    }
}
