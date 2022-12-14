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
        if(salePrice < (0.75*orginalPrice))
        {
          return true;
        }

        else{
          return false;
        }
    }

    public static void main(String[] args)
    {
        testgoodDeal(20, 16, false);
        testgoodDeal(20, 12, true);
        testgoodDeal(20, 19, false);
    }
}
