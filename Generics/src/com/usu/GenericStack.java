package com.usu;

import java.util.ArrayList;

public class GenericStack <T>  {
    private ArrayList<T> data = new ArrayList<>();
    private int size = 0;
    public void push(T value) {
        data.add(value);
//        size ++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T peek() {
        if(data.size() == 0) return null;
        return data.get(data.size() - 1);
    }

    public T pop() {
        if (size == 0) return null;
        T value = peek();
        data.remove(data.size() - 1);
//        size --;
        return value;
    }
}
