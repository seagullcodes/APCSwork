
public class Vampire
{
    public static void testisVampire(float hour, boolean awake,
                                         boolean expected)
    {
        boolean result = isVampire(hour, awake);

        System.out.print("awake: " + awake + " hour: " + hour +
                " expected: " + expected + " result: " + result);

        if (result == expected)
            System.out.println("correct");
        else
            System.out.println("wrong");
    }

    public static boolean isVampire(float hour, boolean awake)
    {
        if((hour < 6 || hour > 22) && awake == true)
        {
          return true;
        }
        else if((hour >= 6 && hour <= 22) && awake == false)
        {
          return true;
        }
        else{
          return false;
        }
    }

    public static void main(String[] args)
    {
        testisVampire(5, false, false);
        testisVampire(5, true, true);
        testisVampire(20, false, true);
    }
}
