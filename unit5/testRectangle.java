public class testRectangle
{
  public static void testRectangle(Rectangle c, double expectedArea, double expectedPerimter, double expectedDiagonal)
  {
    double resultArea = c.area();
    double resultPerimter = c.perimter();
    double resultDiagonal = c.diagonal();
    System.out.println("TEST width" + c.getWidth() + "base" + c.getBase() + "expected area: " + expectedArea + "expectedPerimter"
    + resultPerimter + "expectedArea" + resultArea + "resultDiagonal " + resultDiagonal);

    if(expectedArea == resultArea)
    {
      System.out.println("AREA PASS");
    }
    else{
      System.out.println("AREA FALSE");
    }
    if(expectedPerimter == resultPerimter)
    {
      System.out.println("PERIMTER PASS");
    }
    else{
      System.out.println("PERIMTER FALSE");
    }
    if(expectedDiagonal == resultDiagonal)
    {
      System.out.println("DIAGONAL PASS");
    }
    else{
      System.out.println("DIAGONAL FALSE");
    }

  }

  public static void main(String[] args)
  {
    Rectangle c1 = new Rectangle(10,10);

    Rectangle c2 = new Rectangle(2,2);


    testRectangle(c1, 100, 40, 14.1421356237);
    testRectangle(c2, 4, 8, 2.82842712475);
  }
}
