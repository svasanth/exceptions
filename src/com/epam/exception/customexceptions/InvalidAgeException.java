package com.epam.exception.customexceptions;

/**
 * Created by Sydubabu_Vasantha on 6/15/2017.
 */
public class InvalidAgeException extends RuntimeException{

    public InvalidAgeException(String s){
        super(s);
    }
}
