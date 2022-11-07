import java.util.*;

public class practice
{
  public static void main(String[] args)
  {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Gizmo");
    names.add("Gadget");
    names.add("Gadget");

    System.out.println("names: " + names.size());


    System.out.println("first: " + names.get(0));

    for(int i = 0; i<names.size(); i++)
    {
      String name = names.get(i);
      System.out.print(name + " ");
    }

    System.out.println();

    for(String name : names)
      System.out.print(name + " ");
    System.out.println();

    System.out.println("removing item 1");
    names.remove(1);

    System.out.println(names.size());
    for(String name : names)
    {
      System.out.print(name + " ");

    }

    }
}
