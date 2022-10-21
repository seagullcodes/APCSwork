import processing.core.*;

public class ProcessingProject extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }
    int x = width/2;
    int y = height/2;
    int xv = 0;
    int yv = 0;

    public void setup()
    {

    }
    public void keyPressed()
    {
      println("Hello");
       if (keyCode == RIGHT)
       {
         xv +=10;
       }
       else if (keyCode == LEFT)
       {
         xv -=10;
       }
       if (keyCode == UP)
       {
         yv +=10;
       }
       if (keyCode == DOWN)
       {
         yv -=10;
       }
    }

    public void draw()
    {
        background(0);
        x += xv;
        y += yv;

        ellipse(x,y,20,20);

    }


    public static void main(String[] args)
    {
        PApplet.main("ProcessingProject");
    }
}
