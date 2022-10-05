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
  public static void main(String[] args)
  {
    System.out.println(stringExplode("abc") + " expect aababc");
    System.out.println(stringExplode("dog") + " expect ddodog");
    System.out.println(stringExplode("harp") + " expect hhaharharp");
  }
}
