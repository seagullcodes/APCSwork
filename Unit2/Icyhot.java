public class Icyhot
{
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
  }
}
