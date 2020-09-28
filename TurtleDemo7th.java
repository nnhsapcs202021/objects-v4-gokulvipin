/*
 * Every java program contains one or more classes
 * 
 * In general, every source file (Turtledemo.java) contains one class (e.g. TurtleDemo).
 * 
 * The source file name must match the class name.
 * 
 * By convention, class name start with an uppercase letter
 * 
 * @author Gokulvipin
 * @version Sept 9 2020
 */
import java.awt.Color;


public class TurtleDemo7th
{
    //small change
    /*
     * A class contains methods.
     * 
     * Most Java programs contain a class with a main method.
     * 
     * The main method is executed when the program starts.
     */
    public static void main(String[] args)
    {
        World ocean = new World();  // create a new World; a canvas on which Turtle objects can draw
        Turtle crush = new Turtle(ocean); // create a new Turtle object from the Turtle class, referenced by the variable 'crush'
        crush.setPenColor(Color.ORANGE);//runs methods on the turtle object
        crush.penDown();
        crush.forward(50);
        
        /*
         * A method contains statements.xxxxxxxxxxxxxxxxxxx
         * 
         * Statements may invoke other methods (e.g., forward).
         * 
         * In general, methods are invoked on objects (e.g., crush).
         * 
         * When invoking a method, arguments are passed in parentheses (e.g., 50).
         */
        crush.forward(50);    // move crush forward 50 pixels
        
        // this is a single-line comment (like # python)
        
        
        /*
         * Identifiers are a combination of:
         * letter
         * digits(but not as first character)
         * undersoce
         * dollar sign
         * 
         */
        int SPEED_OF_LIGHT = 3000000;//meters/second
    }
    
    public static void Drawline(){
        /*
         * Objects are entities in a program
         * objects have attributes
         * object are manipulated by invoking methods
         * ocean and crush and cariables that reference objects
         * classes describe a collection of objects
         * all objects of a class have the same behaviour
         * 
         */
        World ocean = new World();
        // we use the new operator to contruct an object
        // that class of the object is specified immediately after the new operator
        Turtle crush = new Turtle(ocean);
        /*
         * Variables store calues to be used later
         * variabkes have a type (int) a name ( width) and a value(20)
         
         */
        
        int width;// declaring a variable        
        width = 20;// assigning a value to the variable
        
        /*
         * Java has several data types:
         *      boolean hold a value of true or false
         *      int hold an integer number
         *      double holds a real number(floating point)
         *      char holds a single charachter
         *      
         */
        // here is a boolean
        boolean isSummer = true;
        
        // here is a double
        double salesTaxRate = 0.676;
        
        // here is a char
        char letter = 'c';
        
        // here is an int
        int numr = 7;
        
        // assigning a variable's value to another one
        int num1 = 7;
        int num2 = 20;
        num2 = num1;
        /*
         * When invoking methods, we use the dot operator to invoke a method
         * 
         * Some methods take no arguments, but we still have parantheses
         * 
         * Some methods take one or more arguments
         * 
         * Mutator methods modify the state of the object
         * penforward, Down, set pencolor
         */
   
        crush.penDown();
        crush.forward(50);
        crush.setPenColor(Color.red);
        int penWidth = crush.getPenWidth();
        
        
        
    }
}
