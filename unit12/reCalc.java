import java.util.*;
public class reCalc
{
    
       
    public static int big(int[][] thing)
    {
    int item = 0;
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
    public static int startA(String[][] thing2)
    {
    int total = 0;
    for (int i=0; i<2; i++)
        {
            for(int j = 0; j<2; j++)
            {
              if(thing2[i][j].substring(0,1).equals("A"))
              {
                  total = total+1;
              }
            }
    
        }
    return total;

    }
    
    public static void main(String[] args)
            {
                
                int[][] thing = new int[2][2];
                thing[0][0] = 2;
                thing[0][1] = 4;
                thing[1][0] = 3;
                thing[1][1] = 5;
                System.out.println(big(thing));
  
        
                String[][] thing2 = new String[2][2];
                thing2[0][0] = "Hi";
                thing2[0][1] = "Alene";
                thing2[1][0] = "Sarah";
                thing2[1][1] = "Cosmos";
                System.out.println(startA(thing2));
             
        
                float[][] thing3 = new float[2][2];
                thing3[0][0] = 1;
                thing3[0][1] = 4;
                thing3[1][0] = 3;
                thing3[1][1] = 5;
                System.out.println(fishySum(thing3));
         
            }
}
                
 