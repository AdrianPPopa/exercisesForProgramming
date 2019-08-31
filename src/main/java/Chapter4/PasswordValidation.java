package Chapter4;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        PasswordValidation passwordValidation = new PasswordValidation();
        passwordValidation.validatePassword();

    }

    public void validatePassword (){
        Scanner scanner = new Scanner(System.in);
        String username = "Adi";
        String password = "123abc";
        String inputedUsername;
        String inputedPassword;

        System.out.println("What is your username?");
        inputedUsername = scanner.nextLine();

        System.out.println("What is your password?");
        inputedPassword = scanner.nextLine();

        if (inputedUsername.equals(username) && inputedPassword.equals(password)){
            System.out.println("Welcome Adi!");
        } else {
            System.out.println("I don't know you!");
        }

    }


}

   /* Create a simple program that validates userlogin credentials.
        The program must prompt the user for a username and
        password. The program should compare the password given
        by the user to a known password. If the password matches,
        the program should display “Welcome!” If it doesn’t match,
        the program should display “I don’t know you.”
        Example Output
        What is the password? 12345
        I don't know you.
        Or
        What is the password? abc$123
        Welcome!
        Constraints
        • Use an if/else statement for this problem.
        • Make sure the program is case sensitive.
*/