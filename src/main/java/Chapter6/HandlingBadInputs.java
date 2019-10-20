package Chapter6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingBadInputs {
    private double rateOfReturn = getRateOfReturn();
    private double years = investmentCalculator();

    public static void main(String[] args) {
        HandlingBadInputs handlingBadInputs = new HandlingBadInputs();
        handlingBadInputs.inputValidator();
    }

    private double getRateOfReturn (){
        System.out.println("What is the rate of return");
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Sorry, that's not a valid input!";
        try {
            rateOfReturn = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(errorMessage);
            return getRateOfReturn();
        }

        if (rateOfReturn == 0){
            System.out.println(errorMessage);
            return getRateOfReturn();
        }
        return rateOfReturn;
    }

    private double investmentCalculator (){
        return years = 72/rateOfReturn;
    }

    private void inputValidator (){
        System.out.println(rateOfReturn);
        System.out.println("It will take you " + years + " years to double your initial investment");
    }
}

    /*Write a quick calculator that prompts for the rate of return
        on an investment and calculates how many years it will take
        to double your investment.
        The formula is
        years = 72 /r
        where r is the stated rate of return.
        Example Output
        What is the rate of return? 0
        Sorry. That's not a valid input.
        What is the rate of return? ABC
        Sorry. That's not a valid input.
        What is the rate of return? 4
        It will take 18 years to double your initial investment.
        Constraints
        • Don’t allow the user to enter 0.
        • Don’t allow non-numeric values.
        • Use a loop to trap bad input, so you can ensure that the
        user enters valid values

     */