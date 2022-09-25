public class diff21
{
    public static void testdiff21(int n, number expected)
    {
        int result = diff21(int n);

        System.out.print("n" + n + " expected: " + expected + " result: " + result);

        if (result == expected)
            System.out.println("working");
        else
            System.out.println("not working");
    }

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

    public static void main(String[] args)
    {
        testdiff21(6,15);
        testdiff21(22, 2);
        testdiff21(54, 62);                
    }
}
