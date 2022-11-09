public class totalZLength
{
    public static double functionLength(String[] words)
    {
        double result = 0;

        for(int i = 0; i<words.length; i++)
        {
          String L = words[i].substring(0, 1);
          if(L.equals("z") || L.equals("Z"))
          {
            result+=words[i].length();
          }
          else
          {
            result+=0;
          }
        }


        return result;
    }

    public static void testLength(String[] words, double expected)
    {
        double end = functionLength(words);

        System.out.print("words: ");
        for (String word : words)
            System.out.print(word + " " );

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

        String[] words0 = new String[2];
        words0[0] = "Dr. Kessner";
        words0[1] = "Dr. Sands";

        String[] words1 = new String[3];
        words1[0] = "Zorro";
        words1[1] = "zero";
        words1[2] = "zippy";

        testLength(words0, 0);
        testLength(words1, 14);
    }
}
