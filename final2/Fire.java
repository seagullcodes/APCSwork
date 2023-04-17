import processing.core.*;
import java.util.*;

public class Fire
{
    public PImage fire;

    public Fire(PApplet p, int fx, int fy, int xv)
    {
        
        this.p = p;
        this.fx = fx;
        this.fy = fy;
        this.xv = xv;
        
        fire = p.loadImage("fire.png");
        System.out.println(xv);
        
    }

    public void display()
    {
        
        p.image(fire, fx, fy);
        
        fx=fx-xv;
        if(fx<0)
        {
            fx=p.width+100;
            fy = (int)p.random((int)(p.height));
        }
        
        
    }
    
    public int getFX()
    {
        return fx;
    }
    public int getFY()
    {
        return fy; 
    }

    

    private PApplet p;
    
    private int fx;
    private int fy;
    private int xv;
    private double fv = 0;
    private double fa = 0;

}

