package com.usu;

import java.util.Objects;

public class StaticStack <T>{
    T[] values;
    int size = 0;
    int top = -1;

    public StaticStack(int size) {
        values = (T[])new Object[size];
    }

    public void push(T value) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        top ++;
        values[top] = value;
        size ++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == values.length;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        size --;
        return values[top--];
    }
}
