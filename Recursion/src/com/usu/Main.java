package com.usu;

public class Main {

    public static void main(String[] args) {
        System.out.println(getSum(10));
        int[] values = {1,3,5,7,34,67,43,21};
        System.out.println(getSum(values));
        System.out.println(fib(200));
    }
    // 1 2 3 4 5 6 7 8 9
    // p = np

    // p = problems that can be solved in polynomial

    n ^ 2

//    fib(n) = fib(n-1) + fib(n-2)
//      fib(1) = 1
//      fib(2) = 2;

//    sum(values) = value[0] + sum(value[1 - n])
//    sum({}) = 0;
//
//
//    getSum(10) = 10 + getSum(9)
//    getSum(9) = 9 + getSum(8)
//    getSum(0) = 0;
    // not recursive

    public static int fib(int n) {
        if (n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }

    public static int getSum(int[] values) {
        return getSum(values, 0);
    }

    // recursive
    private static int getSum(int[] values, int start) {
        if (start == values.length) return 0;
        return values[start] + getSum(values, start + 1);
    }


    public static int getSum(int max) {
        if (max == 0) return 0;
        return max + getSum(max - 1);
    }
}
