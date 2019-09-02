package Chapter4;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String chosenTemperature;
        int celsiusTemperature;
        int fahrenheitTemperature;

        System.out.println("Press F to convert from Celsius to Fahrenheit" + "\n" +
                           "Press C to convert from Fahrenheit to Celsius");

        chosenTemperature = scanner.nextLine();

        if (chosenTemperature.equals("C") || chosenTemperature.equals("c")){
            System.out.println("Please enter the temperature in Fahrenheit ");
            fahrenheitTemperature = scanner.nextInt();
            int converterFromFahrenheitToCelsius = (fahrenheitTemperature - 32) * 5/9;
            System.out.println("The temperature in Celsius is " + converterFromFahrenheitToCelsius);
        } if (chosenTemperature.equals("F") || chosenTemperature.equals("f")){
            System.out.println("Please enter the temperature in Celsius ");
            celsiusTemperature = scanner.nextInt();
            int converterFromCelsiusToFahrenheit = (celsiusTemperature * 9/5) + 32;
            System.out.println("The temperature in Fahrenheit is " + converterFromCelsiusToFahrenheit);
        }


    }
}

   /* Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the
        starting temperature. The program should prompt for the
        type of conversion and then perform the conversion.
        The formulas are
        C = (F − 32) × 5 / 9
        and
        F = (C × 9 / 5) + 32
        Example Output
        Press C to convert from Fahrenheit to Celsius.
        Press F to convert from Celsius to Fahrenheit.
        Your choice: C
        Please enter the temperature in Fahrenheit: 32
        The temperature in Celsius is 0.
        Constraints
        • Ensure that you allow upper or lowercase values for C
        and F.
        • Use as few output statements as possible and avoid
        repeating output strings.

    */
