import processing.core.*;
import java.util.*;

public class BallProject extends PApplet
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
        int x = 0;
        int y = 0;
        int xp = (width/2);
        int yp = (height/2);
        int xv = random();
        int yv = random();


        xp += xv;
        yp += yv;

        float radius = random(5, 20);
        int c = color(random(256), random(256), random(256));

        Ball ball = new Ball(this,x, y, radius, c);

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
        PApplet.main("Ball");
    }

    private ArrayList<Ball> balls;


  public void createBall()
  {

    Ball ball = new Ball(this, x, y, radius, c);
    balls.add(ball);
  }



  private PApplet p;
  private PVector position;
  private PVector velocity;
  private float radius;
  private int c;
  private ArrayList<Ball> balls;

}
