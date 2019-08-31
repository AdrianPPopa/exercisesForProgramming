package Chapter4;

import java.util.Scanner;

public class LegalDrivingAge {

    public static void main(String[] args) {
        LegalDrivingAge legalDrivingAge = new LegalDrivingAge();
        legalDrivingAge.testLegalAge();
    }

    private void testLegalAge (){
        Scanner scanner = new Scanner(System.in);
        int userAge;

        System.out.println("What is your age?");
        userAge = scanner.nextInt();

        final String legalDrivingAge = userAge > 15
                ? "You are old enough to legally drive."
                : "Your are not old enough to legally drive.";
        System.out.println(legalDrivingAge);

    }
}
/*Write a program that asks the userfortheir age and compare
it to the legal driving age of sixteen. If the user is sixteen or
older, then the program should display “You are old enough
to legally drive.” If the user is under sixteen, the program
should display “You are not old enough to legally drive.”
Example Output
What is your age? 15
You are not old enough to legally drive.
Or
What is your age? 35
You are old enough to legally drive.
Constraints
• Use a single output statement.
• Use a ternary operator to write this program. If your
language doesn’t support a ternary operator, use a regular if/else statement, and still u */