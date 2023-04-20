import processing.core.*;
import java.util.*;

public class Cloud
{
    public PImage cloud;

    public Cloud(PApplet p)
    {
       this.p = p;
        cloud = p.loadImage("cloud.png");
       
        
    }

    public void display()
    {
        
        p.image(cloud, cx, cy);
        
        cx=cx-cv;
        if(cx<0)
        {
            cx=p.width+100;
            cy = (int)p.random((int)(p.height));
        }
        
        
    }
    
    public int getCX()
    {
        return cx;
    }
    public int getCY()
    {
        return cy; 
    }

    

    private PApplet p;
    
    private int cx;
    private int cy;
    private int cv = 3;

}

