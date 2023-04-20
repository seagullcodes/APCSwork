import processing.core.*;
import java.util.*;

public class Character
{
    public PImage person;
    public PImage burn;

    public Character(PApplet p, int w, int h, int startX, int startY, int colora)
    {
        
        this.p = p;
        this.w = w;
        this.h = h;
     
        this.startX = startX;
        this.startY = startY;
        this.colora = colora;
        person = p.loadImage("person.png");
        burn = p.loadImage("burn.png");
        
    }

    public void display()
    {
        p.fill(255);
        //p.ellipse(p.width/2,p.height/2,50,50);
        p.fill(colora);
       //p.image(burn, startX, startY);
 
        
        if (startY>(800)) { //limit how far character can fall
             startY = 800;
             v = 0;
             a=0;
        }
       else if (startX >=600)
      {
         startX = 600;
     }
     if(startY<0)
     {
        startY = 0;
     }
        
       if(cState ==  0)
       {
         p.image(person, startX, startY);
         p.image(burn, 100000, 10000);
         }
         
    
        else if(cState == 1)
        {
        p.image(burn, startX, startY);
        }
       
        startY += v;
        v+= a;
        
        
    }
    
    public int getStartX()
    {
        return startX;
    }
    
    public int getStartY()
    {
        return startY;
    }
    
    public void fixStartX(int n)
    {
        startX = n;
    }
    public void fixStartY(int n)
    {
        startY = n;
    }

      public void jump()
       {
        
           v=-5;
           a=0.3;
        System.out.println("WORKING");
     
        }
    

    private PApplet p;
    private int w;
    private int h;
    private int startX;
    private int startY;
    private double v = 0;
    private double a = 0;
    private int colora = 000000;
    public int cState = 0;
   

}

