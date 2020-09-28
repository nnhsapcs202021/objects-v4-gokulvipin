import java.awt.Color;
// hello
public class TurtleDemo
{
    public static void main(String[] args)
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(100);
        
    }
}
