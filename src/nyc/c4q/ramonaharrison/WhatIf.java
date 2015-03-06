package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * WhatIf.java
 * This class says things about the populations of cats, dogs, and people
 */
public class WhatIf {
    public static void main(String[] args) {
        int people = 20;
        int cats = 30;
        int dogs = 15;

        if ( people < cats ) {
            System.out.println( "Too many cats! The world is doomed!" );
        }
        if ( people > cats ) {
            System.out.println( "Not many cats! The world is saved!" );
        }

        if ( people < dogs ) {
            System.out.println( "The world is drooled on!" );
        }
        if ( people > dogs ) {
            System.out.println( "The world is dry!" );
        }

        dogs += 5;

        if ( people >= dogs ) {
            System.out.println( "People are greater than or equal to dogs." );
        }
        if ( people <= dogs ) {
            System.out.println( "People are less than or equal to dogs.");
        }
        if ( people == dogs ) {
            System.out.println( "People are dogs.");
        }
    }
}
