package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * ForgetfulMachine.java
 * This class asks the user questions and comments on their responses
 */

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = keyboard.nextLine();
        System.out.println("Hi " + name + "! How old are you?");
        int age = keyboard.nextInt();
        System.out.println("So you're " + age + ", eh? That's not old at all!\nHow much do you make, " + name +"?");
        float wage = keyboard.nextFloat();
        System.out.println(wage + "! I hope that's per hour and not per year! LOL!");

    }
}
