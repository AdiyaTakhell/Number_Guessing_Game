package com.numberguessing.game;

public enum DifficultyLevel {
    EASY(10),
    MEDIUM(5),
    HARD(3);

    private final int maxAttempt;

    DifficultyLevel(int maxAttempt) {
        this.maxAttempt = maxAttempt;
    }

    public int getMaxAttempt() {
        return maxAttempt;
    }

    public static DifficultyLevel fromChoice(int choice) {
        return switch (choice) {
            case 1 -> EASY;
            case 2 -> MEDIUM;
            case 3 -> HARD;
            default -> MEDIUM;

        };
    }

}
