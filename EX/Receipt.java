package ooad;

public class Receipt extends Bill {
	
	private int receiptID; //��������� attribute 16346552
	private int receiptPrintReceipt; //���ʾ�ѡ�ҹ����͡�����  attribute "����Դ�  ������"
	private double receiptMoney; //�ӹǹ�Թ����Ѻ�Ҩҡ�١���  attribute 500.00
	private double receipChange; //�ӹǹ�Թ�͹����١���  attribute 400.00
	private Employee employee; //��ѡ�ҹ
	private Bill bill; //���
	
	public Receipt(int billID, String billDate, String billTime, Order order, Employee employee, Food food, Bill bill) {
		super(billID, billDate, billTime, order, employee, food);
		this.employee = employee;
		this.bill = bill;
	}
	
	public void setReceipt(double receiptMoney, int receiptPrintReceipt) { //�Ѻ�ӹǹ�Թ����Ѻ�Ҩҡ�١���������ʾ�ѡ�ҹ����͡�����
		this.receiptID = super.getBillID();
		this.receiptMoney = receiptMoney;
		this.receiptPrintReceipt = receiptPrintReceipt;
	}
	
	public void CalculateChange() { //�ӹǳ�Թ�͹����١���
		receipChange = receiptMoney - bill.getPriceTotle();
	}
	
	public double getChange() { //�ʴ��ӹǹ�Թ�͹����١���
		return receipChange;
	}
	
	public String getDetailReceipt() { //�ʴ���������´����稤���������������ͧ����
		return "\n                   �Ѻ�Թ��: " + receiptMoney + " �ҷ" + "\n                   �Թ�͹: " + getChange() + " �ҷ" + "\n��ѡ�ҹ�͡�����: " + employee.getEmployeeName(receiptPrintReceipt);
	}
}
