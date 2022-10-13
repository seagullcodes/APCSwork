public class testPerson
{
  public static void testPerson(Person p, String namea, int petsa)
  {
    String name = p.getName();
    int pets = p.getPets();

    System.out.println("Name: " + name + " Pets: " + pets);
    p.greeting();
  }

    public static void main(String[] args)
    {
        Person p1 = new Person("Sarah", 2);
        testPerson(p1, "Sarah", 2);
        Person p2 = new Person("Alene", 1);
        testPerson(p2, "Alene", 1);
        Person p3 = new Person("Ellie", 0);
        testPerson(p3, "Ellie", 0);
    }
}
