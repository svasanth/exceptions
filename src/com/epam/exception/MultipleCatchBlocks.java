package com.epam.exception;

/**
 * Created by sydubabu_vasantha on 7/12/2017.
 */
public class MultipleCatchBlocks {

    private static void multipleCatchBlocks() {
        int num[] = {1, 2, 3, 4};
        try {
            int i= 100/0;
            System.out.println(num[6]);
        } catch(ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("ArrayIndexOutOfBoundsException thrown:"+ aiobe);
        } catch(ArithmeticException ae) {
            System.out.println("ArithmeticException thrown:"+ ae);
        } catch(Exception e) {
            System.out.println("General Exception thrown:"+ e);
        }
    }

    public static void main(String[] args) {
        multipleCatchBlocks();
    }
}
