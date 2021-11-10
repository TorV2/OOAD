package ooad;

public class Food {
	private int foodID[]; //รหัสอาหารหรือเครื่องดื่ม attribute 145
	private String foodName[]; //ชื่ออาหารหรือเครื่องดื่ม attribute "ต้มยำสะท้านบู๊ลิ้ม"
	private double foodPrice[]; //ราคาอาหารหรือเครื่องดื่ม attribute 80.00
	private String foodCategory[]; //หมวดอาหารหรือเครื่องดื่ม attribute "ข้าว", "กับข้าว", "เครื่องดื่ม"
	private String foodSize[]; //size ของอาหาร  attribute "ธรรมดา", "พิเศษ"
	
	public Food(int foodID[], String foodName[], double foodPrice[], String foodCategory[], String foodSize[]) {
		this.foodID = foodID;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodCategory = foodCategory;
		this.foodSize = foodSize;
	}
	
	public int getFoodID(int id) { //แสดงรหัสอาหารหรือเครื่องดื่ม
		int idFood = 0;
		for(int i=0; i<foodID.length; i++) {
			if(id == foodID[i]) {
				idFood = foodID[i];
			}
		}
		return idFood;
	}
	
	public String getFoodName(int id) { //แสดงชื่ออาหารหรือเครื่องดื่ม
		String nameFood = "";
		for(int i=0; i<foodID.length; i++) {
			if(id == foodID[i]) {
				nameFood = foodName[i];
			}
		}
		return nameFood;
	}
	
	public double getFoodPrice(int id) { //แสดงราคาอาหารหรือเครื่องดื่ม
		double priceFood = 0.0;
		for(int i=0; i<foodID.length; i++) {
			if(id == foodID[i]) {
				priceFood = foodPrice[i];
			}
		}
		return priceFood;
	}
	
	public String getDetailFood(String listIdFood, int orderNumber) { //แสดงรายละเอียดอาหารและเครื่องดื่ม
		String detailFood = "";
		for(int i=0;i<listIdFood.length();i++) {
			char IdFood = listIdFood.charAt(i);
			int idFood = Integer.parseInt(String.valueOf(IdFood));
			detailFood += " No." + getFoodID(idFood) + " " + getFoodName(idFood) + "   จำนวน " + orderNumber + "   ราคา " + getFoodPrice(idFood) + " บาท\n";
		}
		return detailFood;
	}
}
