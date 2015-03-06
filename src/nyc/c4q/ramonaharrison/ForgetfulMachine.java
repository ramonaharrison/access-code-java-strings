package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * ForgetfulMachine.java
 * This class asks the user questions and forgets their answers
 */

import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give me a word:");
        keyboard.nextLine();
        System.out.println("Give me a second word!");
        keyboard.nextLine();
        System.out.println("Great, now your favorite number?");
        keyboard.nextInt();
        System.out.println("And your second favorite number?");
        keyboard.nextInt();
        System.out.println("Whew, wasn't that fun?");

    }
}
