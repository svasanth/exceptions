package com.epam.exception.customexceptions;

import com.epam.exception.customexceptions.InvalidAgeException;

/**
 * Created by Sydubabu_Vasantha on 6/15/2017.
 */
public class TestCustomException {

    static void validate(int age) throws InvalidAgeException {
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]){
            validate(13);
    }
}
