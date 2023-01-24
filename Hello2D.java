public class Hello2D
{
  public static void main(String[] args)
  {
    int[] values = {1,3,5,7};
    for(int value : values)
    {
      System.out.println(value+" ");
    }
    int[][] numbers = {{1, 3, 5}, {2, 4}, {9}};
    System.out.println(numbers[0][2]);

    for(int[] row : numbers)
    {
      for(int value : row)
      {
        System.out.println(value + " ");
      }
    }


    //for loop my beloved

  for(int i = 0; i<numbers.length; i++)
  {
    for(int i = 0; i<numbers[i].length(); i++)
    {
      System.out.println(numbers[i][i] + " ");
    }
    System.out.println();
    }
  }


  String[][] names = new String[0][0];
  names[0][0] = "Alene";

  int[][] cells = new int[5][5];

  for(int i = 0; i<5; i++)
  {
    for(int j = 0; j<5; j++)
    {
      if(i%2==0 && j%2!= 0)
      {}
    }
  }
}
