import processing.core.*;


public class DebutScene implements Scene
{
  PImage Debut;
    public DebutScene(PApplet p)
    {
        this.p = p;
        Debut = p.loadImage("Debut.webp");
    }

    public void display()
    {
        p.background(Debut);

    }

    public void handleKeyPressed()
    {

    }

    private PApplet p;
}
