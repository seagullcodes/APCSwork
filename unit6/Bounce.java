import processing.core.*;
public class Bounce extends PApplet
{
  pulic viod settings(_
  {
    size(400,400);
  }
  public void setup()
  {
    balls = new ArrayList<ball>();
    createBall();
  }
  public void draw()
  {
    background(0);
    for(Ball ball : balls)
        ball.display();
  }
  public static void main(String[] args)
  {
    PApplet.main("Bounce");
  }
  public class Ball
  {
    public Ball(PVector position, PVector velocity, float radius, int color, PApplet p)
    {
      this.position = position;
      this.velocity = velocity;
      this.radius = radius;
      this.color = color;
      this.p = p;
    }
    public void createBall()
    {
      PVector position = new PVector(width/2, height/2);
      PVector velocity = PVector.random2D();
      velocity.setMag(radom(3, 5));
      float radius = random(5, 20);
      int c = color(random(256), random(256), random(256));

      Ball ball = new Ball(this, position, velocity, radius, c)
      balls.add(ball);
    }
    public void display()
    {
      p.fill(color);
      p.ellipse(position.x, position.y, radius*2, radius*2);
      position.add(velocity);
      if(position.x<radius || position.x>width)
      {
        velocity.x *= -1;
      }
      else if(p.position.y<0 || position.y>p.width)
      {
        velocity.x *= -1;
      }
    }
    public void keyPressed()
    {
      for(int i = 0; i <10; i++)
      {
      create ball()
    }
    }
    private PApplet p;
    private PVector position;
    private PVector velocity;
    private float radius;
    private int c;
    private ArrayList<Ball> balls;

  }
}
