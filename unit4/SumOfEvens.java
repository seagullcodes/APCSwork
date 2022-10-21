public class SumOfEvens
{
  public static int sumOfEvens(int n)
  {
    int result = 0;
    int a = 0;
    for(int i = 0; i <= n; i++)
    {
      a = i*2;
      result +=a;
    }
    
    return result;
  }
  public static void main(String[] args)
  {
    System.out.println(sumOfEvens(4));
  }
}
