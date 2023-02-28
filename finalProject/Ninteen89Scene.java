import processing.core.*;


public class Ninteen89Scene implements Scene
{
  public PImage a1989;
    public Ninteen89Scene(PApplet p)
    {
        this.p = p;
        a1989 = p.loadImage("1989.png");
    }

    public void display()
    {
        p.image(a1989,0,0);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
