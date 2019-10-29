package Chapter7;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputingStatistics {
    private List <Integer> responsesList = new ArrayList<>();
    private String responses;

    public static void main(String[] args) {
    ComputingStatistics computingStatistics = new ComputingStatistics();
    computingStatistics.start();
    }

    private void start (){
        addResponsesToList();
        displayResults();
    }

    private String inputFromUser (){
        System.out.println("Enter a number:");
        try {
            return new Scanner(System.in).nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Invalid value, try again");
            return inputFromUser();
        }
    }

    private void addResponsesToList () {
        boolean done = false;

        while (!done) {
            responses = inputFromUser();

            if (responses.equals("done")) {
                done = true;
            } else {
                try {
                    responsesList.add(Integer.parseInt(responses));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, try again");
                }
            }
        }
    }

    private int mean (List<Integer> x){
        int sum = 0;
        for (Integer integer : responsesList) {
            sum += integer;
        }
        return sum/responsesList.size();
    }

    private int max (List<Integer> x){
        int max = x.get(0);

        for (Integer integer : x) {
            if (max < integer) {
                max = integer;
            }
        }
        return max;
    }

    private int min (List<Integer> x){
        int min = x.get(0);

        for (Integer integer : x){
            if (min > integer){
                min = integer;
            }
        } return min;
    }


    private void displayResults (){
        System.out.println("The average is " + mean(responsesList));
        System.out.println("The maximum is " + max(responsesList));
        System.out.println("The minimum is " + min(responsesList));
    }


}
  /*  Write a program that prompts for response times from a
        website in milliseconds. It should keep asking for values
        until the user enters “done.”
        The program should print the average time (mean), the
        minimum time, the maximum time, and the standard deviation.
        To compute the average (mean)
        1. Compute the sum of all values.
        2. Divide the sum by the number of values.
        To compute the standard deviation
        1. Calculate the difference from the mean for each number
        and square it.
        2. Compute the mean of the squared values.
        3. Take the square root of the mean.
        Example Output
        Enter a number: 100
        Enter a number: 200
        Enter a number: 1000
        Enter a number: 300
        Enter a number: done
        Numbers: 100, 200, 1000, 300
        The average is 400.
        The minimum is 100.
        The maximum is 1000.
        The standard deviation is 400.25.
        Constraints
        • Use loops and arrays to perform the input and mathematical operations.
        Chapter 7. Data Structures • 68
        More books at 1Bookcase.com report erratum • discuss
        • Be sure to exclude the “done” entry from the array of
        inputs.
        • Be sure to properly convert numeric values to strings.
        • Keep the input separate from the processing and the
        output

   */