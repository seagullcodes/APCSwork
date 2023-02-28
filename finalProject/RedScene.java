import processing.core.*;
//import processing.sound.*;

public class RedScene implements Scene
{
    //SoundFile Reds; 
    PImage Red;
    //Reds = new SoundFile(this, "Red.wav");
    public RedScene(PApplet p)
    {
        this.p = p;
        Red = p.loadImage("Red.png");
    }

    public void display()
    {
        p.image(Red, 0, 0);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
