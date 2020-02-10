package Chapter7;

import java.util.*;

public class PasswordGenerator {


    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private List <Character> specialCharacters = Arrays.asList('!','@','#','$','%','^','&','*','?');
    private List <Character> numbers = Arrays.asList('1','2','3','4','5','6','7','8','9');
    private List <Character> letters = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m');

    private int minimumLength = getMinimumLength();
    private int numberOfSpecialCharacters = getNumberOfSpecialCharachters();
    private int numberOfNumbers = getNumberOfNumbers();
    private String generatedPassword;
    
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        passwordGenerator.start();
    }

    private void start (){
        generatePassword(minimumLength, numberOfSpecialCharacters, numberOfNumbers);
        System.out.println(generatedPassword);
    }

    private int getMinimumLength (){
        System.out.println("What's the minimum length?");
        return  scanner.nextInt();
    }

    private int getNumberOfSpecialCharachters(){
        System.out.println("How many special characters?");
        return numberOfSpecialCharacters = scanner.nextInt();
    }

    private int getNumberOfNumbers (){
        System.out.println("How many numbers?");
        return scanner.nextInt();
    }

    private void generatePassword(int length, int characters, int number){
        int numberOfLetters = length - (characters + number);
        String passwordLetters = "";
        for (int i = 0; i < numberOfLetters; i++){
            String newLetter = String.valueOf(letters.get(random.nextInt(letters.size())));
            passwordLetters = passwordLetters.concat(newLetter);
        }


        String passwordCharacters = "";
        for (int i=0; i < characters; i++){
            String newChar = String.valueOf(specialCharacters.get(random.nextInt(specialCharacters.size())));
            passwordCharacters = passwordCharacters.concat(newChar);
        }

        String passwordNumbers = "";
        for (int i = 0; i < number; i++){
            String newNumber = String.valueOf(numbers.get(random.nextInt(numbers.size())));
            passwordNumbers = passwordNumbers.concat(newNumber);
        }


        generatedPassword = passwordLetters.concat(passwordCharacters.concat(passwordNumbers));
    }



}


/*
    Create a program that generates a secure password. Prompt
        the user for the minimum length, the number of special
        characters, and the number of numbers. Then generate a
        password for the user using those inputs.
        Example Output
        What's the minimum length? 8
        How many special characters? 2
        How many numbers? 2
        Your password is
        aurn2$1s#
        Constraints
        • Use lists to store the characters you’ll use to generate
        the passwords.
        • Add some randomness to the password generation

 */