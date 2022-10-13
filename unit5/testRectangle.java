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
    Rectangle c1 = new Rectangle(3,4);

    Rectangle c2 = new Rectangle(5,12);


    testRectangle(c1, 12, 14, 5);
    testRectangle(c2, 60, 34, 13);
  }
}
