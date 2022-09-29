public class greetings
{
   public static String greetings(String name)
  {
    return("Hello, " + name + ", how are you?");
  }

  public static void main(String[] args)
  {
    String name = "sarah";
    System.out.println(greetings(name));
    name = "alene";
    System.out.println(greetings(name));
    name = "ramya";
    System.out.println(greetings(name));
  }

}
