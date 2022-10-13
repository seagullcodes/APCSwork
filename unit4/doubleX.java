public class doubleX
{
  public static boolean doubleX(String str)
  {
    int i = str.indexOf("x");
    if(i == -1)
    {
      return false;
    }
    if(i+1>=str.length())
    {
      return false;
    }
    return str.substring(i+1,i+2).equals("x");

  }

  public static String testDoubleX(String str, Boolean expected)
  {
    Boolean result = doubleX(str);
    System.out.println("String input: " + str + "Boolean expected: " + expected + "result: "
    + result);
    if(result == expected)
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
    testDoubleX("asjhsafhsuhx", false);
    testDoubleX("ajfjxx", true);
    testDoubleX("xxalene", true);
    /*System.out.println(doubleX("asjhsafhsuhx")+" should be false");
    System.out.println(doubleX("ajfjxx")+ " should be true");
    System.out.println(doubleX("hello happy x-mas! jk jxx")+ " should be false");*/
  }
}
