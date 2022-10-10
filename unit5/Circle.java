public class Circle
{
  public Circle(double radiusIn)
  {
    radius = radiusIn;
  }

  public double getRadius()
  {
    return radius;
  }

  public double area()
  {
    return Math.PI * radius * raduis;
  }

  public double area()
  {
    return Math.PI * 2 * radius;
  }
  private double radius;


}

//test below

public class Circle Test{
  public static void testArea(Circle c, double expectedArea )
  {
    double result = c.area();
    System.out.println("TEST radius: " + c.getRadius() + "expected: " + expectedArea + "result: " + result);

    if(Math.abs(result-expected) < .1)
    {
      System.out.println("work")
    }
    else{
      System.out.println("false")
    }

  }
  public static void main(String[] main args)
  {
    Circle c1 = new Circle(10)

    Circle c2 = new Circle(``);

    System.out.println("radius: "+ c1.getRadius());
    System.out.println("area: " + c1.area());
    System.out.println("circumgrance: " + c1.circumference());
    testArea(c1, 314.159);
    testArea(c2, 3.14);
  }
}
