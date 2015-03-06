package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * SmartCalculator.java
 * This class asks the user for three numbers then reports the sum divided by 2
 */

import java.util.Scanner;

public class SmartCalculator {
    public static void main(String[] args) {
        double firstNum, secondNum, thirdNum, answer;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first number?");
        firstNum = input.nextDouble();

        System.out.println("What is your second number?");
        secondNum = input.nextDouble();

        System.out.println("What is your third number?");
        thirdNum = input.nextDouble();

        answer = (firstNum + secondNum + thirdNum) / 2;
        System.out.println("( " + firstNum + " + " + secondNum + " + " + thirdNum + " )" + " / 2 is ... " + answer);

    }
}
