public class Attention{

  public static boolean attention(String weewee)
  {
    String hei = weewee.substring(0,9);
    return(hei.equals("Hey, you!"));
  }
  public static String testAttention(String weewee, Boolean expected)
  {
    Boolean result = attention(weewee);

    System.out.println("String " + weewee + "expected " + expected + "result " + result);
    if(result == attention(weewee))
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
    String wee = "Hey, you! Listen to my wonderful";
    System.out.println(testAttention(wee, true));
    String name = "You're so cool!";
    System.out.println(testAttention(name, false));
    String wow = "Hey, you! I love code!";
    System.out.println(testAttention(wow, true));
  }
}
