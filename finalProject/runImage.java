import processing.core.*;


public class runImage extends PApplet
{
    PImage r;
    public void setup()
    {
      r = loadImage("SpeakNow.jpeg");

    }
    public void draw()
    {
      image(r, 0, 0);
    }
    public static void main(String[] args)

    {



      PApplet.main("runImage");
    }

}
