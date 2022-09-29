public class Attention{

  public static boolean attention(String weewee)
  {
    String hei = weewee.substring(0,9);
    return(hei.equals("Hey, you!"));
  }
  public static void main(String[] args)
  {
    String wee = "Hey, you! Listen to my wonderful";
    System.out.println(attention(wee));
    String name = "You're so cool!";
    System.out.println(attention(name));
    String wow = "Hey, you! I love code!";
    System.out.println(attention(wow));
  }
}
