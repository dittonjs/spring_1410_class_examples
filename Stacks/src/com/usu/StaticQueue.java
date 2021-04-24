package com.usu;

public class StaticQueue<T> {
    T[] values;
    int count = 0;
    int start = 0;
    int end = 0;
    public StaticQueue(int size) {
        values = (T[]) new Object[size];
    }

    public boolean isFull() {
        return count == values.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void enqueue(T value) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }

        if (end == values.length - 1) {
            end = 0;
        } else {
            end ++;
        }
        count ++;
        values[end] = value;
    }

    public T dequeue() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }

        if (start == values.length - 1) {
            start = 0;
        } else {
            start ++;
        }
        count --;

        return values[start];

    }
}
