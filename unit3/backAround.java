public class backAround
{
   public static String backAround(String round)
  {
    String newa = round.substring(round.length() - 1);
    return newa + round + newa;
  }
  public static String testBackAround(String round, String expected)
  {

      String result = backAround(round);

      System.out.println("Round" + round + "expected " + expected + "result " + result);
      if(result.equals(expected))
      {
        System.out.println("working!");
      }
      else{
        System.out.println("not working");


    }
    return "";
  }
  public static void main(String[] args)
  {
    String round = "hello";
    System.out.println(testBackAround(round, "ohelloo"));
    round = "I love computer science";
    System.out.println(testBackAround(round, "eI love computer sciencee"));
    round = "mathIsfunandCoolunlessitisIndexDivision";
    System.out.println(testBackAround(round,"nmathIsfunandCoolunlessitisIndexDivisionn"));
  }

}
