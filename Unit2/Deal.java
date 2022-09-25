public class Deal
{
    public static void testgoodDeal(double orginalPrice, double salePrice,
                                         boolean expected)
    {
        boolean result = goodDeal(orginalPrice, salePrice);

        System.out.print("orginal price: " + orginalPrice + "sale price:  " + salePrice +
                " expected: " + expected + " result: " + result);

        if (result == expected)
            System.out.println("correct");
        else
            System.out.println("wrong");
    }

    public static boolean goodDeal(double orginalPrice, double salePrice)
    {
        if(salePrice > (3/4*orginalPrice))
        {
          return false;
        }

        else{
          return true;
        }
    }

    public static void main(String[] args)
    {
        testgoodDeal(20, 1, true);
        testgoodDeal(20, 10, true);
        testgoodDeal(20, 19, false);
    }
}
