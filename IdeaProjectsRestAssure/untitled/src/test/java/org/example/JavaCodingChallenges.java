package org.example;

import java.util.Scanner;

import static io.restassured.RestAssured.given;


public class JavaCodingChallenges {


    public static void main(String args[]) {
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series upto " + number + " numbers : "); //printing Fibonacci series upto


        for(int i=1; i<=number; i++){
            System.out.print(Fibonachisequense.fibonacci(i) +" "); }


    }


}

