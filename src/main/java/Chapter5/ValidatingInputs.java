package Chapter5;

import java.util.Scanner;

public class ValidatingInputs {
    private Scanner scanner = new Scanner(System.in);
    private String firstName = getFirstName();
    private String lastName = getLastName();
    private String zipCode = getZipCode();
    private String id = getID();
    private int error =0;

    public static void main(String[] args) {
    ValidatingInputs validatingInputs = new ValidatingInputs();
    validatingInputs.inputValidator();
    }

    private String getFirstName (){
        System.out.println("Enter the first name: ");
        return firstName = scanner.nextLine();
    }

    private void validateFirstName (){
        if (firstName.length() < 1){
            error++;
            System.out.println("First name must be filled in");}
            else if (firstName.length() <= 2) {
            error++;
                System.out.println(firstName + " is not a valid first name. It is too short");
            }
        }

    private String getLastName (){
        System.out.println("Enter the last name: ");
        return lastName = scanner.nextLine();
    }

    private void validateLastName (){
        if (lastName.length() < 1){
            error++;
            System.out.println("Last name must be filled in");}
        else if (lastName.length() <= 2) {
            error++;
            System.out.println(lastName + " is not a valid last name. It is too short");
        }
    }

    private String getZipCode(){
        System.out.println("Enter the zip code: ");
        return zipCode = scanner.nextLine();
    }

    private void validateZipCode (){
        if (!zipCode.matches("[0-9]+")){
            error++;
            System.out.println("The ZIP code must be a number");
        }
    }

    private String getID (){
        System.out.println("Enter an employee ID");
        return id = scanner.nextLine();
    }

    private void validateID(){
        if (!id.matches("[a-zA-z]{2}+[-]+[0-9]{4}")){
            error++;
            System.out.println(id + " is not a valid id");
        }
    }

    private void inputValidator (){
        validateFirstName();
        validateLastName();
        validateZipCode();
        validateID();
        if (error < 1){
            System.out.println("There were no errors found");
        }
    }


}

   /* Write a program that prompts for a first name, last name,
        employee ID, and ZIP code. Ensure that the input is valid
        according to these rules:
        • The first name must be filled in.
        • The last name must be filled in.
        • The first and last names must be at least two characters
        long.
        • An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
        • The ZIP code must be a number.
        Display appropriate error messages on incorrect data.
        Example Output
        Enter the first name: J
        Enter the last name:
        Enter the ZIP code: ABCDE
        Enter an employee ID: A12-1234
        "J" is not a valid first name. It is too short.
        The last name must be filled in.
        The ZIP code must be numeric.
        A12-1234 is not a valid ID.
        Or
        Enter the first name: Jimmy
        Enter the last name: James
        Enter the ZIP code: 55555
        Enter an employee ID: TK-421
        There were no errors found.
        Constraints
        • Create a function for each type of validation you need
        to write. Then create a validateInput function that takes
        in all of the input data and invokes the specific validation functions.
        • Use a single output statement to display the outputs.

    */