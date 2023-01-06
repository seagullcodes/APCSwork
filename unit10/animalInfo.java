import java.util.*;

public class AnimalInfo
{
  public static float averageLegCount(ArrayList<Animal> animals)
  {
    float total = 0;
    for(int i = 0; i<animals.size(); i++)
    {
      total += animals.get(i).getLegCount();
    }
    return total / animals.size();
  }

  public static void main(String[] args)
  {
    ArrayList<Animal> animals = new ArrayList<Animal>();

    animals.add(new Animal("Gizmo", "cat", 4));
    animals.add(new Animal("Sarah", "human", 2));
    animals.add(new Animal("Gadget", "cat", 4));
    animals.add(new Animal("Bob", "centipede", 100));

    for(Animal a : animals)
    {
      System.out.println(a.getName() + "is a " +a.getType());
    }
    System.out.println(averageLegCount(a.ge))
  }
}
