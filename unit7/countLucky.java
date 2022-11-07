public class countLucky
{
    public static double functionLucky(double[] luckys)
    {
        double result = 0;


        for(int i = 0; i<luckys.length; i++)
        {
          double multiple = luckys[i]%7;
          double testHAS = luckys[i]%10;
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

    public static void testLucky(double[] luckys, double expected)
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

        double[] luckys0 = new double[2];
        luckys0[0] = 107;
        luckys0[1] = 207;

        double[] luckys1 = new double[3];
        luckys1[0] = 1;
        luckys1[1] = 2;
        luckys1[2] = 3;

        double[] luckys2 = new double[3];
        luckys2[0] = 7;
        luckys2[1] = 17;
        luckys2[2] = 13;

        testLucky(luckys0, 2);
        testLucky(luckys1, 0);
        testLucky(luckys2, 2);
    }
}
