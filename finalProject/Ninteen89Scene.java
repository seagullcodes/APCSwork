import processing.core.*;


public class Ninteen89Scene implements Scene
{
  public PImage a1989;
    public FearlessScene(PApplet p)
    {
        this.p = p;
        a1989 = p.loadImage("1989.webp");
    }

    public void display()
    {
        p.background(a1989);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
