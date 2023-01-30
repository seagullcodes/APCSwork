import processing.core.*;


public class LoverScene implements Scene
{
  PImage Lover;
    public LoverScene(PApplet p)
    {
        this.p = p;
        Lover = p.loadImage("Lover.png");
    }

    public void display()
    {
        p.background(Lover);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
