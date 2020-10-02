import java.awt.Color;
/*
 * Name: Turtle lab 
 * Description:This program draws a 2D "Hi!" on the screen using turtle
 * Date:
 */
public class TurtleLab
{
    public static void main(String[] args)
    {         
        World screen = new World();// creates a canvas on which turtle can crush1 
        Turtle crush1 = new Turtle(screen);// create a new Turtle object from the Turtle class, referenced by the variable 'crush'
        Turtle crush2 = new Turtle(400,240,screen);// create a second Turtle object from the Turtle class, referenced by the variable 'crush'
        Turtle crush3 = new Turtle(400,180,screen);// create a third Turtle object from the Turtle class, referenced by the variable 'crush'          
        Turtle crush4 = new Turtle(430,165,screen);// create a fourth Turtle object from the Turtle class, referenced by the variable 'crush'                 
        Turtle crush5 = new Turtle(430,225,screen);// create a fifth Turtle object from the Turtle class, referenced by the variable 'crush'                 
      
        crush1.setPenColor(Color.RED);//changes the object to red
        crush2.setPenColor(Color.BLUE);//changes the object to blue
        crush3.setPenColor(Color.BLUE);//changes the object to blue
        crush4.setPenColor(Color.BLACK);//changes the object to black      
        crush5.setPenColor(Color.BLACK);//changes the object to black  
        
        //changes the objects' width to 10
        crush1.setWidth(10);
        crush2.setWidth(10);
        crush3.setWidth(10);
        crush4.setWidth(10);
        crush5.setWidth(10);
        
        //This makes the crush1 object draw a red 2d "H"        
        crush1.forward(75);
        crush1.turnRight();
        crush1.forward(20);
        crush1.turnRight();
        crush1.forward(30);
        crush1.turnLeft();
        crush1.forward(20);
        crush1.turnLeft();
        crush1.forward(30);
        crush1.turnRight();
        crush1.forward(20);
        crush1.turnRight();
        crush1.forward(75);
        crush1.turnRight();
        crush1.forward(20);
        crush1.turnRight();
        crush1.forward(30);
        crush1.turnLeft();
        crush1.forward(20);
        crush1.turnLeft();
        crush1.forward(30);
        crush1.turnRight();
        crush1.forward(20);
        
        //This makes the crush2 and crush3 object draw a blue 2D "i"
        crush2.forward(55);
        crush2.turnRight();
        crush2.forward(20);
        crush2.turnRight();
        crush2.forward(55);
        crush2.turnRight();
        crush2.forward(20);
        crush3.forward(15);
        crush3.turnRight();
        crush3.forward(20);
        crush3.turnRight();
        crush3.forward(15);
        crush3.turnRight();
        crush3.forward(20);
        
        //This makes the crush4 and crush5 object draw a black 2D "!"
        crush4.turnRight();
        crush4.forward(10);
        crush4.turnRight();
        crush4.forward(55);
        crush4.turnRight();
        crush4.forward(10);
        crush4.turnRight();
        crush4.forward(55);
        crush5.turnRight();
        crush5.forward(10);
        crush5.turnRight();
        crush5.forward(15);
        crush5.turnRight();
        crush5.forward(10);
        crush5.turnRight();
        crush5.forward(15); 
    }
}
