public class Student extends Person
{
  public Student(String name)
  {
    super(name); //calls super class constructor
  }
  public int add(int a, int b)
  {
    return a+b;
  }
  public String hello()
  {
    return "what is up";
  }
}
