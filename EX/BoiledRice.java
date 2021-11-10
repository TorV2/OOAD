package ooad;
import java.util.*;

public class BoiledRice {

	public static void main(String[] args) {
		int customerID[] = {1,2};
		String customerName[] = {"dgfgfd  dgdfg", "dfgdfgdg dgfdfgdfg"};
		String customerTel[] = {"084-3265845", "081-3452266"}; 
		String customerAddress[] = {"301/85 dfgdfgdfgdfgdfgdfg", "301/85 dfgdfgdfgdgdgdfgdfgd"};
		Customer customer = new Customer(customerID, customerName, customerTel, customerAddress);
		
		int foodID[] = {1,2,3,4,5,6,7,8,9}; 
		String foodName[] = {"ddfgdfgdfgdfd", "dfgdfg", "dfgfdgdf", "dfgdfgdfg", "dfgdfgdfgfg", "dfgdfgdfg", "dfgdfgdfgd", "dfgdfgdfg", "dfgdfgdfg"};
		double foodPrice[] = {250.00, 80.00, 100.00, 35.00, 80.00, 120.00, 220.00, 80.00, 35.00}; 
		String foodCategory[] = {"dgfdgdf", "dgdfgd", "dfgdfgdf", "dfgdfgdfg", "dfgdfgdfg", "dgfgdf", "dfgdfgdfg", "erertgre", "fbzgser"}; 
		String foodSize[] = {"dfgfg", "dfgdfg", "dfgdfgf", "dfgdfg", "dfgdfg", "dfgdf", "dfgdf", "dsgd", "sdfsdf"}; 
		Food food = new Food(foodID, foodName, foodPrice, foodCategory, foodSize);
		
		int employeeID[] = {1,2,3,4,5,6}; 
		String employeeName[] = {"sdfsdf sdfsdf", "sdf  sdfsdf", "sdfsdf sdfdsf", "sdfsdf sdfsdf", "sdfsdfsdf sdfdsfsdfds", "-"}; 
		String employeeTel[] = {"088-5633587", "087-3658255", "091-8586727", "096-4558636", "087-5633365", "-"}; 
		String employeePosition[] = {"sdfsdfdsf", "sdfsdfdsfsdf", "sdfdsfdf", "sdfdsfsdfs", "dsfsdfdsfsdf", "-"};
		Employee employee = new Employee(employeeID, employeeName, employeeTel, employeePosition);
		
		int ingredientID[] = {1,2,3,4,5}; 
		String ingredientName[] = {"dsfsdgrg", "fdgdfgfg", "fdgfg", "fgfg", "fdgfgdf"}; 
		Ingredient ingredient = new Ingredient(ingredientID, ingredientName);
		
		Order order = new Order(1, "dfgfgdfg", "dfgdfgfdgdf", "17/08/2563", "17:25", 1, customer, employee, food);
		
		Bill bill = new Bill(16346552, "17/08/2563", "21:25", order, employee, food);
		
		Receipt receipt = new Receipt(16346552,"17/08/2563", "22:34", order, employee, food, bill);
		
		Transmission transmission = new Transmission(13, "24/08/2563", "23:16", ingredient, employee);
		
		Scanner sc = new Scanner(System.in);
		int select;
		do {
			System.out.println("******************** dfgdfgfdgdfgd ********************");
			System.out.println("   (1) dfgdfgfd");
			System.out.println("   (2) dfgfdgdfgfdgdfg");
			System.out.println("   (0) dfgdfgdfgdfg");
			System.out.print("dfgdfgdfgdfg: ");
			select = sc.nextInt();
			if(select == 1) {
				System.out.print("dfgfdg ID dfgdfg: ");
				int id = sc.nextInt();
				if(customer.getCustomerID(id) == true) {
					int selectMenu;
					String listIdFood = ""; //�������������������ͧ��������١������
					String table = "-"; //��з���١��ҹ��
					do {
						System.out.println("\n******************** dgfdgfdgfdg ********************");
						System.out.println("dgfdgfdg " + customer.getCustomerName(id));
						System.out.println("   (1) dfgfdgdfg");
						System.out.println("   (2) dfgdfgdfg");
						System.out.println("   (3) dfgdgfdgfdg");
						System.out.println("   (0) fdbdfbfdb");
						System.out.print("fdbfdbfdgg: ");
						selectMenu = sc.nextInt();
						if(selectMenu == 1) {
							String selectFood;
								do {
									System.out.println("========== dfgdfgfdgdfgdfg ==========");
									System.out.println("1. dfgdfgdfgfd (dfgdfgfdg)    250.00 ");
									System.out.println("2. hkguk (gukgukugk)    80.00 ");
									System.out.println("3. yikhkhukhu (uluiliuluil)    100.00 ");
									System.out.println("4. sdfsdfsdf (fdgfdgdfgfdg)    35.00 ");
									System.out.println("5. sdf (dfgfdgfdg)    80.00 ");
									System.out.println("6. dsfsdfdfsd (dfggfdgfdg)    120.00 ");
									System.out.println("7. regrgdgg (dfgdgdfgdf)    220.00 ");
									System.out.println("8. fdgfdgfdgdfg (dfgfdgfdgfdg)    80.00 ");
									System.out.println("9. dfgfdgfdgfdg (dfgfdgfdgfdgfg)    35.00 ");
									System.out.println("===============================================" + "\n");
									System.out.println("dfgfdgdfgfd (fdgdfg y gdfgfdg,  n dfgdfgdfg)");
									System.out.print("dfgdfgdfgddfg: ");
									selectFood = sc.nextLine();
									if(selectFood.equals("y")) {
										String confirm;
										do {
											System.out.println("========================================");
											System.out.println("           dfgfdgdfgfdgdfg          ");
											System.out.println("========================================");
											for(int i=0;i<listIdFood.length();i++) {
												char IdFood = listIdFood.charAt(i);
												int idFood = Integer.parseInt(String.valueOf(IdFood));
												System.out.println(" No." + food.getFoodID(idFood) + " " + food.getFoodName(idFood) + "   fgf " + food.getFoodPrice(idFood) + " fgfg");
											}
											System.out.println("========================================" + "\n");
											System.out.println("hfghgfh y ncvncvnvcn,  n bfghgbcvn");
											confirm = sc.nextLine();
											if(confirm.equals("y")) {
												order.setOrder(listIdFood, table, 6);
												System.out.println("******************** dfgfdgdfgfdgdf ********************");
												System.out.println(order.getShowOrderDetails());
												System.out.println("------------------- fgdgfgdfgdfgdfg -------------------");
												System.out.println(customer.getDetailCustomer(id));
												System.out.println("*******************************************************");
												break;
											}
										} while(!confirm.equals("n"));
										break;
									}
									else {
										listIdFood += selectFood;
									}
								} while(!selectFood.equals("n"));
						}
						else if(selectMenu == 2) {
							System.out.println("==================== dfgdfgdfgdf ====================");
							System.out.println(order.getShowOrderDetails());
							System.out.println("------------------- dfgfdgdfgdfgdfgfdg -------------------");
							System.out.println(customer.getDetailCustomer(id));
							System.out.println("==================================================" + "\n");
						}
						else if(selectMenu == 3) {
							System.out.println("============== dfgdfgfdgdfgdfgdfg ==============");
							System.out.println(customer.getDetailCustomer(id));
							System.out.println("=============================================" + "\n");
						}
					} while(selectMenu != 0);
				}
			}
			else if(select == 2) {
				System.out.print("dfgfdgdfg ID fgdgf: ");
				int id = sc.nextInt();
				if(employee.getEmployeeID(id) == true) {
					if(employee.getEmployeePosition(id).equals("dfgdfgdfgdfgdfgdfg")) {
						int selectMenu;
						String listIdFood = ""; //�������������������ͧ��������١������
						String table; //��з���١��ҹ��
						String billPrint = ""; //�纺�Ť���������������ͧ����
						do {
							System.out.println("\n******************** dfgdfgdfgdf ********************");
							System.out.println("dfgdfgdfg " + employee.getEmployeeName(id));
							System.out.println("dfgdfgfgd: " + employee.getEmployeePosition(id));
							System.out.println("   (1) dfgdfgdfgdfg");
							System.out.println("   (2) dfgfdgdfgdfgdf");
							System.out.println("   (3) dfgfdgdfg");
							System.out.println("   (4) dfgfgdfgdfgdfgdfg");
							System.out.println("   (5) cbcvbvbcvbcvb");
							System.out.println("   (0) dfgdfgfhbredbdfb");
							System.out.print("fgdfbfdbfdbdfb: ");
							selectMenu = sc.nextInt();
							if(selectMenu == 1) {
								String selectFood;
									do {
										System.out.println("========== fdgbdfbdfbdfbfdbd ==========");
										System.out.println("1. dfbfdbdfbfdbdfb (fdbdfbfdbfdb)    250.00 ");
										System.out.println("2. ergergerg (ergreg)    80.00 ");
										System.out.println("3. ergregreg (egergerg)    100.00 ");
										System.out.println("4. regreg (regergre)    35.00 ");
										System.out.println("5. ergergreger (rgergergr)    80.00 ");
										System.out.println("6. regregregrg (rngfbgf)    120.00 ");
										System.out.println("7. trgregerger (ergregergreg)    220.00 ");
										System.out.println("8. ergergregerg (ergergrett)    80.00 ");
										System.out.println("9. hththth (ththththth)    35.00 ");
										System.out.println("===============================================" + "\n");
										System.out.println("rthrthtrh (rgrgr y rgrgrrg,  n rgrgrg)");
										System.out.print("rrgrgrgrgrgrg: ");
										selectFood = sc.nextLine();
										if(selectFood.equals("y")) {
											String confirm;
											do {
												System.out.println("========================================");
												System.out.println("           ergergergergergergergergergergerg          ");
												System.out.println("========================================");
												for(int i=0;i<listIdFood.length();i++) {
													char IdFood = listIdFood.charAt(i);
													int idFood = Integer.parseInt(String.valueOf(IdFood));
													System.out.println(" No." + food.getFoodID(idFood) + " " + food.getFoodName(idFood) + "   tgt " + food.getFoodPrice(idFood) + " fg");
												}
												System.out.println("========================================" + "\n");
												System.out.print("rgrgrgrgrgrgg: ");
												table = sc.nextLine();
												System.out.println("gergerg y ergergergrger,  n ergergerg");
												confirm = sc.nextLine();
												if(confirm.equals("y")) {
													order.setOrder(listIdFood, table, id);
													System.out.println("******************** ergergergregregergerg ********************");
													System.out.println(order.getShowOrderDetails());
													System.out.println("*******************************************************");
													break;
												}
											} while(!confirm.equals("n"));
											break;
										}
										else {
											listIdFood += selectFood;
										}
									} while(!selectFood.equals("n"));
							}
							else if(selectMenu == 2) {
								System.out.println("==================== ergergregergerger ====================");
								System.out.println(order.getShowOrderDetails());
								System.out.println("==================================================" + "\n");
							}
							else if(selectMenu == 3) {
								System.out.println("======================== ergregregreg ========================");
								int checkBill;
								do {
									System.out.println(order.getShowOrderDetails());
									System.out.println("-----------------------------------------------------");
									System.out.print("ergregergerg 1 ergergergergrg,  0 ergrgergreg: ");
									checkBill = sc.nextInt();
									if(checkBill == 1) {
										System.out.println("********************* egergergergregergreg *********************");
										bill.setBill(id);
										bill.CalculatePriceTotle();
										System.out.println(bill.ShowsDetailBill());
										billPrint = bill.ShowsDetailBill();
										System.out.println("-----------------------------------------------------\n");
									}
									break;
								} while(checkBill != 0);
							}
							else if(selectMenu == 4) {
								System.out.println("********************* ergergergregreg *********************");
								System.out.println(bill.ShowsDetailBill());
								System.out.println("-----------------------------------------------------\n");
								int printReceipt;
								do {
									System.out.print("regergreg 1 ergregerger,  0 fgggreg: ");
									printReceipt = sc.nextInt();
									if(printReceipt == 1) {
										System.out.print("ergergerg: ");
										double receiptMoney = 0.0;
										receiptMoney = sc.nextDouble();
										receipt.setReceipt(receiptMoney, id);
										receipt.CalculateChange();
										System.out.println("********************* ergergergergreg *********************");
										System.out.println(bill.ShowsDetailBill());
										System.out.println(receipt.getDetailReceipt());
										System.out.println("-----------------------------------------------------");
										System.out.println("                     ergregregerg                     ");
										System.out.println("****************************************************");
										break;
									}
								} while(printReceipt != 0);
							}
							else if(selectMenu == 5) {
								System.out.println("============== ergregergerger ==============");
								System.out.println(employee.getDetailEmployee(id));
								System.out.println("=============================================" + "\n");
							}
						} while(selectMenu != 0);
					}
					else if(employee.getEmployeePosition(id).equals("ergergregerg")) {
						int selectMenu;
						do {
							System.out.println("\n******************** ergergergerg ********************");
							System.out.println("ergergerg " + employee.getEmployeeName(id));
							System.out.println("ergregerger: " + employee.getEmployeePosition(id));
							System.out.println("   (1) ergerg");
							System.out.println("   (2) erger");
							System.out.println("   (3) regerg");
							System.out.println("   (0) rgerg");
							System.out.print("ergergreg: ");
							selectMenu = sc.nextInt();
							if(selectMenu == 1) {
								System.out.println("==================== regergregregreg ====================");
								System.out.println(order.getShowOrderDetails());
								System.out.println("==================================================" + "\n");
							}
							else if(selectMenu == 2) {
								String selectIngredient;
								String listIdIngredient = "";
								do {
									System.out.println("========== regregregerg ==========");
									System.out.println("1. ergergregreg");
									System.out.println("2. regerg");
									System.out.println("3. ergerg");
									System.out.println("4. rgregerg");
									System.out.println("5. regerg");
									System.out.println("================================" + "\n");
									System.out.println("ergergergerg (ergerg y ergerg,  n regrgeg)");
									System.out.print("ergregregerg: ");
									selectIngredient = sc.nextLine();
									if(selectIngredient.equals("y")) {
										String confirm;
										do {
											System.out.println("========== ergergregrgergreg ==========");
											for(int i=0;i<listIdIngredient.length();i++) {
												char IdIngredient = listIdIngredient.charAt(i);
												int idIngredient = Integer.parseInt(String.valueOf(IdIngredient));
												System.out.println("No." + ingredient.getIngredientID(idIngredient) + " " + ingredient.getIngredientName(idIngredient));
											}
											System.out.println("=======================================" + "\n");
											System.out.println("rgergr y dgdfgfdg,  n ergergerg");
											confirm = sc.nextLine();
											if(confirm.equals("y")) {
												transmission.setTransmission(listIdIngredient, id);
												System.out.println("******************** regergerg ********************");
												System.out.println(transmission.getDetailTransmission());
												System.out.println("*******************************************************");
												break;
											}
										} while(!confirm.equals("n"));
										break;
									}
									else {
										listIdIngredient += selectIngredient;
									}
								} while(!selectIngredient.equals("n"));
							}
							else if(selectMenu == 3) {
								System.out.println("============== ergregergergergerg ==============");
								System.out.println(employee.getDetailEmployee(id));
								System.out.println("=============================================" + "\n");
							}
						} while(selectMenu != 0);
					}
					else if(employee.getEmployeePosition(id).equals("ergergergreg")) {
						int selectMenu;
						do {
							System.out.println("\n******************** ergregerg ********************");
							System.out.println("regreger " + employee.getEmployeeName(id));
							System.out.println("ergerg: " + employee.getEmployeePosition(id));
							System.out.println("   (1) ergergerg");
							System.out.println("   (2) ergergreg");
							System.out.println("   (3) ergergergerg");
							System.out.println("   (0) regrerg");
							System.out.print("ergregregegerg: ");
							selectMenu = sc.nextInt();
							if(selectMenu == 1) {
								System.out.println("==================== ergregergergrg ====================");
								System.out.println(order.getShowOrderDetails());
								System.out.println("==================================================" + "\n");
							}
							else if(selectMenu == 2) {
								System.out.println("=================== ergregregergergerg ===================");
								System.out.println(transmission.getDetailTransmission());
								System.out.println("======================================================" + "\n");
							}
							else if(selectMenu == 3) {
								System.out.println("============== ergregregregregregerg ==============");
								System.out.println(employee.getDetailEmployee(id));
								System.out.println("=============================================" + "\n");
							}
						} while(selectMenu != 0);
					}
				}
			}
	    } while(select != 0);
		System.out.println("******************** Thank you! Goodbye! ********************");
	}
}
