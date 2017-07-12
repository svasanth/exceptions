package com.epam.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sydubabu_vasantha on 7/10/2017.
 */
public class MethodOverridingWithExceptions {
    void msg() {
        int i = 10 / 0;
        System.out.println("parent");
    }
}

class TestExceptionChild extends MethodOverridingWithExceptions {
    void msg() {
        System.out.println("TestExceptionChild");
    }

    public static void main(String args[]) {
        MethodOverridingWithExceptions p = new TestExceptionChild();
        try {
            p.msg();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
