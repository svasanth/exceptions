package com.epam.exception;

/**
 * Created by sydubabu_vasantha on 7/12/2017.
 */
public class TryCatchExample {

    private static void readArray() {
        int num[] = {1, 2, 3, 4};
        try {
            System.out.println(num[6]);
        } catch(ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Exception thrown:"+ aiobe);
            System.out.println("Cause:"+aiobe.getCause());
        }
    }

    public static void main(String[] args) {
        readArray();
    }
}
