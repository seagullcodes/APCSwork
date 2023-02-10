public class ArrayInitialization
{
   public static void main(String[] args)
   {



       int n = 100;
       int[][] cells = new int[n][n];

       for (int i=0; i<n; i++)
       {
           for (int j=0; j<n; j++)
           {
             if(i == j)
             {
               cells[i][j] = 1;
             }
             else
             {
               cells[i][j] = 0;
             }

           }
       }

       System.out.println("cells:");

       for (int[] row : cells)
       {
           for (int value : row)
           {
               System.out.print(value + " ");
           }
           System.out.println();
       }

       String[][] words = new String[2][2];

       words[0][0] = "Apple";
       words[0][1] = "Popcorn";
       words[1][0] = "iPhone";
      words[1][1] = "Rectangle";

       System.out.println("words:");
       for (String[] row : words)
       {
           for (String word : row)
               System.out.print(word + " ");
           System.out.println();
       }

       int a = 5;
       int[][] cells1 = new int[a][a];

       for (int i=0; i<a; i++)
       {
           for (int j=0; j<a; j++)
           {
             cells1[i][j] = (i+1)*10+(j+1);
           }

       }
       for (int[] row1 : cells1)
       {
           for (int value1 : row1)
           {
               System.out.print(value1 + " ");
           }
           System.out.println();
       }

       int[][] cells2 = new int[6][5];

       for (int i=0; i<6; i++)
       {
           for (int j=0; j<5; j++)
           {
             cells2[i][j] = (i+1);
           }

       }
       for (int[] row2 : cells2)
       {
           for (int value2 : row2)
           {
               System.out.print(value2 + " ");
           }
           System.out.println();
       }

   }
}
