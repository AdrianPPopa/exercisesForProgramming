package Chapter6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KervonenHeartRate {

    private int age = getAgeFromUser();
    private int restingPulse = getRestingPulseFromUser();

    public static void main(String[] args) {
    KervonenHeartRate kervonenHeartRate = new KervonenHeartRate();
    kervonenHeartRate.printAsTabular();
    kervonenHeartRate.calculateHeartRate();
    }

    private int getAgeFromUser (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        try {
            age = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value, try again!");
            return getAgeFromUser();
        }
        return age;
    }

    private int getRestingPulseFromUser (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Resting Pulse?");
        try {
            restingPulse = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value, try again!");
            return getRestingPulseFromUser();
        }
        return restingPulse;
    }

    private void calculateHeartRate (){
        double intensity;
        for (intensity = 55; intensity <= 95; intensity += 5){
            double rate = (((220 - age) - restingPulse) * (intensity / 100)) + restingPulse;
            System.out.println((int) intensity +"%          | " + (int)Math.round(rate) + "bpm" );
        }
    }

    private void printAsTabular (){
        System.out.println("Resting Pulse: " + restingPulse + "   Age: " + age);
        System.out.println();
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|---------");
    }
}

/*Create a program that prompts for
your age and your resting heart rate. Use the Karvonen formula to determine the target heart rate based on a range of
intensities from 55% to 95%. Generate a table with the results
as shown in the example output. The formula is
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Example Output
Resting Pulse: 65 Age: 22
Intensity | Rate
-------------|--------
55% | 138 bpm
60% | 145 bpm
65% | 151 bpm
: : (extra lines omitted)
85% | 178 bpm
90% | 185 bpm
95% | 191 bpm
Constraints
• Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
• Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering
valid inputs.
• Display the results in a tabular format.

 */