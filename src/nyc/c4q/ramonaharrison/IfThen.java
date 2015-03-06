package nyc.c4q.ramonaharrison;

/**
 * Created by mona on 3/5/15.
 */

import java.util.Scanner;

public class IfThen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your password?");

        String password = in.next();

        if (password.equals("real1234")) { // (password == "real1234") will not work
            System.out.println("Logged in.");
        } else {
            System.out.println("Wrong password.");
        }
    }
}
