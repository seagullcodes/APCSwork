import processing.core.*;


public class RedScene implements Scene
{
    PImage Red;
    public RedScene(PApplet p)
    {
        this.p = p;
        Red = p.loadImage("Red.png");
    }

    public void display()
    {
        p.image(Red, 0, 0);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
