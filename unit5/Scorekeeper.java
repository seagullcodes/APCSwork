public class Scorekeeper
{
  private int score;
  public Scorekeeper()
  {
    score = 0;
  }
  public void addNormal()
  {
    score+= 100;
  }
  public void addBonus()
  {
    score+= 1000;
  }
  public int total()
  {
    return score;
  }
}
