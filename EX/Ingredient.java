package ooad;

public class Ingredient {
	private int ingredientID[]; //รหัสวัตถุดิบ attribute 275
	private String ingredientName[]; //ชื่อวัตถุดิบ attribute "หัวหอม"
	
	public Ingredient(int ingredientID[], String ingredientName[]) {
		this.ingredientID = ingredientID;
		this.ingredientName = ingredientName;
	}
	
	public int getIngredientID(int id) { //แสดงรหัสวัตถุดิบ
		int idingredient = 0;
		for(int i=0; i<ingredientID.length; i++) {
			if(id == ingredientID[i]) {
				idingredient = ingredientID[i];
			}
		}
		return idingredient;
	}
	
	public String getIngredientName(int id) { //แสดงชื่อวัตถุดิบ
		String nameIngredient = "";
		for(int i=0; i<ingredientID.length; i++) {
			if(id == ingredientID[i]) {
				nameIngredient = ingredientName[i];
			}
		}
		return nameIngredient;
	}
	
	public String getDetailIngredient(String listIdIngredient) { //แสดงรายละเอียดวัตถุดิบ
		String detailIngredient = "";
		for(int i=0;i<listIdIngredient.length();i++) {
			char IdIngredient = listIdIngredient.charAt(i);
			int idIngredient = Integer.parseInt(String.valueOf(IdIngredient));
			detailIngredient += " No." + getIngredientID(idIngredient) + " " + getIngredientName(idIngredient) + "\n";
		}
		return detailIngredient;
	}
}
