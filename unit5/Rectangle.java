public class Rectangle
{
  public Rectangle(double baseIn, double widthIn )
  {
    base = baseIn;
    width = widthIn;

  }

  public double getBase()
  {
    return base;
  }
  public double getWidth()
  {
    return width;
  }

  public double area()
  {
    return base*width;
  }
  public double perimter()
  {
    return (base+width)*2;
  }

  public double diagonal()
  {
    return Math.sqrt((base*base)+(width*width));
  }
  private double width;
  private double base;


}
