package com.numberguessing.ui;

import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public int askDifficult() {
        while (true) {
            System.out.println("Please select the difficult level");
            System.out.println("1. Easy (10 chances)");
            System.out.println("2. Medium (5 chances)");
            System.out.println("3. Hard (3 chances)");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine();

            if (isValidInteger(input)) {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= 3) {
                    return choice;
                }
            }
            System.out.println("Invalid input. Please enter 1, 2, or 3.");

        }

    }

    public int akfForGuess() {
        while (true) {

            String input = scanner.nextLine();

            if (isValidInteger(input)) {
                int guess = Integer.parseInt(input);
                if (guess >= 1 && guess <= 100) {
                    return guess;
                }
            }
            System.out.println("Invalid input. Please enter a whole number between 1 and 100.");

        }
    }

    private boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public boolean askPlayAgain() {
        while (true) {
            System.out.println("Do you want to play again? (Y/N): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("y")) {
                return true;
            } else if (input.equals("n")) {
                return false;

            }
            System.out.println("Invalid Input. Please enter Y or N");
        }
    }


}

