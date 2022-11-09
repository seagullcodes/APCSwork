import java.util.*;

public class totalZLengthArray
{
    public static double functionLength(ArrayList<String> words)
    {
        double result = 0;

        for(int i = 0; i<words.size(); i++)
        {
          String L = words.get(i).substring(0, 1);
          if(L.equals("z") || L.equals("Z"))
          {
            result+=words.get(i).length();
          }
          else
          {
            result+=0;
          }
        }


        return result;
    }

    public static void testLength(ArrayList<String> words, double expected)
    {
        double end = functionLength(words);

        System.out.print("words: ");
        for (String word : words)
            System.out.print(words + " " );

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

        ArrayList<String> words0 = new ArrayList<String>();
        words0.add("Dr. Kessner");
        words0.add("Dr. Sands");

        ArrayList<String> words1 = new ArrayList<String>();
        words1.add("Zorro");
        words1.add("zero");
        words1.add("zippy");

        testLength(words0, 0);
        testLength(words1, 14);
    }
}
