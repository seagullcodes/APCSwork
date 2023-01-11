import java.util.*;
public class vehicleTest
{
    public static int wheelCalc(ArrayList<Vehicle>vehicles)
    {
      int a = 0;
      for(int i = 0; i<vehicles.size(); i++)
      {
        int b = vehicles.get(i).wheelCount();
        a += b;
      }
      return a;
    }
    public static ArrayList<String> power(ArrayList<Vehicle>vehicles)
    {
      ArrayList<String> result = new ArrayList<String>();
      for(int i = 0; i<vehicles.size(); i++)
      {
        if(vehicles.get(i).isHumanPowered() == true)
        {
          result.add(vehicles.get(i).name());
        }
      }
      return result;
    }

    public static void testWClac(ArrayList<Vehicle>vehicles, int expected)
    {
      int b = wheelCalc(vehicles);
      if(b == expected)
      {
        System.out.println("WORKING");
      }
      else
      {
        System.out.println("You failed");
      }
    }
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        Car c1 = new Car();
        vehicles.add(c1);

        Motorcycle m1 = new Motorcycle();
        vehicles.add(m1);

        Bicycle b1 = new Bicycle();
        vehicles.add(b1);

        Unicycle u1 = new Unicycle();
        vehicles.add(u1);

        for (Vehicle a : vehicles)
            System.out.println(a.name() + " " + a.wheelCount() +
                    " " + a.isHumanPowered());

        testWClac(vehicles, 9);
        System.out.println(power(vehicles) + "should return: unicycle and bicycle");

    }
}
