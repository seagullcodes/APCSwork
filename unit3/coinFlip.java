public class coinFlip{

  public static String coinFlip()
  {
    double a = Math.random();
    if(a > 0.5)
    {
      return "heads";
    }
    else
    {
      return "tails";
    }
  }
  public static void main(String[] args)
  {
    for(int i = 0; i < 20; i++){
    System.out.println(coinFlip());
  }
  }
}
