import processing.core.*;


public class SpeakNowScene implements Scene
{
  PImage SpeakNow;
    public SpeakNowScene(PApplet p)
    {
        this.p = p;
        SpeakNow = p.loadImage("SpeakNow.jpeg");
        
    }

    public void display()
    {
        p.image(SpeakNow, 0, 0);
        //p.background(SpeakNow);

    }

    public void handleMouseClicked()
    {

    }

    private PApplet p;
}
