import java.awt.Color;

public class TurtleLab
{

    public static void main(String[] args)
    {      

        World screen = new World();// creates a canvas on which turtle can crush1 
        Turtle crush1 = new Turtle(screen);// create a new Turtle object from the Turtle class, referenced by the variable 'crush'
        Turtle crush2 = new Turtle(screen);// create a second Turtle object from the Turtle class, referenced by the variable 'crush'
        crush1.setPenColor(Color.RED);//changes the object to red
        crush2.setPenColor(Color.BLUE);//changes the object to red
        crush1.setWidth(10);//changes the object's width to 10
        crush2.setWidth(10);//changes the object's width to 10
        
        
        
        
       
       
        
    }
}
