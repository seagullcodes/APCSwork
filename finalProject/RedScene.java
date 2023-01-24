import processing.core.*;


public class RedScene implements Scene
{
  PImage Red;
    public RedScene(PApplet p)
    {
        this.p = p;
        Red = loadImage("Red.png");
    }

    public void display()
    {
        p.background(Red);

    }

    public void handleKeyPressed()
    {

    }

    private PApplet p;
}
