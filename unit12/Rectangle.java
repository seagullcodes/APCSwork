
public class Rectangle
{
  public Rectangle(String name, double width, double height)
  {
    this.name = name;
    this.width = width;
    this.height = height;
  }
  public String getName()
  {
    return name;
  }
  public double getWidth()
  {
    return width;
  }
  public double getHeight()
  {
    return height;
  }

  private String name;
  private double width;
  private double height;
}
