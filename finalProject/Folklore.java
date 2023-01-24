import processing.core.*;


public class FolkloreScene implements Scene
{
  public PImage Folklore;
    public FolkloreScene(PApplet p)
    {
        this.p = p;
        Folklore = loadImage("Folklore.png");
    }

    public void display()
    {
        p.background(Folklore);

    }

    public void handleKeyPressed()
    {

    }

    private PApplet p;
}
