//package ooad;
import java.util.*;

public class BookToGo {
public static void main(String[] args) {
    String CustomerName;
    String CustomerGender;
    String CustomerAddress;
    String CustomerTel;

          Scanner reader = new Scanner(System.in);

          System.out.print("What's your name?: ");
          CustomerName = reader.nextLine();

          System.out.print("Gender: ");
          CustomerGender = reader.nextLine();

          System.out.print("Address: ");
          CustomerAddress = reader.nextLine();

          System.out.print("Tel: ");
          CustomerTel = reader.nextLine();

          System.out.println("Hello " + CustomerName);
          System.out.println("Gener: " + CustomerGender);
          System.out.println("Address: " + CustomerAddress);
          System.out.println("Tel: " + CustomerAddress);
}


}
/*String CustomerName[] = {"Sawaddee Numthai", "Kingmath Sunchai"};
String CustomerTel[] = {"Man", "Woman"};
String CustomerTel[] = {"084-3265845", "081-3452266"};
String CustomerAddress[] = {"53 chana", "51 america"};
Customer customer = new Customer(CustomerName, CustomerTel, CustomerAddress);*/
