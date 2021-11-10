package ooad;

public class Ingredient {
	private int ingredientID[]; //�����ѵ�شԺ attribute 275
	private String ingredientName[]; //�����ѵ�شԺ attribute "������"
	
	public Ingredient(int ingredientID[], String ingredientName[]) {
		this.ingredientID = ingredientID;
		this.ingredientName = ingredientName;
	}
	
	public int getIngredientID(int id) { //�ʴ������ѵ�شԺ
		int idingredient = 0;
		for(int i=0; i<ingredientID.length; i++) {
			if(id == ingredientID[i]) {
				idingredient = ingredientID[i];
			}
		}
		return idingredient;
	}
	
	public String getIngredientName(int id) { //�ʴ������ѵ�شԺ
		String nameIngredient = "";
		for(int i=0; i<ingredientID.length; i++) {
			if(id == ingredientID[i]) {
				nameIngredient = ingredientName[i];
			}
		}
		return nameIngredient;
	}
	
	public String getDetailIngredient(String listIdIngredient) { //�ʴ���������´�ѵ�شԺ
		String detailIngredient = "";
		for(int i=0;i<listIdIngredient.length();i++) {
			char IdIngredient = listIdIngredient.charAt(i);
			int idIngredient = Integer.parseInt(String.valueOf(IdIngredient));
			detailIngredient += " No." + getIngredientID(idIngredient) + " " + getIngredientName(idIngredient) + "\n";
		}
		return detailIngredient;
	}
}
