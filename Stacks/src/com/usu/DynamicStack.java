package com.usu;

public class DynamicStack <T> {
    private class StackNode {
        T value;
        StackNode next;
        public StackNode(T value) {
            this.value = value;
        }
    }

    StackNode top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T value) {
        StackNode newNode = new StackNode(value);
        newNode.next = top;
        top = newNode;
    }

    public T pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }

        T value = top.value;
        top = top.next;
        return value;
    }
}
