package Chapter3;

import java.text.NumberFormat;
import java.util.Scanner;

public class SelfCheckout {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int priceItem1;
        int priceItem2;
        int priceItem3;

        int quantityItem1;
        int quantityItem2;
        int quantityItem3;

        System.out.println("Enter the price of item 1:");
        priceItem1 = scanner.nextInt();
        System.out.println("Enter the quantity of item 1:");
        quantityItem1 = scanner.nextInt();

        System.out.println("Enter the price of item 2:");
        priceItem2 = scanner.nextInt();
        System.out.println("Enter the quantity of item 2:");
        quantityItem2 = scanner.nextInt();

        System.out.println("Enter the price of item 3:");
        priceItem3 = scanner.nextInt();
        System.out.println("Enter the quantity of item 3:");
        quantityItem3 = scanner.nextInt();

        int subTotal = ((priceItem1 * quantityItem1) + (priceItem2 * quantityItem2) + (priceItem3 * quantityItem3));
        double tax = subTotal * 0.352;
        double total = subTotal + tax;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String taxString = formatter.format(tax);
        String subTotalString = formatter.format(subTotal);
        String totalString = formatter.format(total);

        System.out.println("Enter the price of item 1: " + priceItem1 + "\n" +
                           "Enter the quantity of item 1: " + quantityItem1 + "\n" +
                           "Enter the price of item 2: " + priceItem2 + "\n" +
                           "Enter the quantity of item 2: " + quantityItem2 + "\n" +
                           "Enter the price of item 3: " + priceItem3 + "\n" +
                           "Enter the quantity of item 3: " + quantityItem3 + "\n" +
                           "Subtotal: " + subTotalString + "\n" +
                           "Tax: " + taxString + "\n" +
                           "Total: " + totalString);





    }
}

   /* Create a simple self-checkout system. Prompt for the prices
        and quantities of three items. Calculate the subtotal of the
        items. Then calculate the tax using a tax rate of 5.5%. Print
        out the line items with the quantity and total, and then print
        out the subtotal, tax amount, and total.
        Example Output
        Enter the price of item 1: 25
        Enter the quantity of item 1: 2
        Enter the price of item 2: 10
        Enter the quantity of item 2: 1
        Enter the price of item 3: 4
        Enter the quantity of item 3: 1
        Subtotal: $64.00
        Tax: $3.52
        Total: $67.52
        Constraints
        • Keep the input, processing, and output parts of your
        program separate. Collect the input, then do the math
        operations and string building, and then print out the
        output.
        • Be sure you explicitly convert input to numerical data
        before doing any calculations. */