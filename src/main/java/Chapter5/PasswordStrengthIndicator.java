package Chapter5;

import java.util.Scanner;

public class PasswordStrengthIndicator {
    public static void main(String[] args) {
        passwordValidator();
    }

    private static void passwordValidator (){
        Scanner scanner = new Scanner(System.in);
        String password;
        System.out.println("Please enter your password: ");
        password = scanner.nextLine();

        if (password.matches("[0-9]+") && password.length() < 8){
            System.out.println("The password '" + password + "' is a very weak password");
        } else if (password.matches("[a-zA-Z]+") && password.length() < 8) {
            System.out.println("The password '" + password + "' is a weak password");
        } else if (password.matches("[a-zA-Z]+[0-9]+") && password.length() >= 8){
            System.out.println("The password '" + password + "' is a strong password");
        } else if (password.matches("[a-zA-Z]+[0-9]+[!@#$%&*()_+=|<>?{}\\[\\]~-]+") && password.length() >= 8){
            System.out.println("The password '" + password + "' is a very strong password");
        } else {
            System.out.println("I don't know how strong your password is");
        }

    }

}

    /*Create a program that determines the complexity of a given
    password based on these rules:
        • A very weak password contains only numbers and is
        fewer than eight characters.
        • A weak password contains only letters and is fewerthan
        eight characters.
        • A strong password contains letters and at least one
        number and is at least eight characters.
        • A very strong password contains letters, numbers, and
        special characters and is at least eight characters.
        Example Output
        The password '12345' is a very weak password.
        The password 'abcdef' is a weak password.
        The password 'abc123xyz' is a strong password.
        The password '1337h@xor!' is a very strong password.
        Constraints
        • Create a passwordValidator function that takes in the
        password as its argument and returns a value you can
        evaluate to determine the password strength. Do not
        have the function return a string—you may need to
        support multiple languages in the future.
        • Use a single output statement.

     */