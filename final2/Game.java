import processing.core.*;
import java.util.*;
import processing.sound.*;

public class Game implements Scenel
{
   SoundFile fireNound;
    public int score = 20;
 
    private int a = 0;
   
    
    public Game(ColorIt p)
    {
        this.p = p;
        madeleine = new Character(p, 40, 40, 50, 500, 0xff341FEB);
        fireNound = new SoundFile(p, "fire.mp3");
       
        for(int i = 0; i<40; i++)
        {
            fireslist.add(new Fire(p, p.width,(int)p.random((int)(p.height)), (int)p.random(10)));
        }
    }

    public void display()
    {
        p.background(0xffeba16a);
        madeleine.display();
        font1 = p.createFont("fonty.ttf", 80);
        p.text("amount of lives", 100, 100);
        p.text("use the space bar to jump!", p.width/2, 100);
        p.text(score, 100, 150);
     
        if(score == 0 || score < 0)
        {
            p.setScene(2);
            score = 20;
            madeleine.fixStartX(50);
         madeleine.fixStartY(500);
        }
       
        ifHit();
        
        for(Fire f: fireslist)
        {
            f.display();
        }
        
    }
    public void scoreReset()
    {
        score = score - 1;
    }
    
    public void ifHit()
    {
        for(Fire f: fireslist)
        {
            if(p.dist(madeleine.getStartX(), madeleine.getStartY(), f.getFX(), f.getFY()) < 40)
            {
            scoreReset();
            fireNound.play();
            System.out.println("collisionW");
            a = p.millis()+3000;
            madeleine.cState = 1;
            System.out.println(p.millis());
         
            //p.delay(3000);
           
           
         }
        }
        if(p.millis() >= a)
        {
         madeleine.cState = 0;
         
         System.out.println("timer is working");
        }
    }
    

    public void handleMouseClicked()
    {

    }
    public void handleKeyPressed()
    {
        if(p.key == ' ')
        {
            madeleine.jump();
        }
    }
     public static void main(String[] args)
    {
       
    }
    private ColorIt p;
  
    
    private Character madeleine;
    private PFont font1;
    private ArrayList<Fire> fireslist = new ArrayList<Fire>();
    
}
