import processing.core.*;
import java.util.*;


public class Game implements Scenel
{
   
    public int score = 3;
 
    private int a = 0;
   
    
    public Game(ColorIt p)
    {
        this.p = p;
        madeleine = new Character(p, 40, 40, p.width/2, 500, 0xff341FEB);
    
       
        for(int i = 0; i<10; i++)
        {
            fireslist.add(new Fire(p, ((int)p.random(1100, 1300)), ((int)p.random(480,520))));
        }
    }

    public void display()
    {
        p.background(0xffeba16a);
        madeleine.display();
     
        if(score == -90)
        {
            p.setScene(2);
        }
       
        ifHit();
        
        for(Fire f: fireslist)
        {
            f.display();
        }
        
    }
    
    public void ifHit()
    {
        for(Fire f: fireslist)
        {
            if(p.dist(madeleine.getStartX(), madeleine.getStartY(), f.getFX(), f.getFY()) < 40)
            {
            System.out.println("collisionW");
            a = p.millis()+3000;
            madeleine.cState = 1;
            System.out.println(p.millis());
         
            //p.delay(3000);
            if(p.millis() == a)
            {
                madeleine.cState = 0;
                System.out.println("timer is working");
                
            }
            score--;
         }
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
  
    private ArrayList<Fire> fireslist = new ArrayList<Fire>();
    
}
