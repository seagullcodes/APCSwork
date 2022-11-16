import java.util.*;


public class maxValue
{
    public static Double findMax(ArrayList<Double> numbers)
    {
        double valueHigh = numbers.get(0);

        for (Double number : numbers)
        {
            if (number > valueHigh)
                valueHigh = number;
        }

        return valueHigh;
    }

    public static void main(String[] args)
    {


        ArrayList<Double> numbers1 = new ArrayList<Double>();
        numbers1.add(1.0);
        numbers1.add(2.0);
        numbers1.add(3.0);
        System.out.println(findMax(numbers1));

        System.out.println(numbers1.size());
        for (Double number1 : numbers1)
            System.out.println(number1);

        System.out.println();
        System.out.println("maxium value: " + findMax(numbers1));

        ArrayList<Double> numbers2 = new ArrayList<Double>();
        numbers2.add(0.0);
        numbers2.add(-35.0);
        numbers2.add(90.1);
        System.out.println(findMax(numbers2));

        System.out.println(numbers2.size());
        for (Double number2 : numbers2)
            System.out.println(number2);

        System.out.println();
        System.out.println("maxium value: " + findMax(numbers2));

        ArrayList<Double> numbers3 = new ArrayList<Double>();
        numbers3.add(1.0);
        numbers3.add(2.1);
        numbers3.add(5.3);
        System.out.println(findMax(numbers3));

        System.out.println(numbers3.size());
        for (Double number3 : numbers3)
            System.out.println(number3);

        System.out.println();
        System.out.println("maxium value: " + findMax(numbers3));
    }
}
