package com.usu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Faculty joseph = new Faculty();
    }
}

class Person {
    int year;
    public Person() {
        year = 1;
        System.out.println("1. PERSON THINGS ARE BEING DONE!");
    }

    public Person(String name) {
        System.out.println("1. PERSON THINGS ARE BEING DONE!");
    }
}

class Employee extends Person {
    public Employee() {
        System.out.println("2. EMPLOYEE THINGS ARE BEING DONE!");
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(double salary) {
        System.out.println("2. OVERLOADED EMPLOYEE");
    }
}

class Faculty extends Employee {
    public Faculty() {
        System.out.println("3. FACULTY THINGS ARE BEING DONE!!");
    }
}



