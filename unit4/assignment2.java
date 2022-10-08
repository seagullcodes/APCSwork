
public class assignment2
{
    public static int sumofsquares(int b)//3
    {
      int result = 0;
      for(int i = 0; i<=b; i++)
      {
        int n=i;
        n = n*n;
        result = result+n;
      }
      return result;
    }
    public static boolean testSumofsquares(int b, int expected)
    {
      int result = (sumofsquares(b));
      System.out.println("Int " + b + "expected " + expected + "result " + result);
      if(result == expected)
      {
        return true;
      }
      else{
        return false;
      }

    }
   public static int countOccurences(String a, String ch)
    {
      int h = ch.length();
      int d = 0;

      for(int i = 0; i+h<=a.length(); i++)
      {
        String sub = a.substring(0+i,h+i);
        if(sub.equals(ch))
        {
          d+=1;
        }
        else
        {
          d += 0;
        }
      }
      return d;
  }
  public static boolean testCountOccurences(String a, String ch, int expected)
  {
    int result = (countOccurences(a, ch));
    System.out.println("String " + a + "expected " + expected + "result " + result);
    if(result == expected)
    {
      return true;
    }
    else{
      return false;
    }

  }
    public static String reverse(String start)
    {
      String reverseresult = " ";

      for(int r = 0; r<start.length(); r++)
      {
        String ra = start.substring(start.length()-1-r, start.length()-r);
        reverseresult = reverseresult + ra;
      }
      return reverseresult;
    }
    public static String testreverse(String start, String expected)
    {
      String result = reverse(start);

      System.out.println("String " + start + "expected " + expected + "result " + result);
      if(result.equals(expected))
      {
        System.out.println("working!");
      }
      else{
        System.out.println("not working");
      }

      return "";

    }

    public static int factorial(int f)
    {
      int m = 1;

      for(int i = 1; i <= f; i++)
      {
        m = i*m;

      }

      return m;
    }
    public static String testFactorial(int f, int expected)
    {
      int result = (factorial(f));
      System.out.println("Int " + f + "expected " + expected + "result " + result);
      if(result == expected)
      {
        return "working!";
      }
      else{
        return "not working!";
      }

    }

    public static void main(String[] args)
    {
      System.out.println(testSumofsquares(1,1));
      System.out.println(testSumofsquares(2,5));
      System.out.println(testSumofsquares(3,14));
      System.out.println(testSumofsquares(4,30));
      System.out.println(testSumofsquares(5,55));
      System.out.println(testCountOccurences("Mississippi", "iss", 2));
      System.out.println(testCountOccurences("banananana", "an", 4));
      System.out.println(testCountOccurences("sarah", "a", 2));
      System.out.println(testCountOccurences("yoyoyoyohejyo", "yo", 5));
      System.out.println(testreverse("bad", " dab"));
      System.out.println(testreverse("hi", " ih"));
      System.out.println(testreverse("sarah", " haras"));
      System.out.println(testreverse("Hello, world!", " !dlrow ,olleH"));
      System.out.println(testreverse("tacocat", " tacocat"));
      System.out.print(testFactorial(0,1));
      System.out.print(testFactorial(1,1));
      System.out.print(testFactorial(2,2));
      System.out.print(testFactorial(3,6));
      System.out.print(testFactorial(4,24));
      System.out.print(testFactorial(5,120));
      System.out.print(testFactorial(6,720));
      System.out.print(testFactorial(7,5040));
    }
}
