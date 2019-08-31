package Chapter4;

import java.text.NumberFormat;
import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculateTax();
    }

    private void calculateTax() {

        Scanner scanner = new Scanner(System.in);

        double orderAmount;
        String state;
        double tax = 0.55;


        System.out.println("What is the order amount?");
        orderAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What is the state?");
        state = scanner.nextLine();

        double subTotal = orderAmount;
        double total = subTotal + tax;

        NumberFormat formatToCurrency = NumberFormat.getCurrencyInstance();
        String taxAsCurrency = formatToCurrency.format(tax);
        String subTotalAsCurrency = formatToCurrency.format(subTotal);
        String totalAsCurrency = formatToCurrency.format(total);


        if (state.equals("WI")){
            System.out.println("The subtotal is " + subTotalAsCurrency + "\n" +
                    "The tax is " + taxAsCurrency + "\n" + "The total is " + totalAsCurrency);
            System.exit(0);
        }

        System.out.println("The total is " + totalAsCurrency);
    }

}
/*

       Write a simple program to compute the tax on an order
        amount. The program should prompt for the order amount
        and the state. If the state is “WI,” then the order must be
        charged 5.5% tax. The program should display the subtotal,
        tax, and total for Wisconsin residents but display just the
        total for non-residents.
        Example Output
        What is the order amount? 10
        What is the state? WI
        The subtotal is $10.00.
        The tax is $0.55.
        The total is $10.55.
        Or
        What is the order amount? 10
        What is the state? MN
        The total is $10.00
        Constraints
        • Implement this program using only a simple if statement—don’t use an else clause.
        • Ensure that all money is rounded up to the nearest cent.
        • Use a single output statement at the end of the program
        to display the program results


 */