package Chapter3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class DeterminingCompoundInterest {

    public static void main(String[] args) {
        DeterminingCompoundInterest determiningCompoundInterest = new DeterminingCompoundInterest();
        determiningCompoundInterest.compoundInterestCalculator();
    }

    private void compoundInterestCalculator () {
        Scanner scanner = new Scanner(System.in);

        NumberFormat formatToPercent = NumberFormat.getPercentInstance();
        formatToPercent.setMinimumFractionDigits(2);
        NumberFormat formatToCurrency = NumberFormat.getCurrencyInstance();

        double principalAmount;
        double annualRate;
        int numberOfYears;
        int timesInterestCompoundedAnnualy;
        double amountAtEndOfInvestment;

        System.out.println("What is the principal amount?");
        principalAmount = scanner.nextInt();

        System.out.println("What is the rate?");
        annualRate = scanner.nextDouble();

        System.out.println("What is the number of year?");
        numberOfYears = scanner.nextInt();

        System.out.println("What is the number of times the interest is compounded per year?");
        timesInterestCompoundedAnnualy = scanner.nextInt();
        DecimalFormat df = new DecimalFormat(".00");

        double interestInPercentage = annualRate /100;


        amountAtEndOfInvestment = principalAmount * Math.pow(1 + (interestInPercentage / timesInterestCompoundedAnnualy),
                timesInterestCompoundedAnnualy * numberOfYears);
        String amountToCurrency = formatToCurrency.format(principalAmount);
        String rateToPercent = formatToPercent.format(interestInPercentage);
        String finalAmount = formatToCurrency.format(amountAtEndOfInvestment);

        System.out.println(amountToCurrency + " invested at " + rateToPercent + " for " + numberOfYears +
                " years compounded " + timesInterestCompoundedAnnualy + " times per year is " + finalAmount + "." );

    }

}

   /* Write a program to compute the value of an investment
    compounded over time. The program should ask for the
        starting amount, the number of years to invest, the interest
        rate, and the number of periods per year to compound.
        The formula you’ll use for this is
        A = P(1 +
        r
        n
        )
        nt
        where
        • P is the principal amount.
        • r is the annual rate of interest.
        • t is the number of years the amount is invested.
        • n is the number of times the interest is compounded per
        year.
        • A is the amount at the end of the investment.
        Example Output
        What is the principal amount? 1500
        What is the rate? 4.3
        What is the number of years? 6
        What is the number of times the interest
        is compounded per year? 4
        $1500 invested at 4.3% for 6 years
        compounded 4 times per year is $1938.84.
        Constraints
        • Prompt for the rate as a percentage (like 15, not .15).
        Divide the input by 100 in your program.
        • Ensure that fractions of a cent are rounded up to the
        next penny.
        • Ensure that the output is formatted as money.
        */
