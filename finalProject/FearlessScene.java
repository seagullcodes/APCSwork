import processing.core.*;


public class FearlessScene implements Scene
{
  PImage Fearless;
    public FearlessScene(PApplet p)
    {
        this.p = p;
        Fearless = p.loadImage("Fearless.png");
    }

    public void display()
    {
        p.image(Fearless, 0, 0);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
