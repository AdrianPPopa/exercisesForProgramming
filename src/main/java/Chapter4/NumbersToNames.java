package Chapter4;

import java.util.Scanner;

public class NumbersToNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String month = null;

        System.out.println("Please enter the number of the month: ");
        number = scanner.nextInt();

        switch (number){
            case 1: month = "Jannuary"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10:month = "October"; break;
            case 11:month = "November"; break;
            case 12:month = "December"; break;
            default:
                System.out.println("Invalid Input");
                System.exit(0);
        }

        System.out.println("The name of the month is: " + month + ".");


    }
}

   /* Write a program that converts a number from 1 to 12 to the
        corresponding month. Prompt for a number and display the
        corresponding calendar month, with 1 being January and
        12 being December. For any value outside thatrange, display
        an appropriate error message
         Use a switch or case statement for this program.
• Use a single output statement for this program.

    */