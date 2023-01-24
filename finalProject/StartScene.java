import processing.core.*;


public class StartScene implements Scene
{

    public FearlessScene(PApplet p)
    {
        this.p = p;

    }

    public void display()
    {
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
      public void keyPressed()
      {

      }
      public void mouseClicked()
      {
        if(dist(mouseX, mouseY, width, height) < width && gameState == "START")
        {
          background(255);
          gameState = "START1";
        }
        else if(dist(mouseX, mouseY, width, height) > 0 && gameState == "START1")
        {
          background(255);
          gameState = "START2";
        }
      }

    }

    public void handleKeyPressed()
    {

    }

    private PApplet p;
}
