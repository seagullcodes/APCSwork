public class Icyhot
{
  public static String testIcyhot(int temp1, int temp2, boolean expected){
  boolean result = temp(temp1, temp2);
  System.out.println("temp. 1: " + temp1 + "temp. 2:" + temp2 + expected);

  if(result == expected)
  {
    return "happy";
  }
  else{
    return "sad";
}
}

public static boolean temp(int temp1, int temp2)
 {
   if(temp1 < 0 && temp2>100 || temp1 > 100 & temp2 < 100)
   {
     return true;
   }
   else
   {
     return false;
   }
}
  public static void main(String[] args)
  {
    System.out.println(temp(72,2));
    System.out.println(temp(-2, 110));
    System.out.println(testIcyhot(-5, 240, true));
    System.out.println(testIcyhot(50, -4, false));
  }
}
