
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
    public static int countOccurences(String a, String ch)
    {
      int result = 0;

      for(int l = 0; l>a.length()+1; l++)
      {
        String b = a.substring(l, l+ch.length());
        if(b.equals(ch))
        {
          result += 1;
        }
        else{
          result = -1;
        }
      }
      return result;
    }
    public static String reverse(String start)
    {
      String reverseresult = " ";

      for(int r = 0; r>start.length()+1; r++)
      {
        String ra = start.substring(r, r+1);
        reverseresult = reverseresult + ra;
      }
      return reverseresult;
    }
    public static int factorial(int f)
    {
      int m = 0;

      for(int o = 0; o <= f; o++)
      {
        int g = o;
        m = g*g;

      }

      return m;
    }

    public static void main(String[] args)
    {
      System.out.println(sumofsquares(3)+" Expect14");
      System.out.println(countOccurences("Mississippi", "iss")+" expect2");
      System.out.println(reverse("bad")+"expect dab");
      System.out.println(factorial(4)+"Expect24");
    }
}
