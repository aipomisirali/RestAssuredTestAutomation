package org.example;

public class CheckIfVowelsIsPresent {
    public static void main(String[] args) {

        System.out.println(stringContainsVowels("Hello")); // true
        System.out.println(stringContainsVowels("TV")); // false

    }

    public static String stringContainsVowels(String input) {
        char[] inputToChar = input.toLowerCase().toCharArray();
        String VowelsInTheWord = "";
        String ConsoonantWord = "";

        for (int i = 0; i <= inputToChar.length - 1; i++) {
            if (inputToChar[i] == 'a' || inputToChar[i] == 'o' || inputToChar[i] == 'i' || inputToChar[i] == 'e' || inputToChar[i] == 'e') {
                VowelsInTheWord = VowelsInTheWord + String.valueOf(inputToChar[i]);
            } else {
                ConsoonantWord = ConsoonantWord + String.valueOf(inputToChar[i]);
            }
        }

        return "Vowels: " + VowelsInTheWord + "  Consonants:  " + ConsoonantWord;

    }}

