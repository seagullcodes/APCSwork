import processing.core.*;


public class LoverScene implements Scene
{
  PImage Lover;
    public LoverScene(PApplet p)
    {
        this.p = p;
        Lover = loadImage("Lover.png");
    }

    public void display()
    {
        p.background(Lover);

    }

    public void handleKeyPressed()
    {

    }

    private PApplet p;
}
