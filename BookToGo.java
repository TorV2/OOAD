//package ooad;
import java.util.*;

public class BookToGo {
public static void main(String[] args) {
    int BookName[] = {"Including Math Problems", "Practice Math Skills", "Accelerated Reaction", }

    int CustomerID[] = {1,2};
    String CustomerName[] = {"Sawaddee Numthai", "Kingmath Sunchai", "Cartoon Physics", "Stardust", "The more you like, The better", ""};
    String CustomerGender[] = {"Man", "Woman"};
    String CustomerTel[] = {"086-1458751", "098-3214568"};
    String CustomerAddress[] = {"532 Ban Chien, Han Kha, Chainat 17130", "99 Tha Pho, Mueang Phitsanulok, Phitsanulok 65000 "};
    Customer customer = new Customer(CustomerID, CustomerName,CustomerGender, CustomerTel, CustomerAddress);
}


}

