package Chapter4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class BloodAlcoholCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        String gender;
        int numberOfDrinks;
        double theAmountOfAlchool;
        int hoursSinceLastDrink;

        System.out.println("What is your weight?");
        weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What is your gender?");
        gender = scanner.nextLine();

        System.out.println("What is the number of drinks?");
        numberOfDrinks = scanner.nextInt();

        System.out.println("What is the amount of alcohol per drink?");
        theAmountOfAlchool = scanner.nextDouble();

        System.out.println("How many hours passed since your last drink?");
        hoursSinceLastDrink = scanner.nextInt();

        double totalAlcoholConsumed = numberOfDrinks * theAmountOfAlchool;

        double bloodAlchoolCalculatorMale = (totalAlcoholConsumed * 5.14 / weight * 0.73) - 0.015 * hoursSinceLastDrink;

        double bloodAlchoolCalculatorFemale = (totalAlcoholConsumed * 5.14 / weight * 0.66) - 0.015 * hoursSinceLastDrink;
        NumberFormat formatter = new DecimalFormat("#.000");


        if (gender.equals("male") && bloodAlchoolCalculatorMale < 0.08){
            System.out.println("Your BAC is " + formatter.format(bloodAlchoolCalculatorMale) + "\n" + "It is legal for you to drive");}
            else if (gender.equals("male") && bloodAlchoolCalculatorMale > 0.08){
            System.out.println("Your BAC is " + formatter.format(bloodAlchoolCalculatorMale) + "\n" + "It is not legal for you to drive");}
            else if (gender.equals("female") && bloodAlchoolCalculatorFemale < 0.08){
            System.out.println("Your BAC is " + formatter.format(bloodAlchoolCalculatorFemale) + "\n" + "It is legal for you to drive");}
            else {
            System.out.println("Your BAC is " + formatter.format(bloodAlchoolCalculatorFemale) + "\n" + "It is not legal for you to drive");
        }
   }
}

  /*  Create a program that prompts for your weight, gender,
        number of drinks, the amount of alcohol by volume of the
        drinks consumed, and the amount of time since your last
        drink. Calculate your blood alcohol content (BAC) using this
        formula
        BAC = (A × 5.14 / W × r) − .015 × H
        where
        • A is total alcohol consumed, in ounces (oz).
        • W is body weight in pounds.
        • r is the alcohol distribution ratio:
        – 0.73 for men
        – 0.66 for women
        • H is number of hours since the last drink.
        Display whether or not it’s legal to drive by comparing the
        blood alcohol content to 0.08.
        Example Output
        Your BAC is 0.08
        It is not legal for you to drive.
        Constraint
        • Prevent the user from entering non-numeric values.

   */