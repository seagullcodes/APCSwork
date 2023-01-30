import processing.core.*;


public class MenuScene implements Scene
{
  PImage menu;
    public MenuScene(PApplet p)
    {
        this.p = p;
        menu = p.loadImage("Screen_Shot_2023-01-20_at_8.40.56_AM-removebg-preview.png");
    }

    public void display()
    {
        p.background(menu);
        p.ellipse(40,40,40,40);
    }

    public void handleMouseClicked()
    {

    }
  
    private PApplet p;
}
