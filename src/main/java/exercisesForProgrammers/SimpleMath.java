package exercisesForProgrammers;

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumber;
        String secondNumber;
        int addition;
        int substraction;
        int division;
        int multiplication;

        System.out.println("What is the first number? ");
        firstNumber = scanner.nextLine();

        System.out.println("What is the second number? ");
        secondNumber = scanner.nextLine();

        int firstNumberConverted = Integer.parseInt(firstNumber);
        int secondNumberConverted = Integer.parseInt(secondNumber);

        addition = firstNumberConverted + secondNumberConverted;
        substraction = firstNumberConverted + secondNumberConverted;
        division = firstNumberConverted + secondNumberConverted;
        multiplication = firstNumberConverted + secondNumberConverted;

        System.out.println(firstNumber + " + " + secondNumber + " = " + addition + "\n"
                + firstNumber + " - " + secondNumber + " = " + substraction + "\n"
                + firstNumber + " * " + secondNumber + " = " + multiplication + "\n"
                + firstNumber + " / " + secondNumber + " = " + division);
    }
}

//    Write a program that prompts for two numbers. Print the
//        sum, difference, product, and quotient of those numbers as
//        shown in the example output:
//        Example Output
//        What is the first number? 10
//        What is the second number? 5
//        10 + 5 = 15
//        10 - 5 = 5
//        10 * 5 = 50
//        10 / 5 = 2
//        Constraints
//        • Values coming from users will be strings. Ensure that
//        you convert these values to numbers before doing the
//        math.
//        • Keep the inputs and outputs separate from the numerical
//        conversions and other processing.
//        • Generate a single output statement with line breaks in
//        the appropriate spots.