package Chapter3;

import java.text.NumberFormat;
import java.util.Scanner;

public class ComputingSimpleInterest {

    public static void main(String[] args) {
        ComputingSimpleInterest computingSimpleInterest = new ComputingSimpleInterest();
        computingSimpleInterest.calculateInterest();
    }

    private void calculateInterest () {
        Scanner scanner = new Scanner(System.in);
        int amount;
        int rateOfInterest;
        int numberOfYears;

        System.out.println("Enter the principal amount:");
        amount = scanner.nextInt();
        System.out.println("Enter the rate of interest:");
        rateOfInterest = scanner.nextInt();
        System.out.println("Enter the number of years:");
        numberOfYears = scanner.nextInt();

        double interestInPercentage = (double) rateOfInterest / 100;
        double worthAmount = amount * (1+ interestInPercentage * numberOfYears);

        NumberFormat formatToPercentage = NumberFormat.getPercentInstance();
        formatToPercentage.setMinimumFractionDigits(1);
        String formatRateOfInterest = formatToPercentage.format(interestInPercentage);

        NumberFormat formatToCurrency = NumberFormat.getCurrencyInstance();
        String formatWorthAmount = formatToCurrency.format(worthAmount);

        System.out.println("After " + numberOfYears + " years at " + formatRateOfInterest +
                ", the investment will be worth " + formatWorthAmount + ".");

    }
}

   /* Create a program that computes simple interest. Prompt for
        the principal amount, the rate as a percentage, and the time,
        and display the amount accrued (principal + interest).
        The formula for simple interest is
        A = P(1 + rt), where P is
        the principal amount, r is the annual rate of interest, t is the
        number of years the amount is invested, and A is the amount
        at the end of the investment.
        Example Output
        Enter the principal: 1500
        Enter the rate of interest: 4.3
        Enter the number of years: 4
        After 4 years at 4.3%, the investment will
        be worth $1758.
        Constraints
        • Prompt for the rate as a percentage (like 15, not .15).
        Divide the input by 100 in your program.
        • Ensure that fractions of a cent are rounded up to the
        next penny.
        • Ensure that the output is formatted as money

    */