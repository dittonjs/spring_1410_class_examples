package com.usu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StaticQueue<String> cities = new StaticQueue<>(6);
//
//        DynamicStack<String> cities = new DynamicStack<>();
        try {
            cities.enqueue("Logan");
            cities.enqueue("Hyrum");
            cities.enqueue("Providence");
            cities.enqueue("Millville");
            cities.enqueue("Benson");
            cities.enqueue("Smithfield");
            String city = cities.dequeue();
            cities.enqueue("Richmond");

            while(!cities.isEmpty()) {
                System.out.println(cities.dequeue());
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
