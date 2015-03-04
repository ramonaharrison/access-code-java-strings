package nyc.c4q.ramonaharrison;

/**
 * Created by mona on 3/3/15.
 */
public class TwelveDaysOfChristmas {
    public static void main(String[] args) {

        String firstDay, secondDay, thirdDay, fourthDay, fifthDay, sixthDay, seventhDay, eighthDay, ninthDay, tenthDay, eleventhDay, twelfthDay;

        firstDay = "a Partridge in a Pear Tree";
        secondDay = "Two Turtle Doves";
        thirdDay = "Three French Hens";
        fourthDay = "Four Calling Birds";
        fifthDay = "Five Gold Rings";
        sixthDay = "Six Geese a-Laying";
        seventhDay = "Seven Swans a-Swimming";
        eighthDay = "Eight Maids a-Milking";
        ninthDay = "Nine Ladies Dancing";
        tenthDay = "Ten Lords a-Leaping";
        eleventhDay = "Eleven Pipers Piping";
        twelfthDay = "Twelve Drummers Drumming";

        String[] gifts = {firstDay, secondDay, thirdDay, fourthDay, fifthDay, sixthDay, seventhDay, eighthDay, ninthDay, tenthDay, eleventhDay, twelfthDay};

        String[] dayOfChristmas = {"First", "Second,", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth"};


        for (int i = 0; i < 12; i++) {

            System.out.println("On the " + dayOfChristmas[i] + " day of Christmas my true love sent to me");

            for (int j = i; j >= 0; j--) {
                System.out.println(gifts[j]);
            }

            System.out.println('\n');

        }
    }
}
