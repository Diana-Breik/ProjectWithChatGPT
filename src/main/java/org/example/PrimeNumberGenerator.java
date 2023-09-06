package org.example;

import java.util.ArrayList;
import java.util.List;

//Nutze AI-aided-coding, um eine Methode zu schreiben, die die ersten n Primzahlen generiert.
public class PrimeNumberGenerator {
    public static List<Integer> generateFirstNPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2; // Starte mit der ersten Primzahl, 2
        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
