package nyc.c4q.ramonaharrison;

/**
 * Created by mona on 3/3/15.
 */
import java.util.Scanner;
public class MyAge {
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        int myAgeNow, ageInFive;

        System.out.println("How old are you?");
        myAgeNow = input.nextInt();
        ageInFive = myAgeNow + 5;
        System.out.println("You are " + myAgeNow + " years old. In 5 years, you will be " + ageInFive + " years old.");
    }
}
