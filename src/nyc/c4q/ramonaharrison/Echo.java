package nyc.c4q.ramonaharrison;

/**
 * Created by mona on 3/5/15.
 */

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please say something.");

        int something = keyboard.nextInt();

        System.out.println(something);

    }

}
