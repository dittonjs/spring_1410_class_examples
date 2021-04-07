package com.usu;

public class BadMathException extends Exception {
    public BadMathException(int val1, int val2) {
        super(String.format("Tried to do %d / %d which cannot be done", val1, val2));
    }
}
