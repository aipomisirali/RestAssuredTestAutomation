package org.example;

public class Fibonachisequense {

    public static int fibonacci(int number) {
        if(number == 1 || number == 2){
            return 1; }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci; }
        return fibonacci; //Fibonacci number }

          }}