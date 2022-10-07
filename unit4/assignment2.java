
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
  /*  public static int countOccurences(String a, String ch)
    {
      int result = 0;
      int diff = 0;

      if(a.length() % 3 == 0){
        diff = 0;
      } else if(a.length() % 3 == 1){
        diff = 1;
      } else if(a.length() % 3 == 2){
        diff = 2;
      }

      for(int l = 0; l>a.length()-diff; l++)
      {
        String b = a.substring(l, l+3);
        if(b.equals(ch))
        {

      }
      return result;
    }
  }*/
    public static String reverse(String start)
    {
      String reverseresult = " ";

      for(int r = 0; r>start.length(); r++)
      {
        String ra = start.substring(start.length()-1-r, start.length()-r);
        reverseresult = reverseresult + ra;
      }
      return reverseresult;
    }

    public static int factorial(int f)
    {
      int m = 1;

      for(int i = 1; i <= f+1; i++)
      {
        m = i*m;

      }

      return m;
    }

    public static void main(String[] args)
    {
      System.out.println(sumofsquares(3)+" Expect14");
      //System.out.println(countOccurences("Mississippi", "iss")+" expect2");
      String start = "bad";
      System.out.println(reverse(start)+"expect dab");
      System.out.println(factorial(4)+"Expect24");
    }
}
