package Chapter6;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private int numberOfGuesses = 1;
    private int randomNumber;

    public static void main(String[] args) {
    GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
    guessTheNumberGame.start();
    }

    private void start (){
        System.out.println("Let's play guess the number");
        chooseDifficulty();
    }

    private void chooseDifficulty (){
        System.out.println("Please chose the difficulty level:");
        int chosenDifficulty = getDifficultyLevel();

        if (chosenDifficulty == 1){
            randomNumber = randomRange(1,10);
            guessTheNumber();
        } else if (chosenDifficulty ==2 ){
            randomNumber = randomRange(1,100);
            guessTheNumber();
        } else if (chosenDifficulty == 3){
            randomNumber = randomRange(1,1000);
            guessTheNumber();
        } else System.out.println("The difficulty can be from 1 to 3, try again");
            chooseDifficulty();
    }

    private static int randomRange (int start, int finish){
        return new Random().nextInt(finish +1 -start) + start;
    }

    private int getDifficultyLevel (){
       try { return new Scanner(System.in).nextInt();}
       catch (InputMismatchException e){
           System.out.println("Not a valid difficulty level, try again:");
           return getDifficultyLevel();
       }
    }

    private int getPlayerGuess (){
        try {
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You must enter a number, try again!");
            numberOfGuesses++;
            return getPlayerGuess();
        }
    }
    private String askToPlayAgain(){
        try {numberOfGuesses = 1;
            return new Scanner(System.in).nextLine();

        } catch (InputMismatchException e){
            System.out.println("Please type " + "\"" +"y " + "\"" + " to play again or anything else to exit");
            return askToPlayAgain();
        }
    }

    private void restartOrEnd(){
        if (askToPlayAgain().equals("y")){
            start();
        } else System.out.println("Thanks for playing, goodbye!");System.exit(0);
    }

    private void guessTheNumber () {
        System.out.println("I have my number, what is your guess?");
        boolean gameOver = false;

        while (!gameOver) {
            int guess = getPlayerGuess();
            if (guess == randomNumber) {
                System.out.println("You got it in " + numberOfGuesses + " guesses.");
                gameOver = true;
                System.out.println("Press " + "\"" + "y" + "\"" + " to play again or anything else to exit");
                restartOrEnd();
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again!");
                numberOfGuesses++;
            } else {
                System.out.println("Too low, try again!");
                numberOfGuesses++;
            }
        }
     }
}

   /* Write a Guess the Number game that has three levels of
        difficulty. The first level of difficulty would be a number
        between 1 and 10. The second difficulty set would be
        between 1 and 100. The third difficulty set would be between
        1 and 1000.
        Prompt for the difficulty level, and then start the game. The
        computer picks a random number in that range and prompts
        the player to guess that number. Each time the player
        guesses, the computer should give the player a hint as to
        whether the number is too high or too low. The computer
        should also keep track of the number of guesses. Once the
        player guesses the correct number, the computer should
        present the number of guesses and ask if the player would
        like to play again.
        Example Output
        Let's play Guess the Number.
        Pick a difficulty level (1, 2, or 3): 1
        I have my number. What's your guess? 1
        Too low. Guess again: 5
        Too high. Guess again: 2
        You got it in 3 guesses!
        Play again? n
        Goodbye!
        Constraints
        • Don’t allow any non-numeric data entry.
        • During the game, count non-numeric entries as wrong
        guesses
    */