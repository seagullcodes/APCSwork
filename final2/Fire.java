import processing.core.*;
import java.util.*;

public class Fire
{
    public PImage fire;

    public Fire(PApplet p, int fx, int fy)
    {
        
        this.p = p;
        this.fx = fx;
        this.fy = fy;
        
        fire = p.loadImage("fire.png");
        
    }

    public void display()
    {
        
        p.image(fire, fx, fy);
        
        fx--;
        if(fx<0)
        {
            fx=p.width+100;
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
    private double fv = 0;
    private double fa = 0;

}

