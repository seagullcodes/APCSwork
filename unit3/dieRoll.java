public class dieRoll{

  public static int diceRoll()
  {
    double a = Math.floor(Math.random() * 6);
    if(a < 1){
      a = 1;
    }

    return(int)a;
  }
  public static void main(String[] args)
  {
    for(int i = 0; i <20; i++)
    {
      System.out.println(diceRoll());
    }
  }
}
