public class NumbersAndMath {
    public static void main( String[] args ) {
	    // prints output
        System.out.println( "I will now count my chickens:" );
        // prints num hens (30.0)
        System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
        // prints roosters 25.0
        System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );
        // prints output
        System.out.println( "Now I will count the eggs:" );
		// adds all the eggs (6.75
        System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );
        // prints output
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
        // compares 5 less than -2 returns false
        System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );
        // adds 3+ 2 
        System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
        // subtracts 5-7
        System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );
        // print output
        System.out.println( "Oh, that's why it's false." );
        // print output
        System.out.println( "How about some more." );
		// checks if 5 greater than 2, 5 greater or equal 2, or 5 less than 2 returns boolean
        System.out.println( "Is it greater? " + ( 5.0 > -2.0 ) );
        // checks if 5 > -2 returns boolean
        System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ) );
        // checks if 5 less or equal -2 returns boolean
        System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
	}
}
