import processing.core.*;


public class FearlessScene implements Scene
{
  PImage Fearless;
    public FearlessScene(PApplet p)
    {
        this.p = p;
        Fearless = loadImage("Fearless.webp");
    }

    public void display()
    {
        p.background(Fearless);

    }

    public void handleKeyPressed()
    {

    }

    private PApplet p;
}
