package ooad;
public class ShoppingCart extends Books {
  private int Quantity[];

  public ShoppingCart(int Quantity[]) {
		this.Quantity = Quantity;

	}

  public void addBookCart(String ) {

}

  public String BookName() { return BookName; }
  public String Quantity() { return Quantity; }
  public String BookPrice() { return BookPrice; }

  public void getShoppingCart() {
    System.out.println("------ShoppingCart------");
    System.out.println("Name: " + BookName);
    System.out.println("Quantity: " + Quantity + " เล่ม");
    System.out.println("Price: " + BookPrice + "บาท");
    System.out.println("Cancer: ");
    System.out.println("PayBook: " );
}
}
