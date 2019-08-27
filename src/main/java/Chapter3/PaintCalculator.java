package Chapter3;

import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        int width;
        int galloon = 350;

        System.out.println("What is the length of the room?");
        length = scanner.nextInt();

        System.out.println("What is the width of the room?");
        width = scanner.nextInt();

        int area = length * width;
        int numberOfGallons = area / galloon;

        System.out.println("You will need to purchase " + Math.ceil(numberOfGallons) + " gallons of paint to cover " + area + " square feet.");

    }
}

//    Calculate gallons of paint needed to paint the ceiling of a
//        room. Prompt for the length and width, and assume one
//        gallon covers 350 square feet. Display the number of gallons
//        needed to paint the ceiling as a whole number.
//        Example Output
//        You will need to purchase 2 gallons of
//        paint to cover 360 square feet.
//        Remember, you can’t buy a partial gallon of paint. You must
//        round up to the next whole gallon.
//        Constraints
//        • Use a constant to hold the conversion rate.
//        • Ensure that you round up to the next whole number.