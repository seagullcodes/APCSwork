public class Fibonacci
{
  public static void main(String[] args)
  {
    int a = 1;
    int b = 1;
    int c = a+b;
    System.out.println(a);
    System.out.println(b);

    for(int i = 0; i <20; i++)
    {
      System.out.println(c);
      a = b;
      b = c;
      c = a+b;

    }
      /*System.out.println(a);
      a = b+c;
      System.out.println(b);
      b = a+c;
      System.out.println(c);
      c = a+b;
      System.out.println(a);
      a = b+c;
      System.out.println(b);
      b = a+c;
      System.out.println(c);
      c = a+b;
      */




  }
}
