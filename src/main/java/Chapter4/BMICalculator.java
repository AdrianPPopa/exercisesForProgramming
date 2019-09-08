package Chapter4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double userWeight = 0;
        double userHeight = 0;

        try{
        System.out.println("Please enter your weight");
        userWeight = scanner.nextDouble();}
               catch (InputMismatchException e){
                System.out.println("Please enter a valid number");
                   System.exit(0);
            }

        try {System.out.println("Please enter your height");
        userHeight = scanner.nextDouble();}
        catch (InputMismatchException e){
            System.out.println("Please enter a valid number");
            System.exit(0);
        }

        double BMI = (userWeight/(userHeight * userHeight)) * 703;
        NumberFormat formatter = new DecimalFormat("#.00");

        System.out.println("Your BMI is " + formatter.format(BMI));
        if (BMI < 18.5){
            System.out.println("You are underweight. You should see a doctor");
        } if (BMI > 18.5 && BMI < 25) {
            System.out.println("You have a normal weight");
        } if (BMI > 25 ){
            System.out.println("You are overweight. You should see a doctor");
        }


    }
}

    /*Create a program to calculate the body mass index (BMI)
for a person using the person’s height in inches and weight
        in pounds. The program should prompt the user for weight
        and height.
        Calculate the BMI by using the following formula:
        bmi = (weight / (height × height))* 703
        If the BMI is between 18.5 and 25, display that the person is
        at a normal weight. If they are out of that range, tell them if
        they are underweight or overweight and tell them to consult
        their doctor.
        Example Output
        Your BMI is 19.5.
        You are within the ideal weight range.
        or
        Your BMI is 32.5.
        You are overweight. You should see your doctor.
        Constraint
        • Ensure your program takes only numeric data. Don’t
        let the user continue unless the data is valid.

     */
