package Chapter3;


import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfARectangularRoom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lengthOfRoom;
        int witdhOfRoom;


        System.out.println("What is the length of the room?");
        lengthOfRoom = scanner.nextInt();
        System.out.println("What is the width of the room?");
        witdhOfRoom = scanner.nextInt();
        System.out.println("You entered dimensions of " + lengthOfRoom + " feet by " + witdhOfRoom + " feet.");

        int areaInSquareFeets = lengthOfRoom * witdhOfRoom;
        final double areaInSquareMeters = areaInSquareFeets * 0.09290304;

        DecimalFormat numberFormat = new DecimalFormat("#.000");
        System.out.println("The area is " + "\n" + areaInSquareFeets + " square feet " + "\n" + numberFormat.format(areaInSquareMeters )+" square meters");

    }
}

//    Create a program that calculates the area of a room. Prompt
//        the user for the length and width of the room in feet. Then
//        display the area in both square feet and square meters.
//        Example Output
//        What is the length of the room in feet? 15
//        What is the width of the room in feet? 20
//        You entered dimensions of 15 feet by 20 feet.
//        The area is
//        300 square feet
//        27.871 square meters
//        The formula for this conversion is
//        m
//        2
//        = f
//        2
//        × 0.09290304
//        Constraints
//        • Keep the calculations separate from the output.
//        • Use a constant to hold the conversion factor