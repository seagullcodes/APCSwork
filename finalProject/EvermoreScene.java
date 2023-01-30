import processing.core.*;


public class EvermoreScene implements Scene
{
  public PImage Evermore;
    public EvermoreScene(PApplet p)
    {
        this.p = p;
        Evermore = p.loadImage("Evermore.png");
    }

    public void display()
    {
        p.background(Evermore);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
