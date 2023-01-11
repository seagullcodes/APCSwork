import java.util.*;
public class AnimalCalculator
{
    public static void info(ArrayList<Animal>animals)
    {
      for (Animal a : animals)
      {
        System.out.println(a.getName());
        System.out.println(a.getFurry());
        System.out.println(a.getLegCount());
      }
    }
    public static int legAv(ArrayList<Animal>animals)
    {
      int total = 0;
      for(int i = 0; i<animals.size(); i++)
      {
        int l = animals.get(i).getLegCount();
        total += l;
      }
      return total/animals.size();
    }
    public static Animal fewLeg(ArrayList<Animal>animals)
    {
      int a = animals.get(0).getLegCount();
      int b = 0;

      for(int i = 0; i<animals.size(); i++)
      {
        int l = animals.get(i).getLegCount();
        if(l<a)
        {

          b = i;
        }
      }
      return animals.get(b);
    }

    public static void unitTests(ArrayList<Animal>animals, int expectLegAv, String expectName)
    {
      int LegAvFinal = legAv(animals);
      if(LegAvFinal == expectLegAv)
      {
        System.out.println("AVERAGE WORKING");
      }
      else
      {
        System.out.println("FAILURE AVERAGE");
      }
      String fewLegFinal = fewLeg(animals).getName();
      System.out.println(fewLegFinal);
        if(fewLegFinal.equals(expectName))
        {
          System.out.println("FEW LEG WORKING");
        }
        else
        {
          System.out.println("FEW LEG FAIL");
        }

    }
    public static void main(String[] args)
    {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Dog d1 = new Dog();
        animals.add(d1);
        Rachel r1 = new Rachel();
        animals.add(r1);
        Sister s1 = new Sister();
        animals.add(s1);
        Bug b1 = new Bug();
        animals.add(b1);


        info(animals);
        unitTests(animals,9,"Sister");
    }

}
