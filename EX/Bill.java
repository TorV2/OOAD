package ooad;

public class Bill {
	private int billID; //���ʺ�� attribute 16346552
	private int orderID; //���������� attribute 01
	private String billTable; //��з���١��ҹ�� attribute "17"
	private String billDate; //�ѹ����͡������Ѻ�Թ attribute "17/08/2563"
	private String billTime; //���ҷ���͡������Ѻ�Թ attribute "21:25"
	private String billMenu; //��¡���������������ͧ��������١������  attribute "����������Ѻ"
	private int billNumber; //�ӹǹ�������������ͧ���� attribute 1
	private int billTakeOrder; //���;�ѡ�ҹ����Ѻ������  attribute "�ظ��Թ�  ���Ƿͧ"
	private int billCheckBill; //���ʾ�ѡ�ҹ����示��  attribute "����Դ�  ������"
	private double billTotle; //�Ҥ�����������ͧ��¡���������������ͧ��������١������  attribute 100.00
	private Order order; //������
	private Employee employee; //��ѡ�ҹ
	private Food food; //�����
	
	public Bill(int billID, String billDate, String billTime, Order order, Employee employee, Food food) {
		this.billID = billID;
		this.billDate = billDate;
		this.billTime = billTime;
		this.order = order;
		this.employee = employee;
		this.food = food;
	}
	
	public void setBill(int id) { //�Ѻ���ʾ�ѡ�ҹ����示��
		this.billTable = order.getTable();
		this.billTakeOrder = order.getNameTakeOrder();
		this.orderID = order.getOrderID();
		this.billMenu = order.getOrderFood();
		this.billNumber = order.getFoodNumber();
		this.billCheckBill = id;
	}
	
	public int getBillID() { //�ʴ����ʺ��
		return billID;
	}
	
	public void CalculatePriceTotle() { //�ӹǳ�ҤҢͧ�������������ͧ��������١������
		for(int i=0;i<billMenu.length();i++) {
			char IdFood = billMenu.charAt(i);
			int idFood = Integer.parseInt(String.valueOf(IdFood));
			billTotle = billTotle + (food.getFoodPrice(idFood) * billNumber);
		}
	}
	
	public double getPriceTotle() { //�ʴ��ҤҢͧ�������������ͧ��������������١������
		return billTotle;
	}

	public String ShowsDetailBill() { //�ʴ���������´��Ť���������������ͧ����
		return "sacsac:" + billID + "   ascascasc: " + orderID + "   ascscac: " + billTable + "\nascsacsac: "+ employee.getEmployeeName(billTakeOrder) + "\nascascsac: "+ employee.getEmployeeName(billCheckBill) +"\nascsac: "+ billDate +"\nascsacs: "+ billTime + " y." +"\n-------------------- ascascascsac --------------------\n"+ food.getDetailFood(billMenu, billNumber) + "\n-----------------------------------------------------\n" + " ascascascac " + getPriceTotle() + " n";
	}
}
