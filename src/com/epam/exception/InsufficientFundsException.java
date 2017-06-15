package com.epam.exception;

/**
 * Created by Sydubabu_Vasantha on 6/15/2017.
 */
public class InsufficientFundsException extends Exception {

    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
