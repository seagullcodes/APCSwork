import processing.core.*;


public class Start implements Scenel
{

    public Start(PApplet p)
    {
        
        this.p = p;
        
    }

    public void display()
    {
    font1 = p.createFont("fonty.ttf", 30);
        p.background(0xffe0a5e6);
       p.textFont(font1);
       p.text("Welcome to Jumper",100, p.height/2);
        p.text("Press the UP key to move to the play screen!", 100, p.height/2+100);
        
      
        
        
        
    }

    public void handleMouseClicked()
    {
    
    }
    
    public void handleKeyR()
    {
      
    }
    public void handleKeyPressed()
    {
    
    }
     public static void main(String[] args)
    {
       
    }

    private PApplet p;
    private PFont font1;
    
}
