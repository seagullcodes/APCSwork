import processing.core.*;


public class ReputationScene implements Scene
{
  public PImage Rep;
    public ReputationScene(PApplet p)
    {
        this.p = p;
        Rep = p.loadImage("Reputation.png");
    }

    public void display()
    {
        p.image(Rep,0,0);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
