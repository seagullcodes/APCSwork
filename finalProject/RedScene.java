import processing.core.*;
import processing.sound.*;

public class RedScene implements Scene
{
    SoundFile Reds; 
    PImage Red;
   
   
   
   public RedScene(PApplet p)
    {
        this.p = p;
        Red = p.loadImage("Red.png");
        Reds = new SoundFile(p, "Red.wav");
    }

    public void display()
    {
        p.image(Red, 0, 0);
        Reds.play();
    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
