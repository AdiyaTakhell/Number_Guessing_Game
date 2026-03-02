package com.numberguessing.service;

public class HintService {
    public String generateHint(int targetNumber, int lastGuess) {
        int difference = Math.abs(targetNumber - lastGuess);

        if (difference <= 10) {
            return "Hint  : You are very close ! (within 10)";
        }
        if (difference % 2 == 0) {
            return "Hint : The number is Even";
        } else {
            return "Hint : The number is Odd";
        }
    }
}
