package service;

import exception.CustomException;

public class Calculator {
    public static double divine(int a, int b) throws CustomException {
        if (b == 0) {
            throw new CustomException("Произошла попытка деления на ноль!");
        }
        return a / (double) b;
    }
}