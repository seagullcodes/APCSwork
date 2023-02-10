import java.util.*;
public class RectangleCalc
{
    
       
    public static double avg(Rectangle[][] recs)
    {
    double total = 0.0;
    for (int i=0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
            total+=(recs[i][j].getHeight() +recs[i][j].getWidth());
            }
            
        }
        return total; 
    }
    public static Rectangle lArea(Rectangle[][] recs)
    {
    int aB = 0;
    int cD = 0;
    double pArea = 0;
    double largest = (recs[0][0].getHeight()*recs[0][0].getWidth());
    for (int i=0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                pArea =(recs[i][j].getHeight()*recs[i][j].getWidth());
               // System.out.println(pArea);
                if(pArea > largest)
                {
                    largest = pArea;
                    aB = i;
                    cD = j;
                    
                } 
            }
    
        }
        return recs[aB][cD]; 
    }
            public static void main(String[] args)
            {
                
                Rectangle[][] recs = new Rectangle[2][2];
                recs[0][0] = new Rectangle("uno", 2.0, 2.0);
                recs[0][1] = new Rectangle("dos", 1.0, 2.0);
                recs[1][0] = new Rectangle("tres", 4.0, 4.0);
                recs[1][1] = new Rectangle("quat", 1.0, 2.0);
                System.out.println(avg(recs));
                System.out.println(lArea(recs).getName());
            }
}
                
