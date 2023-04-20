
import processing.core.*;
import java.util.*;
import processing.sound.*;

public class ColorIt extends PApplet
{
 
 SoundFile music;
 

 
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
        music = new SoundFile(this, "Phoebe Bridgers - Kyoto (Official Video).mp3");

   
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
       if(currento == 0)
       {
        if(keyCode == UP)
        {
            currento = 1;
            music.play();
        }
       }
      
        else if(currento == 1)
        {
            scenesa.get(currento).handleKeyPressed();
            
            
        }
        else if(currento == 2)
        {
            scenesa.get(currento).handleKeyPressed();
            if(keyCode == DOWN)
            {
             currento = 0;
            }
            
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
