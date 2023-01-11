
public class Animal 
{
  public Animal(String name, int legCount, boolean furry)
  {
    this.name = name;
    this.furry = furry;
    this.legCount = legCount;
  }
  public int getLegCount()
  {
    return legCount;
  }
  public String getName()
  {
    return name;
  }
  public boolean getFurry()
  {
    return furry;
  }


  private String name;
  private boolean furry;
  private int legCount;

}
