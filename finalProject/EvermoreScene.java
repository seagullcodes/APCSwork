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
        p.image(Evermore,0,0);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
