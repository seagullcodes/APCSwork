import processing.core.*;


public class FolkloreScene implements Scene
{
  public PImage Folklore;
    public FolkloreScene(PApplet p)
    {
        this.p = p;
        Folklore = p.loadImage("Folklore.png");
    }

    public void display()
    {
        p.image(Folklore,0,0);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
