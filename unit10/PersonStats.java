
import java.util.*;



public class PersonStats
{

  public static float petAv(ArrayList<Person> persons)
          {
            float totalAverageP = 0;
            for (int i=0; i<persons.size(); i++)
            {
                System.out.println(persons.get(i).getPets());
                Person a = persons.get(i);
                totalAverageP += a.getPets();
            }
            return totalAverageP / persons.size();
          }
public static String mostPets(ArrayList<Person> persons)
            {
              int most = persons.get(0).getPets();
              String a = " ";
              for (int i=1; i<persons.size(); i++)
              {
                  if(persons.get(i).getPets()>most)
                  {
                    most = persons.get(i).getPets();
                    a = persons.get(i).getName();
                    System.out.println("HERENN" + a);
                  }
              }
              return a;
  }

public static ArrayList<String> lotsPets(ArrayList<Person> persons)
{
  ArrayList<String> result = new ArrayList<String>();
  for(int i = 0; i<persons.size(); i++)
  {
    if(persons.get(i).getPets()>=2)
    {
      String name = persons.get(i).getName();
      result.add(name);
    }
  }
  return result;
}
public static void unitTest(ArrayList<Person> persons, float petAvExpect, String nameExpect)
{
  float resultPetAv = petAv(persons);
  if(resultPetAv == petAvExpect)
  {
    System.out.println("AVERAGE WORKING");
  }
  else{
    System.out.println("AVERAGE FALING");
  }
  String resultmostPets = mostPets(persons);
  if(resultmostPets.equals(nameExpect))
  {
    System.out.println("MOST PETS WORKING");
  }
  else{
    System.out.println("MOST PET FAILING");
  }

}
  public static void main(String[] args)
      {

          ArrayList<Person> persons = new ArrayList<Person>();

          persons.add(new Person("sarah", 1));
          persons.add(new Person("mad", 4));
          persons.add(new Person("ellie", 1));

          unitTest(persons, 2, "mad");
          System.out.println(petAv(persons));
          System.out.println(mostPets(persons));
          System.out.println(" here is the name of those who have at least two pets " + lotsPets(persons));

      }

}
