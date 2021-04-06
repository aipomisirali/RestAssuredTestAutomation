package org.example;

public class SwapNumbers {

    public static void swapNumbers(int a, int b) {
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println(" this is a  "+a +"  this is b  "+b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapNumbers(a, b);
         // a is 10, b is 20
    }
}
