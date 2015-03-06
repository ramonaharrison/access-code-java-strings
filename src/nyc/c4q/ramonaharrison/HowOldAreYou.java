package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * HowOldAreYou.java
 * This class asks how old you are then lays down the law
 */
import java.util.Scanner;

public class HowOldAreYou {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Hey, what's your name?");
        name = input.nextLine();
        System.out.println("Ok, " + name + ", how old are you?");
        age = input.nextInt();
        if (age < 16) {
            System.out.println("You can't drive, " + name + ".");
        }
        if (age < 18) {
            System.out.println("You can't vote, " + name + ".");
        }
        if (age < 25) {
            System.out.println("You can't rent a car, " + name + ".");
        }
        if (age >= 25) {
            System.out.println("You can do anything that's legal.");
        }
    }
}
