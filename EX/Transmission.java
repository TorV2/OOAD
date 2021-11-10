package ooad;

public class Transmission {
	private int transmissionID; //���ʡ�������¡���ѵشԺ attribute 13
	private String transmissionDate; //�ѹ����ѹ�֡��úѹ�֡�ѵ�شԺ  attribute "24/08/2563"
	private String transmissionTime; //���Һѹ�֡��úѹ�֡�ѵ�شԺ  attribute "12:16"
	private int transmissionNameEmployee; //���ʾ�ѡ�ҹ��������ѵ�شԺ  "����Դ� �������"
	private String transmissionNameIngredient; //�����ѵ�شԺ�����ͧ����  "������"
	private Employee employee; //��ѡ�ҹ
	private Ingredient ingredient; //�ѵ�شԺ

	public Transmission(int transmissionID, String transmissionDate, String transmissionTime,Ingredient ingredient, Employee employee) {
		this.transmissionID = transmissionID;
		this.transmissionDate = transmissionDate;
		this.transmissionTime = transmissionTime;
		this.ingredient = ingredient;
		this.employee = employee;
	}

	public void setTransmission(String transmissionNameIngredientID, int transmissionNameEmployeeID) { //�Ѻ��������¡���ѵ�شԺ�����ͧ����������ʾ�ѡ�ҹ��������ѵ�شԺ
		this.transmissionNameIngredient = transmissionNameIngredientID;
		this.transmissionNameEmployee = transmissionNameEmployeeID;
	}

	public String getDetailTransmission() { //��������´�ѵ�شԺ�����ͧ����
		return "Transmission: " + transmissionID + "\Transmission: " + transmissionDate + "   Transmission: " + transmissionTime + " Transmission." + "\n -----Transmission---- \n" + ingredient.getDetailIngredient(transmissionNameIngredient) +"-----" + "\nTransmission: " + employee.getEmployeeName(transmissionNameEmployee);
	}
}
