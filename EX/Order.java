package ooad;

public class Order {
	private int orderID; //���������� attribute 01
	private String orderType; //����������������� attribute "��觨ҡ����ҹ", "��觨ҡ�ҧ��ҹ"
	private String orderStatus; //ʶҹ������� attribute "���ѧ�������"
	private String orderTable; //��з���١��ҹ�� attribute "17"
	private String orderDate; //�ѹ���ѹ�֡������ attribute "17/08/2563"
	private String orderTime; //���ҷ��ѹ�֡������ attribute "21:25"
	private int orderTakeOrder; //���ʾ�ѡ�ҹ����Ѻ������ attribute "�ظ��Թ�  ���Ƿͧ"
	private String orderFood; //��¡���������������ͧ��������������١������  attribute "������з�ҹ�������(������)  �ӹǹ: 1  �Ҥ������: 80.0 �ҷ"
	private int orderNumber; //�ӹǹ�������������ͧ���� attribute 2
	private Customer customer; //�١���
	private Employee employee; //��ѡ�ҹ
	private Food food; //�����
	
	public Order(int orderID, String orderType, String orderStatus, String orderDate, String orderTime, int orderNumber, Customer customer,Employee employee, Food food) {
		this.orderID = orderID;
		this.orderType = orderType;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderNumber = orderNumber;
		this.customer = customer;
		this.employee = employee;
		this.food = food;
	}
	public void setOrder(String orderFood, String orderTable, int idTakeOrder) { //�Ѻ�������������������ͧ��������١������, ��з���١��ҹ��, ���ʾ�ѡ�ҹ����Ѻ������
		this.orderFood = orderFood;
		this.orderTable = orderTable;
		this.orderTakeOrder = idTakeOrder;
	}
	
	public int getOrderID() { //�ʴ�����������
		return orderID;
	}
	
	public String getTable() { //�ʴ���з���١��ҹ��
		return orderTable;
	}
	
	public int getNameTakeOrder() { //�ʴ����ʾ�ѡ�ҹ����Ѻ������ 
		return orderTakeOrder;
	}
	
	public String getOrderStatus() { //�ʴ�ʶҹС�÷�����âͧ������
		return orderStatus;
	}
	
	public String getOrderFood() { //�ʴ��������������ͧ��������١������
		return orderFood;
	}
	
	public int getFoodNumber() { //�ʴ��ӹǹ�������������ͧ��������١������
		return orderNumber;
	}
	
	public String getShowOrderDetails() { //�ʴ���������´���������١������
		return "Order: "+ orderID +"\nOrder: "+ orderStatus +"  Order: "+ orderTable + "\nOrder: " + orderType + "\nOrder: "+ orderDate +"  Order:  "+ orderTime + " y." +"\nOrder: "+ employee.getEmployeeName(orderTakeOrder) +"\n-------------------- Order --------------------\n"+ food.getDetailFood(orderFood, orderNumber);
	}
}
