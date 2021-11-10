package ooad;
public class Delivery {

  private int OrderNumber[];
  private String OrderDeadline[];
  private String NameSender[];
  private String NameRecipient[];

  public Delivery(int OrderNumber[], String OrderDeadline[], String NameSender[], String NameRecipient[] ) {
		this.OrderNumber = OrderNumber;
    this.OrderDeadline = OrderDeadline;
    this.NameSender = NameSender;
    this.NameRecipient = NameRecipient;
	}

  public String getDeliveryStatus() {
    System.out.println("------Delivery Status------");
    //System.out.println(": " + );
    //System.out.println(": " +  );
    //System.out.println(": " + );
    return ;
}
}
