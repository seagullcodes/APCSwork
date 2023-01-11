public class Rectangle implements Shape
{
  public class Rectangle()
  {
    this.w = w;
    this.h = h;
  }
  public int sideCount()
  {
    return 4;
  }
  public double perimeter()
  {
    return 2*w + 2*h;
  }
  private double w;
  private double h;
}
