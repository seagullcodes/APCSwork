public class greetings
{
   public static String greetings(String name)
  {
    return("Hello, " + name + ", how are you?");
  }

  public static String testGreetings(String name, String expected)
  {
    String result = greetings(name);

    System.out.println("Name " + name + "expected " + expected + "result " + result);
    if(result.equals(expected))
    {
      System.out.println("working!");
    }
    else{
      System.out.println("not working");
    }

    return "";

  }

  public static void main(String[] args)
  {
    String name = "sarah";
    System.out.println(testGreetings(name, "Hello, sarah, how are you?"));
    name = "alene";
    System.out.println(testGreetings(name, "Hello, alene, how are you?" ));
    name = "ramya";
    System.out.println(testGreetings(name, "Hello, ramya, how are you?"));
  }

}
