public class stringExplode{
  public static String stringExplode(String a)
  {
    String result = "";
    for(int i = 0; i<a.length(); i++)
    {
      String l = a.substring(0, i+1);
      result = result + l;
    }
    return result;
  }
  public static String testStringExplode(String a, String expected)
  {
    String result = stringExplode(a);
    System.out.println("String input: " + a + "String expected: " + expected + "String result: " + result);
    if(result.equals(expected))
    {
      System.out.println("PASS");
    }
    else{
      System.out.println("FAIL");
    }
    return " ";
  }
  public static void main(String[] args)
  {
    testStringExplode("abc", "aababc");
    testStringExplode("dog", "ddodog");
    testStringExplode("harp", "hhaharharp");

  }
}
