package ooad;

public class Customer {
	private int customerID[]; //�����١��� attribute 0001
	private String customerName[]; //�����١��� attribute "�ҳ��Ѳ��  ������"
	private String customerTel[]; //���������١��� attribute "084-3265845"
	private String customerAddress[]; //�������㹡�èѴ�觢ͧ�١��� attribute "301/85 ����7 �.��ç����ʧ�����Ź��2 �.���⾸�� �.���ͧ��ɳ��š �.��ɳ��š 65000"

	public Customer(int customerID[], String customerName[], String customerTel[], String customerAddress[]) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerTel = customerTel;
		this.customerAddress = customerAddress;
	}

	public boolean getCustomerID(int id) { //��礡����������к��ͧ�١���
		boolean check = false;
		for(int i=0;i<customerID.length;i++) {
			if(id == customerID[i]) {
				check = true;
			}
		}
		return check;
	}

	public String getCustomerName(int id) { //�ʴ����ͧ͢�١���
		String name = "";
		for(int i=0; i<customerID.length; i++) {
			if(id == customerID[i]) {
				name = customerName[i];
			}
		}
		return name;
	}

	public String getDetailCustomer(int id) { //�ʴ���������´�ͧ�١���
		String detailCustomer = "";
		for(int i=0;i<customerID.length;i++) {
			if(id == customerID[i]) {
				detailCustomer = "Customer: "+ customerID[i] +"\nwadawd: "+ customerName[i] +"\nwadwda: "+ customerTel[i] +"\nawdawd: "+customerAddress[i];
			}
		}
		return detailCustomer;
	}
}
