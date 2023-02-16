import java.util.*;


public class shapeCollection
{
    public shapeCollection()
    {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(String name, int sides)
    {
        Shape shape = new Shape(name, sides);
        shapes.add(shape);
    }

    public ArrayList<Shape> evenSide()
    {
        ArrayList<Shape> result = new ArrayList<Shape>();

        for (Shape s : shapes)
        {
            if (s.getSides()%2 == 0)
            
            {
                result.add(s);
                
            }
        }

        return result;
    }

    
    public int aveShape()
    {
        int total = 0;
        for(Shape s: shapes)
        {
            total += s.getSides();
        }
        return total/shapes.size();
    }
    public int numberOfSides(String shapeName)
    {
        int a = 0;
        for(Shape s: shapes)
        {
            if(shapeName == s.getName())
            {
                a = s.getSides();
            }
            
        }
        return a;
        
    }

    private ArrayList<Shape> shapes;


    public static void main(String[] args)
    {
        shapeCollection collection = new shapeCollection();

        collection.addShape("Rect", 4);
        collection.addShape("Circle", 0);
        collection.addShape("Triangle", 3);
        collection.addShape("Oct", 8);
        
        System.out.println("array list of even" + collection.evenSide());
        System.out.println("average shape side" + collection.aveShape());
        System.out.println("look up shape" + collection.numberOfSides("Oct"));
        
    }
}

