package Chapter4;

import java.util.Scanner;

public class TroubleshootingCarIssues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userResponse;

        System.out.println("Is the car silent when you turn the key?");
        userResponse = scanner.nextLine();

        switch (userResponse) {
            case "y":
                System.out.println("Are the battery terminal corroded?");
                userResponse = scanner.nextLine();
                if (userResponse.equals("y")) {
                    System.out.println("Clean terminals and try starting again");
                    break;
                } else if (userResponse.equals("n")) {
                    System.out.println("Replace cables and try again");
                    break;
                }
            case "n":
                System.out.println("Does the care make a clicking noise?");
                userResponse = scanner.nextLine();
                if (userResponse.equals("y")) {
                    System.out.println("Replace the battery");
                    break;
                } else if (userResponse.equals("n")) {
                    System.out.println("Does the car crank up but fail to start?");
                    userResponse = scanner.nextLine();
                }
                if (userResponse.equals("y")) {
                    System.out.println("Check spark plug connections");
                } else if (userResponse.equals("n")) {
                    System.out.println("Does the engine start and then die?");
                    userResponse = scanner.nextLine();
                }
                if (userResponse.equals("y")) {
                    System.out.println("Does your care have full injection?");
                    userResponse = scanner.nextLine();
                    if (userResponse.equals("n")) {
                        System.out.println("Check to ensure the choke is opening and closing");
                    } else {
                        System.out.println("Get it in for service");
                    }
                }
        }
    }
}
  /*  Create a program that walks the user through troubleshooting issues with a car. Use the following decision tree to build
        the system:
        Is the car silent when
        you turn the key?
        Are the
        battery
        terminals
        corroded?
        Replace
        cables
        and try
        again.
        Does the car
        make a
        clicking
        noise?
        Replace the
        battery.
        Does the car
        crank up but
        fail to start?
        Check spark
        plug
        connections.
        Does the
        engine start
        and then
        die?
        Does your
        car have fuel
        injection?
        Get it in for
        service.
        Check to
        ensure the
        choke is
        opening and
        closing.
        Clean
        terminals
        and try
        starting
        again.
        No
        No
        No
        Yes
        No
        Yes
        No Yes
        Yes
        Yes
        Yes
        Example Output
        Is the car silent when you turn the key? y
        Are the battery terminals corroded? n
        The battery cables may be damaged.
        Replace cables and try again.
        Chapter 4. Making Decisions • 42
        More books at 1Bookcase.com report erratum • discuss
        Constraint
        • Ask only questions that are relevant to the situation and
        to the previous answers. Don’t ask for all inputs at once

   */