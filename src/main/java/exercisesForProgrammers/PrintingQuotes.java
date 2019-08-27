package exercisesForProgrammers;

import java.util.Scanner;

public class PrintingQuotes {

//    Create a program that prompts for a quote and an author.
//    Display the quotation and author as shown in the example
//    output.
//            Example Output
//    What is the quote? These aren't the droids you're looking for.
//    Who said it? Obi-Wan Kenobi
//    Obi-Wan Kenobi says, "These aren't the droids
//    you're looking for."
//    Constraints
//• Use a single output statement to produce this output,
//    using appropriate string-escaping techniques for quotes.
//• If your language supports string interpolation or string
//    substitution, don’t use it for this exercise. Use string
//    concatenation instead.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String quote;
        String quoteAuthor;

        System.out.println("What is the quote? ");


        quote = scanner.nextLine();

        System.out.println("Who said it? ");
        quoteAuthor = scanner.nextLine();

        System.out.println( quoteAuthor + " says, " + "\"" + quote + "\"");

    }
}
