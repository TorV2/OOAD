package ooad;
public class Books {

  private String BookName[];
  private String Category[];
  private int BookPrice[];
  private String BestSellBook[];

  public Books(String BookName[], String Category[], int BookPrice[], String CustomerTel[] ) {
		this.BookName = BookName;
    this.Category = Category;
    this.BookPrice = BookPrice;
		this.BestSellBook = BestSellBook;
	}

  public void setBookName(String BookName) {
    this.BookName = BookName;
  }

  public String searchBook(String BookName) {
    return BookName;
  }

  public void getBookDetail() {
    System.out.println("------Book Detail------");
    System.out.println("Name: " + BookName);
    System.out.println("Category: " + Category );
    System.out.println("Price: " + BookPrice + "บาท");

  }

  public void addBook(String BookName, String Category, int BookPrice ) {

  }

  public void editBook(String BookName, String Category, int BookPrice ) {

  }

  public String deleteBook() {

  }

  public String PayBook() {

  }

  public void setBookDetail(String BookName, String Category, int BookPrice ) {

  }

  public void getBestSellBook() {
    System.out.println("------Best Sell Book------");
    System.out.println("Name: " + BookName);

  }

}
