public class Item
{
  public Item(String name, int price)
  {
    this.name = name;
    this.price = price;

  }
  public String getName() {return name;}
  public int getPrice() {return price;}

  private String name;
  private int price;
}
