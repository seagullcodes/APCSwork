
import processing.core.*;


public class Ball
{
    public Ball(PApplet p,
                int xp,
                int yp,
                int xv, int yv,
                float radius,
                int color)
    {
        this.p = p;
        this.xp = xp;
        this.yp = yp;
        this.xv = xv;
        this.yv = yv;
        this.radius = radius;
        this.color = color;
    }

    public void display()
    {
        xp += xv;
        yp += yv;
        p.fill(color);
        p.ellipse(xp, yp, radius*2, radius*2);



        if (xp<radius || xp>p.width-radius)
          {
            xv *= -1;
          }
        if (yp<radius || yp>p.height-radius)
            yv *= -1;
    }

    private PApplet p;
    private int xp;
    private int yp;
    private int xv;
    private int yv;
    private float radius;
    private int color;
}
