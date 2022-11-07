public class sumOfSquares
{
    public static double functionSquares(double[] numbers)
    {
        double result = 0;

        for(int i = 0; i<numbers.length; i++)
        {
          double squareA = numbers[i]*numbers[i];
          result += squareA;

        }


        return result;
    }

    public static void testSquares(double[] numbers, double expected)
    {
        double end = functionSquares(numbers);

        System.out.print("numbers: ");
        for (double number : numbers)
            System.out.print(number + " " );

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

        double[] numbers0 = new double[3];
        numbers0[0] = 1;
        numbers0[1] = 2;
        numbers0[2] = 3;

        double[] numbers1 = new double[1];
        numbers1[0] = 0;

        double[] numbers2 = new double[3];
        numbers2[0] = 2;
        numbers2[1] = 2;
        numbers2[2] = 2;


        testSquares(numbers0, 14);
        testSquares(numbers1, 0);
        testSquares(numbers2, 12);
    }
}
