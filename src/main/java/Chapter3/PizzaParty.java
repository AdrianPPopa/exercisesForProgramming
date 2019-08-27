package Chapter3;

import java.util.Scanner;

public class PizzaParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople;
        int numberOfPizza;
        final int slicesPerPizza = 6;



        System.out.println("How many people?");
        numberOfPeople = scanner.nextInt();
        System.out.println("How many pizzas do you have?");
        numberOfPizza = scanner.nextInt();

        int totalNumberOfSlices = numberOfPizza * slicesPerPizza;
        int slicesPerPeople = totalNumberOfSlices / numberOfPeople;
        int leftovers = totalNumberOfSlices % numberOfPeople;
        System.out.println(numberOfPeople + " people with " + numberOfPizza + " pizzas");
        System.out.println("Each person get " + slicesPerPeople + " pieces of pizza");
        System.out.println("There are " + leftovers + " leftover pieces");

    }


}

//    Write a program to evenly divide pizzas. Prompt for the
//////        number of people, the number of pizzas, and the number of
//////        slices per pizza. Ensure that the number of pieces comes out
//////        even. Display the number of pieces of pizza each person
//////        should get. If there are leftovers, show the number of leftover
//////        pieces.
//////        Example Output
//////        How many people? 8
//////        How many pizzas do you have? 2
//////        8 people with 2 pizzas
//////        Each person gets 2 pieces of pizza.
//////        There are 0 leftover pieces.