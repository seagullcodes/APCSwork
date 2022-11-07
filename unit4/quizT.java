public class quizT
{
    public static int sumofevens(int n)//3
    {
      int result = 0;
      for(int i = 0; i <= n; i++)
      {
        result += i*=2;
      }
    return(result);

  }


  public static int countX(String xx)
   {
     int xlength = xx.length();
     int result = 0;

     for(int i = 0; i<xx.length(); i++)
     {
       String a = xx.substring(i, i+1);
       if(a.equals("x"))
       {
         result+=1;
       }
       else
       {
         result += 0;
       }
     }

     return result;
 }

 public static String mirror(String n)
 {
   String result = "";

   for(int i = 0; i < n.length(); i++)
   {
     String a = n.substring(n.length()-i-1, n.length()-i);
     result = result+a;
   }
   return n+result;
 }
 public static void main(String[] args)
 {
   System.out.println(sumofevens(4));
   System.out.println(countX("xxx"));
   System.out.println(mirror("abc"));
 }

}
