public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age, height, weight;

        name = "Zed A. Shaw";
        age = 35;     // not a lie
        height = 74;  // inches
        weight = 180; // lbs
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println( "Let's talk about " + name + "." );
        System.out.println( "He's " + height + " inches tall." );
        System.out.println( "He's " + weight + " pounds heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + eyes + " eyes and " + hair + " hair." );
        System.out.println( "His teeth are usually " + teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + age + ", " + height + ", and " + weight+ " I get " + (age + height + weight) + "." );
        // convert pounds to kg
        System.out.println("I am " + weight + "lb. This is equal to " + weight * 0.45359 + "kg" );
        System.out.println("I am " + height + "inches. This is equal to " + height * 2.54 + "cm.");
    }
}
