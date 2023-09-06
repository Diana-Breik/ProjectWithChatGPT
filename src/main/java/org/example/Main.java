package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Erstelle eine Methode, die eine gegebene Zeichenkette umkehrt (z.B. "Hallo" -> "ollaH")
        StringReversal reversal = null;
        String original = "Hallo";
        String reversed = reversal.reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Umgekehrt: " + reversed);

        System.out.println("-------------------------");

        //Implementiere eine Funktion, die überprüft, ob eine gegebene Zeichenkette ein Palindrom ist (z.B. "anna" ist ein Palindrom)
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String palindrome = "anna";
        String nonPalindrome = "hallo";

        System.out.println(palindrome + " ist ein Palindrom: " + palindromeChecker.isPalindrome(palindrome));
        System.out.println(nonPalindrome + " ist ein Palindrom: " + palindromeChecker.isPalindrome(nonPalindrome));


        System.out.println("-------------------------");

        //Nutze AI-aided-coding, um eine Methode zu schreiben, die die ersten n Primzahlen generiert.
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();
        int n = 10; // Anzahl der gewünschten Primzahlen
        List<Integer> primeList = primeNumberGenerator.generateFirstNPrimes(n);

        System.out.println("Die ersten " + n + " Primzahlen sind:");
        for (int prime : primeList) {
            System.out.print(prime + " ");
        }
    }
}
