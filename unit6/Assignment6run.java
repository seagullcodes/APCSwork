
import processing.core.*;
import java.util.*;


public class Assignment6run extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        balls = new ArrayList<Ball>();
        createBall();
    }

    public void createBall()
    {
        int xp = (width/2);
        int yp = (height/2);
        int xv = 5;
        int yv = 2;


        float radius = random(5, 200);
        int c = color(random(256), random(256), random(256));

        Ball ball = new Ball(this,
                             xp,yp, xv, yv,
                             radius,
                             c);

        balls.add(ball);
    }

    public void draw()
    {
        background(0);

        for (Ball ball : balls)
            ball.display();
    }

    public void keyPressed()
    {
        for (int i=0; i<10; i++)
            createBall();
    }

    public static void main(String[] args)
    {
        PApplet.main("Assignment6run");
    }

    private ArrayList<Ball> balls;
}
