public class CountX
{
  public static int countX(String a)
  {
    int result = 0;
    int xl = a.length();
    for(int i =0; i<xl; i++)
    {

      if(a.substring(i,i+1).equals("x"))
      {
        result += 1;
      }
      else{
        result +=0;
      }
    }
    return result;
  }
  public static void main(String[] args)
  {
    System.out.println(countX("xxxx"));
  }
}
