import processing.core.*;


public class End implements Scenel
{
    public End(PApplet p)
    {
        this.p = p;
   
    }

    public void display()
    {
        p.background(659465);
        p.text("Thank you for playing!", 100, p.height/2);
        p.text("Hit the down key twice to go to start scene, or once to play again!", 100, p.height/2+100);
        
        
    }

    public void handleMouseClicked()
    {

    }
    
    public void handleKeyPressed()
    {
    
    }


    private PApplet p;
}
