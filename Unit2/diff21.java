public class diff21
{


    public static int diff21(int n)
    {
        if(n<=21)
        {
          return 21-n;
        }
        else
        {
          return ( n - 21 ) * 2;
        }

    }

    public static String testdiff21(int n, int expected)
    {
        int result = diff21(n);

        System.out.print("n" + n + " expected: " + expected + " result: " + result);

        if (result == expected)
          return("working");
        else
          return("not working");
    }

    public static void main(String[] args)
    {
        System.out.println(testdiff21(6,15));
        System.out.println(testdiff21(22, 2));
        System.out.println(testdiff21(69,96));
    }
}
