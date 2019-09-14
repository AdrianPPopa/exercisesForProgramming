package Chapter4;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int largestNumber;

        System.out.println("Enter the first number");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        secondNumber = scanner.nextInt();
        System.out.println("Enter the third number");
        thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber || secondNumber == thirdNumber || firstNumber == thirdNumber) {
            System.out.println("Numbers are not different");
            System.exit(0);
        }
            else if (firstNumber > secondNumber & firstNumber > thirdNumber) {
                largestNumber = firstNumber;
                System.out.println("The largest number is: " + largestNumber + ".");
            } else if (secondNumber > firstNumber & secondNumber > thirdNumber) {
                largestNumber = secondNumber;
                System.out.println("The largest number is: " + largestNumber + ".");
            } else {
                largestNumber = thirdNumber;
                System.out.println("The largest number is: " + largestNumber + ".");
            }
        }
    }


   /* Write a program that asks for three numbers. Check first to
        see that all numbers are different. If they’re not different,
        then exit the program. Otherwise, display the largest number
        of the three.
        Example Output
        Enter the first number: 1
        Enter the second number: 51
        Enter the third number: 2
        The largest number is 51.
        Constraint
        • Write the algorithm manually. Don’t use a built-in
        function for finding the largest number in a list.

    */
