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


  public static void main(String[] args)
  {
    System.out.println(doubleX("asjhsafhsuhx")+" should be false");
    System.out.println(doubleX("ajfjxx")+ " should be true");
    System.out.println(doubleX("hello happy x-mas! jk jxx")+ " should be false");
  }
}
