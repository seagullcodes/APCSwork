public class testScorekeeper
{
  public static void testScorekeeper(Scorekeeper a, int normal, int bonus, int expectedScore)
  {

    for(int i = 0; i < normal; i++)
    {
      a.addNormal();
    }
    for(int i = 0; i < bonus; i++)
    {
      a.addBonus();
    }
    int result = a.total();
    System.out.println("TEST result: " + result + "Expected: " + expectedScore);

    if(result == expectedScore)
    {
      System.out.println("PASS  WOOHOO");
    }
    else{
      System.out.println("FAIL ");
    }

  }
  public static void main(String[] args)
  {
    Scorekeeper a5 = new Scorekeeper();
    Scorekeeper a4 = new Scorekeeper();
    Scorekeeper a3 = new Scorekeeper();

    testScorekeeper(a5, 1, 1, 1100);
    testScorekeeper(a4, 4, 8, 8400);
    testScorekeeper(a3, 4, 6, 6400);
  }
}
