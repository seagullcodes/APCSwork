public class mixStart{
  public static boolean mixStart(String wee)
  {
    if(wee.length()<3)
    {
      return false;
    }
    String two = wee.substring(1,3);

    if(two.equals("ix"))
    {
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[] args)
  {
    String wee = "mix";
    System.out.println(wee + mixStart(wee));
    wee = "pixe sticks";
    System.out.println(wee + mixStart(wee));
    wee = "live";
    System.out.println(mixStart(wee));
  }
}
