import processing.core.*;


public class SpeakNowScene implements Scene
{
  PImage SpeakNow;
    public SpeakNowScene(PApplet p)
    {
        this.p = p;
        SpeakNow = loadImage("SpeakNow.jpeg");
    }

    public void display()
    {
        p.background(SpeakNow);

    }

    public void handleKeyPressed()
    {

    }

    private PApplet p;
}
