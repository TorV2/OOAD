package ooad;

public class Employee {
	private int employeeID[]; //���ʾ�ѡ�ҹ attribute 001
	private String employeeName[]; //���;�ѡ�ҹ attribute "�ظ��Թ�  ���Ƿͧ"
	private String employeeTel[]; //�������þ�ѡ�ҹ attribute "087-3658255"
	private String employeePosition[]; //���˹觾�ѡ�ҹ attribute "��ѡ�ҹ�Ѻ�������"

	public Employee(int employeeID[], String employeeName[], String employeeTel[],String employeePosition[]) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeTel = employeeTel;
		this.employeePosition = employeePosition;
	}

	public boolean getEmployeeID(int id) { //��礡����������к��ͧ��ѡ��ҹ
		boolean check = false;
		for(int i=0;i<employeeID.length;i++) {
			if(id == employeeID[i]) {
				check = true;
			}
		}
		return check;
	}

	public String getEmployeeName(int id) { //�ʴ����ͧ͢��ѡ�ҹ
		String name = "";
		for(int i=0; i<employeeID.length; i++) {
			if(id == employeeID[i]) {
				name = employeeName[i];
			}
		}
		return name;
	}

	public String getEmployeePosition(int id) { //�ʴ����˹觢ͧ��ѡ�ҹ
		String position = "";
		for(int i=0; i<employeeID.length; i++) {
			if(id == employeeID[i]) {
				position = employeePosition[i];
			}
		}
		return position;
	}

	public String getDetailEmployee(int id) { //�ʴ���������´�ͧ��ѡ�ҹ
		String detailEmployee = "";
		for(int i=0;i<employeeID.length;i++) {
			if(id == employeeID[i]) {
				detailEmployee = "asdsd: "+ employeeID[i] +"\nasdsadasd: "+ employeeName[i] +"\nasdadsa: "+ employeeTel[i] +"\nasdasd: "+ employeePosition[i];
			}
		}
		return detailEmployee;
	}
}
