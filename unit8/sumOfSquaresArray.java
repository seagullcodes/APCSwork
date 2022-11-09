import java.util.*;

public class sumOfSquaresArray
{
    public static double functionSquares(ArrayList<Integer> numbers)
    {
        double result = 0;

        for(int i = 0; i<numbers.size(); i++)
        {
          int squareA = numbers.get(i)*numbers.get(i);
          result += squareA;
        }
        return result;
    }

    public static void testSquares(ArrayList<Integer> numbers, int expected)
    {
        double end = functionSquares(numbers);

        System.out.print("numbers: ");
        for (int number : numbers)
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

        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        testSquares(numbers1, 14);

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(0);
        testSquares(numbers2, 0);

        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        numbers3.add(2);
        numbers3.add(2);
        numbers3.add(2);
        testSquares(numbers3, 12);
    }
}
