
import processing.core.*;
import java.util.*;

public class ColorIt extends PApplet
{
 
 

 
  private ArrayList<Scenel> scenesa;
  
  private int currento = 0;
    public void settings()
    {
        fullScreen();
        
    }

    public void setup()
    {
        Game a = new Game(this);
        scenesa = new ArrayList<Scenel>();
        scenesa.add(new Start(this));
        scenesa.add(a);
        scenesa.add(new End(this));

   
    }

    public void setScene(int n)
    {
        currento = n;
    }

    public void draw()
    {

        scenesa.get(currento).display();
  
       
        
    }

    public void keyPressed()
    {
       
       if(keyCode == UP && currento == 0)
        {
            currento = 1;
            System.out.println("HI");
        }
        else if(currento == 1)
        {
            scenesa.get(currento).handleKeyPressed();
        }
        else if(currento == 2)
        {
            scenesa.get(currento).handleKeyPressed();
        }
        else if(keyCode == DOWN && currento == 1)
        {
            currento = 0;
            System.out.println("function 4");
        }
        else if(currento == 2 && keyCode == UP)
        {
            currento = 0;
            System.out.println("function 5");
        }
       
    }
    
    public void mouseClicked()
    {
       
    }


    public static void main(String[] args)
    {
        PApplet.main("ColorIt");
    }

}
