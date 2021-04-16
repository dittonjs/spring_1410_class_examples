package com.usu;

public class LinkedList <T extends Comparable<T>> {

    ListNode<T> head = new ListNode<>();

    public void insert(T value) {
        ListNode<T> previous = head;
        ListNode<T> current = head.next;
        while(current != null) {
            if (current.data.compareTo(value) < 0) {
                previous = current;
                current = previous.next;
            } else {
                break;
            }
        }



        ListNode<T> newNode = new ListNode<>(value);
        previous.next = newNode;
        newNode.next = current;
    }

    public void displayList() {
        ListNode<T> current = head.next;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public T get(int index) {
        int currentIndex = 0;
        ListNode<T> current = head.next;
        while(current != null) {
            if (currentIndex == index) {
                return current.data;
            }
            currentIndex ++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean find(T value) {
        ListNode<T> current = head.next;
        while(current != null) {
            if (current.data.compareTo(value) == 0) {
                return true;
            }
            current = current.next;
        }
        return false;
    }



    private class ListNode <T> {
        T data;
        ListNode<T> next;

        public ListNode() {}
        public ListNode(T data) {
            this.data = data;
        }
    }
}




