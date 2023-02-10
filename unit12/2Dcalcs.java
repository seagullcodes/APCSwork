import java.util.*;
public class calcs
{
    
       
    public static int big(int[][] thing)
    {
    int total = 0;
    int largest = thing[0][0];
    for (int i=0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                item = thing[i][j];
                if(item > largest)
                {
                    largest = item;
                    
                } 
            }
    
        }
        return largest; 
    }
    
        
    public static float fishySum(float[][] thing3)
    {
        float sum = 0;
        for (int i=0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
                sum += thing3[i][j];
            }
    
        }
        return sum;
        
    }
    public static String startA(String[][] thing2)
    {
    total = 0;
    for (int i=0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
              if(thing2[i][j].substring(0,1).equals*("A"))
              {
                  total += 1;
              }
            }
    
        }

    }
    
    public static void main(String[] args)
            {
                
                int[][] thing = new int[2][2];
                recs[0][0] = 2;
                recs[0][1] = 4;
                recs[1][0] = 3;
                recs[1][1] = 5;
                System.out.println(big(thing));
  
        
                String[][] thing2 = new String[2][2];
                recs[0][0] = "Hi";
                recs[0][1] = "Alene";
                recs[1][0] = "Sarah";
                recs[1][1] = "Cosmos";
                System.out.println(startA(thing2));
             
        
                float[][] thing3 = new int[2][2];
                recs[0][0] = 1.1;
                recs[0][1] = 4.4;
                recs[1][0] = 3.3;
                recs[1][1] = 5.5;
                System.out.println(fishySum(thing3));
         
            }
}
                
