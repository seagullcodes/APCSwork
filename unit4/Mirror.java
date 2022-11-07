public class mirror{


public static String mirror(String n)
{
  String result = "";
  int length = n.length();
  for(int i= 0; i<length; i++)
  {
    if(i%2 == 0)
    {
      String a = n.substring(length-1-i, length-i);
      result = result+a;
    }
    else
    {

    result = result;
  }
  }
  return result;
}

 public static void main(String[] args)
 {
   System.out.println(mirror("alene"));
 }





}
