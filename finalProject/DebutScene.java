import processing.core.*;


public class DebutScene implements Scene
{
  PImage Debut;
    public DebutScene(PApplet p)
    {
        this.p = p;
        Debut = p.loadImage("Debut.png");
    }

    public void display()
    {
        p.image(Debut,0,0);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
