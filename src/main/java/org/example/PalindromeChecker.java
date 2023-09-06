package org.example;

// //Implementiere eine Funktion, die überprüft, ob eine gegebene Zeichenkette ein Palindrom ist (z.B. "anna" ist ein Palindrom)
public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        // Entferne Leerzeichen und konvertiere alles in Kleinbuchstaben, um Groß- und Kleinschreibung zu ignorieren
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false; // Zeichen stimmen nicht überein, keine Palindrom
            }
            left++;
            right--;
        }
        return true; // Alle Zeichen stimmen überein, es handelt sich um ein Palindrom
    }
}