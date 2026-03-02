package com.numberguessing.game;

import com.numberguessing.service.NumberGeneratorService;
import com.numberguessing.ui.ConsoleUI;
import com.numberguessing.service.HintService;

public class GameEngine {
    private final ConsoleUI consoleUI;
    private final NumberGeneratorService numberGeneratorService;
    private final HintService hintService;

   private DifficultyLevel difficultyLevel;
    private int targetNumber;

    public GameEngine() {
        this.consoleUI = new ConsoleUI();
        this.numberGeneratorService = new NumberGeneratorService();
        this.hintService = new HintService();
    }

    public void start() {
        consoleUI.displayWelcomeMessage();
        boolean playAgain;

        do {
            setupGame();
            playGame();
            playAgain = consoleUI.askPlayAgain();
        }
        while (playAgain);

        consoleUI.displayMessage("Thanks you for Playing GoodBye!");

    }

    private void setupGame() {
        int choice = consoleUI.askDifficult();
        difficultyLevel = DifficultyLevel.fromChoice(choice);

        consoleUI.displayMessage("Great! You selected " + difficultyLevel.name() + " difficulty.");
        consoleUI.displayMessage("You have " + difficultyLevel.getMaxAttempt() + " chances to guess the number.");
        consoleUI.displayMessage("Let's Start the game!");
        targetNumber = numberGeneratorService.generateNumber();
    }


    private void playGame() {
        long startTime = System.nanoTime();

        int attempt = 0;
        boolean guessCorrectly = false;
        System.out.println("Enter the number you guess from 1 - 100");
        while (attempt < difficultyLevel.getMaxAttempt()) {
            int guess = consoleUI.akfForGuess();
            attempt++;

            if (guess == targetNumber) {
                guessCorrectly = true;
                long endTime = System.nanoTime();
                long timeTaken = (endTime - startTime) / 1_000_000_000;
                consoleUI.displayMessage("Congratulation! You guessed the correct number in " + attempt + " attempts");
                consoleUI.displayMessage("Time Taken: " + timeTaken + "seconds");
                break;
            } else if (guess < targetNumber) {

                consoleUI.displayMessage("Incorrect! The number is greater than " + guess + ".");

            } else {
                consoleUI.displayMessage("Incorrect! The number is less than " + guess + ".");
            }
            if (attempt % 2 == 0 ){
                consoleUI.displayMessage(hintService.generateHint(targetNumber, guess));
            }

        }
        if (!guessCorrectly) {
            long endTime = System.nanoTime();
            long timeTaken = (endTime - startTime) / 1_000_000_000;

            consoleUI.displayMessage("Game Over! The correct Number was : " + targetNumber);
            consoleUI.displayMessage("Time Taken: " + timeTaken + " seconds");
        }
    }
}

