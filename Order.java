package ooad;

public class Order {
	private int OrderID[];
	private String OrderDate[];
    private String OrderList[];
	
	public Order(int OrderID[], String OrderDate[], String OrderList[]) {
		this.OrderID = OrderID;
		this.OrderDate = OrderDate;
		this.OrderList = OrderList;
	}
	
    public String ConfirmOrder()  { //ยืนยันการสั่งซื้อหนังสือ	
	}

	public String getConfirmOrder() { //ดูรายการการสั่งซื้อหนังสือสำเร็จ
		int IDorder = "";
        String DataOrder = "";
		for(int i=0; i<OrderID.length; i++) {
			if(id == OrderID[i]) {
				IDorder = OrderID[i];
			}
		}
        for(int i=0; i<OrderDate.length; i++) {
			if(id == OrderID[i]) {
				DataOrder = OrderDate[i];
			}
        }
		System.out.println("ID" + IDorder);
        System.out.println("Name" + DataOrder);
	}
	
	public String getOrderDetails()  { //ดูรายละเอียดข้อมูลของรายการคำสั่งซื้อ
		String detailBook = "";
		for(int i=0; i<OrderList.length; i++) {
			if(id == OrderID[i]) {
				detailBook = OrderList[i];
		}
		System.out.println("OrderDetails" + detailBook);
        }
	} 
	
	public String getBookList()  { //ดูรายการหนังสือที่สั่งซื้อ
		int IDorder = "";
        int Listorder = "";
        String DataOrder = "";
		for(int i=0; i<OrderID.length; i++) {
			if(id == OrderID[i]) {
				IDorder = OrderID[i];
			}
		}
        for(int i=0; i<OrderDate.length; i++) {
			if(id == OrderID[i]) {
				DataOrder = OrderDate[i];
			}
        }
        for(int i=0; i<OrderList.length; i++) {
			if(id == OrderID[i]) {
				Listorder = OrderList[i];
			}
        }
		System.out.println("ID" + IDorder);
        System.out.println("Name" + DataOrder);
        System.out.println("Price" + Listorder);
	}

    public void getBookListDetail()  { //ดูข้อมูลของรายการหนังสือที่สั่งซื้อ
	    System.out.println("List" + OrderList);
	}

    public String CancelOrder()  { //ยกเลิกรายการหนังสือที่สั่งซื้อ	
	}

    public String getCancelOrderDetail() { //ดูรายการหนังสือที่ต้องการยกเลิก
		System.out.println("ID" + OrderID);
        System.out.println("Name" + OrderDate);
	}

    public String getOrder()  { //ดูข้อมูลคำสั่งซื้อ
        System.out.println("Order" + OrderList);
		System.out.println("ID" + OrderID);
        System.out.println("Name" + OrderDate);
	}
}

