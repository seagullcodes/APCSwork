import java.util.*;

public class fibSeq
{
  public static ArrayList<Integer> fib(int n)
  {
    ArrayList<Integer> result = new ArrayList<Integer>();
    int a = 1;
    int b = 1;
    int c = a+b;
    result.add(a);
    result.add(b);



  for(int i = 0; i<n-1; i++)
  {
    result.add(c);
    a = b;
    b = c;
    c = a+b;

  }

  return result;
}
  public static void main(String[] args)
  {

    System.out.println(fib(2));
    System.out.println(fib(3));
    System.out.println(fib(4));
    System.out.println(fib(5));
  }
}
