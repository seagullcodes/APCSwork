import java.util.*;

public class countLuckyArray
{
    public static double functionLucky(ArrayList<Double> luckys)
    {
        double result = 0;


        for(int i = 0; i<luckys.size(); i++)
        {
          double multiple = luckys.get(i)%7;
          double testHAS = luckys.get(i)%10;
          if(testHAS == 7 || multiple == 0)
          {
            result += 1;
          }
          else{
            result += 0;
          }
        }


        return result;
    }

    public static void testLucky(ArrayList<Double> luckys, double expected)
    {
        double end = functionLucky(luckys);

        System.out.print("numbers: ");
        for (double lucky : luckys)
            System.out.print(lucky + " " );

        System.out.println();

        System.out.println("expected: " + expected + " final: " + end);

        if (expected == end)
            System.out.println("PASS");
        else
        {
            System.out.println("FAIL");
          }
    }

    public static void main(String[] args)
    {
      ArrayList<Double> luckys1 = new ArrayList<Double>();
      luckys1.add(107.0);
      luckys1.add(207.0);
      testLucky(luckys1, 2.0);

      ArrayList<Double> luckys2 = new ArrayList<Double>();
      luckys2.add(1.0);
      luckys2.add(2.0);
      luckys2.add(3.0);
      testLucky(luckys2, 0.0);

      ArrayList<Double> luckys3 = new ArrayList<Double>();
      luckys3.add(7.0);
      luckys3.add(17.0);
      luckys3.add(13.0);
      testLucky(luckys3, 2.0);


    }
}
