package ooad;

public class Food {
	private int foodID[]; //�����������������ͧ���� attribute 145
	private String foodName[]; //�����������������ͧ���� attribute "������з�ҹ�������"
	private double foodPrice[]; //�Ҥ��������������ͧ���� attribute 80.00
	private String foodCategory[]; //��Ǵ�������������ͧ���� attribute "����", "�Ѻ����", "����ͧ����"
	private String foodSize[]; //size �ͧ�����  attribute "������", "�����"
	
	public Food(int foodID[], String foodName[], double foodPrice[], String foodCategory[], String foodSize[]) {
		this.foodID = foodID;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodCategory = foodCategory;
		this.foodSize = foodSize;
	}
	
	public int getFoodID(int id) { //�ʴ������������������ͧ����
		int idFood = 0;
		for(int i=0; i<foodID.length; i++) {
			if(id == foodID[i]) {
				idFood = foodID[i];
			}
		}
		return idFood;
	}
	
	public String getFoodName(int id) { //�ʴ������������������ͧ����
		String nameFood = "";
		for(int i=0; i<foodID.length; i++) {
			if(id == foodID[i]) {
				nameFood = foodName[i];
			}
		}
		return nameFood;
	}
	
	public double getFoodPrice(int id) { //�ʴ��Ҥ��������������ͧ����
		double priceFood = 0.0;
		for(int i=0; i<foodID.length; i++) {
			if(id == foodID[i]) {
				priceFood = foodPrice[i];
			}
		}
		return priceFood;
	}
	
	public String getDetailFood(String listIdFood, int orderNumber) { //�ʴ���������´������������ͧ����
		String detailFood = "";
		for(int i=0;i<listIdFood.length();i++) {
			char IdFood = listIdFood.charAt(i);
			int idFood = Integer.parseInt(String.valueOf(IdFood));
			detailFood += " No." + getFoodID(idFood) + " " + getFoodName(idFood) + "   �ӹǹ " + orderNumber + "   �Ҥ� " + getFoodPrice(idFood) + " �ҷ\n";
		}
		return detailFood;
	}
}
