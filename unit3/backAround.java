public class backAround
{
   public static String backAround(String round)
  {
    String newa = round.substring(round.length() - 1);
    return newa + round + newa;
  }
  public static void main(String[] args)
  {
    String round = "hello";
    System.out.println(backAround(round));
    round = "I love computer science";
    System.out.println(backAround(round));
    round = "mathIsfunandCoolunlessitisIndexDivision";
    System.out.println(backAround(round));
  }

}
