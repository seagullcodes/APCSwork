import java.util.*;


public class transformList
{
    public static String stringReverse(String a)
    {
      String reverseresult = " ";

      for(int r = 0; r<a.length(); r++)
      {
        String reverseEnd = a.substring(a.length()-1-r, a.length()-r);
        reverseresult = reverseresult + reverseEnd;
      }
      return reverseresult;
    }
    public static String stringAll(String[] words)
    {
      String result = " ";
      for (String word : words)
      {
        String a = word;
        String addIt = new String(stringReverse(a));
        result = result + addIt;
      }
      return result;
    }


    public static void main(String[] args)
    {
        String[] words1 = {"racecar", "tacocat", "izzi"};

        System.out.println(words1.length);
        for (String word1 : words1)
            System.out.println(word1);

        System.out.println();
        System.out.println("reverse words: " + stringAll(words1));

        System.out.println();

        String[] words2 = {"abcd", "xyz"};

        System.out.println(words2.length);
        for (String word2 : words2)
            System.out.println(word2);

        System.out.println();
        System.out.println("reverse words: " + stringAll(words2));

        System.out.println();

        String[] words3 = {"1234", "5678"};

        System.out.println(words3.length);
        for (String word3 : words3)
            System.out.println(word3);

        System.out.println();
        System.out.println("reverse words: " + stringAll(words3));

        System.out.println();

    }
}
