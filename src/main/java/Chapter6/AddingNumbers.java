package Chapter6;

import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Enter a number: ");
            number = scanner.nextInt() + number;
        }
        System.out.println("The total is " + number);
    }
}
/*Write a program that prompts the user for five numbers and
computes the total of the numbers.
Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.
Constraints
• The prompting must use repetition, such as a counted
loop, not three separate prompts.
• Create a flowchart before writing the program.

 */