public class Person
{

    public Person(String nameIn, int petsIn)
    {
        name = nameIn;
        pets = petsIn;
    }
    public String getName()
    {
      return name;
    }
    public int getPets()
    {
      return pets;
    }
    private String name;
    private int pets;
    public void greeting()
    {
      //String a = "Hello, my name is " + name + " and I have " + pets + " pets.";
      //“Hello, my name is (name) and I have (numberOfPets) pets.”
      //return String a;
    
      System.out.println("Hello, my name is " + name + " and I have " + pets + " pets.");
    }

}
