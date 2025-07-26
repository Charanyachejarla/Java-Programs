import java.util.Scanner;

public class Game {
    private final int maxAttempts = 6;

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        boolean continuePlaying = true;

        while (continuePlaying) {
            WordEntry currentWordEntry = WordBank.getRandomWord();
            String wordToGuess = currentWordEntry.getWord();
            int wordLength = wordToGuess.length();

            char[] progress = new char[wordLength];
            boolean[] guessedPositions = new boolean[wordLength];
            int attempts = 0;

            for (int i = 0; i < wordLength; i++) {
                progress[i] = '_';
            }

            System.out.println("\n New Word!");
            System.out.println(" Clue: " + currentWordEntry.getClue());
            printProgress(progress);

            while (attempts < maxAttempts) {
                System.out.print(" Enter a letter: ");
                String input = sc.nextLine().toLowerCase();

                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    System.out.println(" Please enter a single valid letter.\n");
                    continue;
                }

                char guess = input.charAt(0);
                boolean found = false;

                for (int i = 0; i < wordLength; i++) {
                    if (wordToGuess.charAt(i) == guess && !guessedPositions[i]) {
                        progress[i] = guess;
                        guessedPositions[i] = true;
                        found = true;
                    }
                }

                if (found) {
                    System.out.println(" Good guess!");
                } else {
                    attempts++;
                    System.out.println(" Letter not found.");
                }

                printProgress(progress);

                if (isWordGuessed(guessedPositions)) {
                    System.out.println(" You guessed the word: " + wordToGuess);
                    break;
                }

                System.out.println(" Attempts left: " + (maxAttempts - attempts) + "\n");
            }

            if (!isWordGuessed(guessedPositions)) {
                System.out.println(" Out of attempts! The correct word was: " + wordToGuess);
            }

            // Ask if user wants to play again
            System.out.print("\n Do you want to play again? (yes/no): ");
            String answer = sc.nextLine().trim().toLowerCase();
            if (!answer.equals("yes")) {
                continuePlaying = false;
                System.out.println(" Thanks for playing! Goodbye!");
            }
        }
    }

    private void printProgress(char[] progress) {
        System.out.print("Word: ");
        for (char c : progress) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private boolean isWordGuessed(boolean[] guessedPositions) {
        for (boolean guessed : guessedPositions) {
            if (!guessed) return false;
        }
        return true;
    }
}
