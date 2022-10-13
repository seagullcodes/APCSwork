public class testmagiceightball
{
  public static void testmagiceightball(magiceightball b, String importantquestion)
  {
    System.out.println("Your extreamly demanding question: " + importantquestion);
    b.getAns();
  }

    public static void main(String[] args)
    {
        magiceightball b1 = new magiceightball("Will i fail apcs?");
        testmagiceightball(b1, "Will i fail apcs?");
        magiceightball b2 = new magiceightball("will cosmos go to worlds?");
        testmagiceightball(b2, "will cosmos go to worlds?");
        magiceightball b3 = new magiceightball("will alene still be my friend?");
        testmagiceightball(b3, "will alene still be my friend?");
    }
}
