package nyc.c4q.ramonaharrison;

/**
 * Created by mona on 3/3/15.
 */
public class MoreVariablesAndPrinting {
    public static void main( String[] args )
    {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;
        double heightInCentimeters, weightInKilos;

                Name = "Zed A. Shaw";
        Age = 35;     // not a lie
        Height = 74;  // inches
        heightInCentimeters = Height * 2.54;
        Weight = 180; // lbs
        weightInKilos = Weight * 2.2;
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + heightInCentimeters + " cm tall." );
        System.out.println( "He's " + weightInKilos + " kilos heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
                + " I get " + (Age + Height + Weight) + "." );
    }
}
