package exercisesForProgrammers;

import java.util.Scanner;

public class SayingHello {

//    The “Hello, World” program is the first program you learn
//    to write in many languages, but it doesn’t involve any input.
//    So create a program that prompts for your name and prints
//    a greeting using your name.
//            Example Output
//    What is your name? Brian
//    Hello, Brian, nice to meet you!


    public static void main(String[] args) {
        String name;

        System.out.println("What is your name? ");

        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}