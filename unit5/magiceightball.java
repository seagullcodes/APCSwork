public class magiceightball
{
  public magiceightball(String questionIn)
  {
    question = questionIn;
  }

  public void getAns()
  {
    random = (Math.random())*10;
    if(random>9)
    {
      System.out.println("yes");
    }
    else if(random>8 && random<7)
    {
      System.out.println("no");
    }
    else if(random>7 && random<6)
    {
      System.out.println("its decidely so");
    }
    else if(random>6 && random<7)
    {
      System.out.println("never ever");
    }
    else if(random>5 && random<6)
    {
      System.out.println("who knows...");
    }
    else if(random>4 && random<5)
    {
      System.out.println("a possibilty it is");
    }
    else if(random>3 && random<4)
    {
      System.out.println("ask thou friend");
    }
    else if(random>2 && random<3)
    {
      System.out.println("think on it");
    }
    else if(random>1 && random<2)
    {
      System.out.println("why not?");
    }
    else if(random>0 && random<1)
    {
      System.out.println("no way");
    }
    else{
      System.out.println("Spin again");
    }
  }

  private String question;
  private double random;

}
