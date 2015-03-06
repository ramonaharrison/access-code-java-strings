package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * BmiCalculatorBonus.java
 * This class calculates a user's BMI in kg/m^2 from input in inches and pounds
 */

import java.util.Scanner;

public class BmiCalculatorBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heightFeet, heightInches, height, weight;
        double result;

        System.out.print("Your height (feet only): ");
        heightFeet = input.nextInt();
        System.out.print("Your height (inches): ");
        heightInches = input.nextInt();
        height = (heightFeet * 12) + heightInches;
        System.out.print("Your weight in pounds: ");
        weight = input.nextInt();
        result = (weight * 0.453592) / ((height * 0.0254) * (height * 0.0254));
        System.out.print("\nYour BMI is " + result);



    }
}
