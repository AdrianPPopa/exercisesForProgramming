package exercisesForProgrammers;

import java.util.Scanner;

public class MadLib {

//    Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then
//    construct a list of words and place them into the story, creating an often silly or funny story as a result.
//    Create a simple mad-lib program that prompts for a noun,
//    a verb, an adverb, and an adjective and injects those into a
//    story that you create.
//    Example Output
//    Enter a noun: dog
//    Enter a verb: walk
//    Enter an adjective: blue
//    Enter an adverb: quickly
//    Do you walk your blue dog quickly? That's hilarious!
//    Constraints
//• Use a single output statement for this program.
//• If your language supports string interpolation or string
//    substitution, use it to build up the output.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String noun;
        String verb;
        String adjective;
        String adverb;

        System.out.println("Enter a noun: ");
        noun = scanner.nextLine();

        System.out.println("Enter a verb: ");
        verb = scanner.nextLine();

        System.out.println("Enter an adjective: ");
        adjective = scanner.nextLine();

        System.out.println("Enter an adverb: ");
        adverb = scanner.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + ". Incredible!" );

    }
}
