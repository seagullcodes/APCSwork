public class Student
{
  public Student(String name, int favNumber)
  {
    this.name = name;
    this.favNumber = favNumber;
  }
  public String getName()
  {
    return name;
  }
  public int getFavNumber()
  {
    return favNumber;
  }

  private String name;
  private int favNumber;
}
