package com.usu;

public class Utils <T extends Comparable<T>>{
    static int val;
    public T get(T value) {
        return value;
    }

    static <T extends Comparable<T>> T min(T val, T val2) {
        if(val.compareTo(val2) < 0) {
            return val;
        } else {
            return val2;
        }
    }
}
