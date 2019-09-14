package Chapter4;

import java.text.NumberFormat;
import java.util.Scanner;

public class MultistateSalesTaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amount;
        String livingState;
        double tax = 0;
        double taxEauClaireResidents = tax + 0.005;
        double taxDunnResidents = tax + 0.004;
        double taxIllinois = 0.08;
        String residenceCountyWisconsin;


        System.out.println("What is the order amount?");
        amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What state do you live in?");
        livingState = scanner.nextLine();


        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String taxAsCurrency = formatter.format(tax);

        NumberFormat formatAsPercent = NumberFormat.getPercentInstance();
        String taxAsPercent = formatAsPercent.format(taxIllinois);

        if (livingState.equals("Wisconsin")){
            System.out.println("What is your county of residence?");
            residenceCountyWisconsin = scanner.nextLine();
            if (residenceCountyWisconsin.equals("Eau Claire")){
                tax = taxEauClaireResidents;
            } if (residenceCountyWisconsin.equals("Dunn")){
                tax = taxDunnResidents;
            }
        } else if (livingState.equals("Illinois")){
            tax = taxIllinois;
        }

        double finalAmount = amount + tax;
        boolean illinoisOrNot = livingState.equals("Illinois");
        String finalAmountAsCurrency = formatter.format(finalAmount);


        System.out.println("The tax is " + (illinoisOrNot ? taxAsPercent : taxAsCurrency) + "\n"
                + "The total is " + finalAmountAsCurrency);
    }


}

    /*Create a tax calculator that handles multiple states and
        multiple counties within each state. The program prompts
        the user for the order amount and the state where the order
        will be shipped.
        For Wisconsin residents, prompt forthe county ofresidence.
        • For Eau Claire county residents, add an additional 0.005
        tax.
        • For Dunn county residents, add an additional 0.004 tax.
        Illinois residents must be charged 8% sales tax with no
        additional county-level charge. All other states are not
        charged tax. The program then displays the tax and the total
        for Wisconsin and Illinois residents but just the total for
        everyone else.
        Example Output
        What is the order amount? 10
        What state do you live in? Wisconsin
        The tax is $0.50.
        The total is $10.50.
        Constraints
        • Ensure that all money is rounded up to the nearest cent.
        • Use a single output statement at the end of the program
        to display the program results.

     */