import java.util.*;


public class correctScore
{


    public static ArrayList<Integer> filterScore(ArrayList<Integer> numbers)
    {
        // filter: return a new list with the ones we want

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int number : numbers)
        {
            if(number>90)
            {
              result.add(number);
            }

        }

        return result;
    }

    public static void main(String[] args)
    {
      ArrayList<Integer> numbers1 = new ArrayList<Integer>();
      numbers1.add(51);
      numbers1.add(53);
      numbers1.add(52);
      numbers1.add(100);



        for (Integer number1 : numbers1)
            System.out.println(number1);

        System.out.println();
        System.out.println("Good scores: ");
        System.out.println(filterScore(numbers1));
        System.out.println();

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(92);
        numbers2.add(98);
        numbers2.add(99);
        numbers2.add(89);

        for (Integer number2 : numbers2)
              System.out.println(number2);

          System.out.println();
          System.out.println("Good scores: ");
          System.out.println(filterScore(numbers2));
          System.out.println();



    }
}
