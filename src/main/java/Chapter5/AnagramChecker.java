package Chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
      if (isAnagram()){
          System.out.println("These words are anagrams");
      } else {
          System.out.println("These words are not anagrams");
      }
    }

    private static boolean isAnagram(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string");
        String secondString = scanner.nextLine();

        if (firstString.length() != secondString.length()){
           return false;
        }
        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();
        char[] c1 = firstString.toCharArray();
        char[] c2 = secondString.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equals(sc2);
    }

}

   /* Create a program that compares two strings and determines
        if the two strings are anagrams. The program should prompt
        for both input strings and display the output as shown in
        the example that follows.
        Example Output
        Enter two strings and I'll tell you if they
        are anagrams:
        Enter the first string: note
        Enter the second string: tone
        "note" and "tone" are anagrams.
        Constraints
        • Implement the program using a function called isAnagram, which takes in two words as its arguments and
        returns true or false. Invoke this function from your main
        program.
        • Check that both words are the same length.

    */