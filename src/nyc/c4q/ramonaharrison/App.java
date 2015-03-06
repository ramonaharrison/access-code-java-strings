package nyc.c4q.ramonaharrison;

/**
 * Created by mona on 3/5/15.
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // creates a new scanner object and passes it a system.in object
        Scanner input = new Scanner(System.in);

        // output the prompt
        System.out.println("Enter a line of text: ");

        // wait for the user to enter a line of text
        String line = input.nextLine();

        // Tell them what they entered
        System.out.println("You entered: " + line);

    }

}