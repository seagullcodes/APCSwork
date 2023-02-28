
import processing.core.*;
import java.util.*;
//import processing.sound.*;


public class finalDisplay extends PApplet
{
 
 

  private PImage DoorOne;
  private PImage HalfOpen;
  private PImage Open;
  private ArrayList<Scene> scenes;
  private int current = 0;
    public void settings()
    {
        fullScreen();
        scenes = new ArrayList<Scene>();
        //scenes.add(new StartScene(this));
      //  scenes.add(new MenuScene(this));
        scenes.add(new DebutScene(this));
        scenes.add(new FearlessScene(this));
        scenes.add(new SpeakNowScene(this));
        scenes.add(new RedScene(this));
        scenes.add(new Ninteen89Scene(this));     
       scenes.add(new ReputationScene(this));
       scenes.add(new LoverScene(this));
      scenes.add(new FolkloreScene(this));
      scenes.add(new EvermoreScene(this));
        
    }

    public void setup()
    {
      //gameState = "START";

   
    }


    public void draw()
    {

        scenes.get(current).display();
        //if(gameState == "START")
        /*{
          homeScreen();

        }
        if(gameState == "START1")
        {
          homeScreen1();

        }
        if(gameState == "START2")
        {
          homeScreen2();

        }*/



    }
/*
    public void homeScreen()
    {

      background(255);
      DoorOne = loadImage("DoorOne.png");
            DoorOne.resize(600,600);
      background(DoorOne);
      text("tap the door to open it", width/2, height/2);
    }
    public void homeScreen1()
    {
      background(255);
      HalfOpen = loadImage("HalfOpen.png");
          HalfOpen.resize(600,600);
      background(HalfOpen);

    }
    public void homeScreen2()
    {
      background(255);
      Open = loadImage("Open.png");
            Open.resize(600,600);
      background(Open);
      fill(0);
      text("welcome to lover house!", width/2, height/2);
    }
    */
    public void keyPressed()
    {
        if(keyCode == UP)
        {
            current++;
            System.out.println("HI");
        }
        else if(keyCode == DOWN)
        {
            current--;
        }
        else if(keyCode == 'a')
        {
            current++;
        }
        
    }
    
    public void mouseClicked()
    {
       if(dist(mouseX, mouseY, width, height) < width)
      {
        currenta++;
        System.out.println("HI");
      } 
    /* if(dist(mouseX, mouseY, width, height) < width && gameState == "START")
      {
        background(255);
        gameState = "START1";
      }
      else if(dist(mouseX, mouseY, width, height) > 0 && gameState == "START1")
      {
        background(255);
        gameState = "START2";
      }
      */

    }


    public static void main(String[] args)
    {
        PApplet.main("finalDisplay");
    }

}
