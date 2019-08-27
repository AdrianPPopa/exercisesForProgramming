package Chapter3;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfEuros;
        double exchangeRate;

        System.out.println("How many euros are you exchanging?");
        numberOfEuros = scanner.nextInt();

        System.out.println("What is the exchange rate?");
        exchangeRate = scanner.nextDouble();

        double numberOfDollars = numberOfEuros * exchangeRate;

        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        String formatDollar = formatter.format(numberOfDollars);

        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        String formatEuro = formatter2.format(numberOfEuros);

        BigDecimal deci = new BigDecimal(numberOfDollars);
        

        System.out.println("How many euros are you exchanging? " + numberOfEuros + "\n" +
                "What is the exchange rate? " + exchangeRate + "\n" +
                formatEuro + " at an exchange rate of " + exchangeRate + " is " + formatDollar);

    }
}

//    /* Write a program that converts currency. Specifically, convert
//        euros to U.S. dollars. Prompt for the amount of money in
//        euros you have, and prompt for the current exchange rate
//        of the euro. Print out the new amount in U.S. dollars. The
//        formula for currency conversion is
//        amount
//        to
//        =
//        amount
//        from
//        × rate
//        from
//        rate
//        to
//        where
//        • Amount to is the amount in U.S. dollars.
//        • Amount from is the amount in euros.
//        • rate from is the current exchange rate in euros.
//        • rate to is the current exchange rate of the U.S. dollar.
//        Example Output
//        How many euros are you exchanging? 81
//        What is the exchange rate? 137.51
//        81 euros at an exchange rate of 137.51 is
//        111.38 U.S. dollars.
//        Constraints
//        • Ensure that fractions of a cent are rounded up to the
//        next penny.
//        • Use a single output statement. */