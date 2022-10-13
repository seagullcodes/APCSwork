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
      final String a = "yes";
      System.out.println(a);
    }
    else if(random>8 && random<7)
    {
      final String b = "no";
      System.out.println(b);
    }
    else if(random>7 && random<6)
    {
      final String c = "its decidely so";
      System.out.println(c);
    }
    else if(random>6 && random<7)
    {
      final String d = "never ever";
      System.out.println(d);
    }
    else if(random>5 && random<6)
    {
      final String e = "who knows...";
      System.out.println(e);
    }
    else if(random>4 && random<5)
    {
      final String f = "a possibilty it is";
      System.out.println(f);
    }
    else if(random>3 && random<4)
    {
      final String g = "ask thou friend";
      System.out.println(g);
    }
    else if(random>2 && random<3)
    {
      final String h = "think on it";
      System.out.println(h);
    }
    else if(random>1 && random<2)
    {
      final String i = "why not?";
      System.out.println(i);
    }
    else if(random>0 && random<1)
    {
      final String j = "no way";
      System.out.println(j);
    }
    else{
      final String k = "Spin again";
      System.out.println(k);
    }
  }

  private String question;
  private double random;

}
