package ooad;

public class Receipt extends Bill {
	
	private int receiptID; //รหัสใบเสร็จ attribute 16346552
	private int receiptPrintReceipt; //รหัสพนักงานที่ออกใบเสร็จ  attribute "ศุภธิดา  สายแก้ว"
	private double receiptMoney; //จำนวนเงินที่รับมาจากลูกค้า  attribute 500.00
	private double receipChange; //จำนวนเงินทอนให้ลูกค้า  attribute 400.00
	private Employee employee; //พนักงาน
	private Bill bill; //บิล
	
	public Receipt(int billID, String billDate, String billTime, Order order, Employee employee, Food food, Bill bill) {
		super(billID, billDate, billTime, order, employee, food);
		this.employee = employee;
		this.bill = bill;
	}
	
	public void setReceipt(double receiptMoney, int receiptPrintReceipt) { //รับจำนวนเงินที่รับมาจากลูกค้าและรหัสพนักงานที่ออกใบเสร็จ
		this.receiptID = super.getBillID();
		this.receiptMoney = receiptMoney;
		this.receiptPrintReceipt = receiptPrintReceipt;
	}
	
	public void CalculateChange() { //คำนวณเงินทอนให้ลูกค้า
		receipChange = receiptMoney - bill.getPriceTotle();
	}
	
	public double getChange() { //แสดงจำนวนเงินทอนให้ลูกค้า
		return receipChange;
	}
	
	public String getDetailReceipt() { //แสดงรายละเอียดใบเสร็จค่าอาหารหรือเครื่องดื่ม
		return "\n                   รับเงินมา: " + receiptMoney + " บาท" + "\n                   เงินทอน: " + getChange() + " บาท" + "\nพนักงานออกใบเสร็จ: " + employee.getEmployeeName(receiptPrintReceipt);
	}
}
