
import java.util.*;



public class itemCalc
{
  public static void itemCalc(ArrayList<Item> items)
      {
        for (Item a : items)
        {
          System.out.println(a.getName() + "price" + a.getPrice());
        }
      }
  public static int itemAv(ArrayList<Item> items)
          {
            int totalAverage = 0;
            for (int i=0; i<items.size(); i++)
            {
                Item a = items.get(i);
                totalAverage += a.getPrice();
            }
            return totalAverage/items.size();
          }
public static String itemName(ArrayList<Item> items)
            {
              int mostE = items.get(0).getPrice();
              String a = " ";
              for (int i=1; i<items.size(); i++)
              {
                  if(items.get(i).getPrice()>mostE)
                  {
                    mostE = items.get(i).getPrice();
                    a = items.get(i).getName();
                  }
              }
              return a;
      }

      public static void unitTest(ArrayList<Item> items, int itemAvEpect, String nameExpect)
      {
        float resultitemAv = itemAv(items);
        if(resultitemAv == itemAvEpect)
        {
          System.out.println("AVERAGE WORKING");
        }
        else{
          System.out.println("AVERAGE FALING");
        }
        String resultName = itemName(items);
        if(resultName.equals(nameExpect))
        {
          System.out.println("ITEM NAME WORK");
        }
        else{
          System.out.println("ITEM NAME FAIL");
        }
}

      public static void main(String[] args)
      {
          ArrayList<Item> items = new ArrayList<Item>();

          items.add(new Item("apple", 2));
          items.add(new Item("popcorn", 4));
          items.add(new Item("chocolate", 6));

          unitTest(items, 4, "chocolate");

          ArrayList<Item> madeleiene = new ArrayList<Item>();

          madeleiene.add(new Item("bowie", 1));
          madeleiene.add(new Item("friendDoom", 12));
          madeleiene.add(new Item("duck", 5));

          unitTest(madeleiene, 6, "friendDoom");
}

}
