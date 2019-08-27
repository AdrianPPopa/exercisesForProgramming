package exercisesForProgrammers;

import java.util.Scanner;
import java.time.LocalDate;

public class RetirementCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int currentAge;
        int retirementAge;
        LocalDate currentDate = LocalDate.now();

        System.out.println("What is your current age?");
        currentAge = scanner.nextInt();
        System.out.println("At what age would you like to retire?");

        retirementAge = scanner.nextInt();
        long yearsUntilRetire = retirementAge - currentAge;
        LocalDate retirementYear = currentDate.plusYears(yearsUntilRetire);

        System.out.println("You have " + yearsUntilRetire + " years until you can retire");
        System.out.println("It's " + currentDate.getYear() + ", so you can retire in " + retirementYear.getYear() + ".");



    }
}

//    Create a program that determines how many years you have
//    left until retirement and the year you can retire. It should
//    prompt for your current age and the age you want to retire
//        and display the output as shown in the example that follows.
//        Example Output
//        What is your current age? 25
//        At what age would you like to retire? 65
//        You have 40 years left until you can retire.
//        It's 2015, so you can retire in 2055.
//        Constraints
//        • Again, be sure to convert the input to numerical data
//        before doing any math.
//        • Don’t hard-code the current year into your program.
//        Get it from the system time via your programming language.