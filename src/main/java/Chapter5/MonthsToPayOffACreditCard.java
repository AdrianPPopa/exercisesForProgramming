package Chapter5;

import java.util.Scanner;

public class MonthsToPayOffACreditCard {

private double userBalance = getBalanceFromUser();
private double userAnnualPercentageRate = getAPRfromUser() /100.0;
private double userMonthlyPayment = getMonthlyPaymentFromUser();
private double months = calculateMonthsUntilPaidOff(userBalance,userAnnualPercentageRate,userMonthlyPayment);

    public static void main(String[] args) {
        MonthsToPayOffACreditCard card = new MonthsToPayOffACreditCard();
        card.result();
    }

    private double getBalanceFromUser (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your balance?");
        return scanner.nextDouble();
    }

    private double getAPRfromUser (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the APR on the card ?");
        return scanner.nextDouble();
    }

    private double getMonthlyPaymentFromUser () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the monthly payment you can make?");
        return scanner.nextDouble();
    }

    private double calculateMonthsUntilPaidOff (double balance,double apr, double monthlyPayment) {
        double dailyRate = apr/365;
        double numerator = Math.log(1+ balance/monthlyPayment *(1- Math.pow((1+dailyRate),30)));
        double denominator = Math.log(1+dailyRate);
        return (-1.0 /30.0) * (numerator/denominator);
    }

    private void  result(){
        System.out.println("It will take you " + (int)Math.ceil(months) + " months to pay off this card");
    }
}

   /* Write a program that will help you determine how many
    months it will take to pay off a credit card balance. The
        program should ask the user to enter the balance of a credit
        card and the APR of the card. The program should then
        return the number of months needed.
        The formula for this is
        n = −
        1
        30
        ×
        log(1 +
        b
        p
        (1 − (1 + i)
        30))
        log(1 + i)
        where
        • n is the number of months.
        • i is the daily rate (APR divided by 365).
        • b is the balance.
        • p is the monthly payment.
        Example Output
        What is your balance? 5000
        What is the APR on the card (as a percent)? 12
        What is the monthly payment you can make? 100
        It will take you 70 months to pay off this card.
        Constraints
        • Prompt for the card’s APR. Do the division internally.
        • Prompt for the APR as a percentage, not a decimal.
        • Use a function called calculateMonthsUntilPaidOff, which
        accepts the balance, the APR, and the monthly payment
        as its arguments and returns the number of months.
        Don’t access any of these values outside the function.
        • Round fractions of a cent up to the next cent.

    */