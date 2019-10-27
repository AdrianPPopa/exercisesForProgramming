package Chapter7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeListRemoval {
    private List<String> employeeList = new ArrayList<>();

    public static void main(String[] args) {
    EmployeeListRemoval employeeListRemoval = new EmployeeListRemoval();
    employeeListRemoval.start();
    }

    private void start (){
        addEmployeesToList();
        displayEmployees();
        removeEmployee();
    }

    private void addEmployeesToList (){
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");
        System.out.println("There are " + employeeList.size() + " employees.");
    }

    private void displayEmployees (){
        for (String s : employeeList) {
            System.out.println(s);
        }
    }

    private String getEmployeeName (){
        System.out.println("Enter an employee name to remove.");
        try {
            return new Scanner(System.in).nextLine();}
        catch (InputMismatchException e){
            System.out.println("Please enter a string");
            return getEmployeeName();
        }
    }

    private void removeEmployee (){
        employeeList.remove(getEmployeeName());
        System.out.println("There are " + employeeList.size() + " employees.");
        for (String s : employeeList) {
            System.out.println(s);
        }
    }
}
/* Create a small program that contains a list of employee
names. Print out the list of names when the program runs
the first time. Prompt for an employee name and remove
that specific name from the list of names. Display the
remaining employees, each on its own line.
Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin
Enter an employee name to remove: Chris Jones
There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin
Constraint
• Use an array or list to store the names.

 */