package cooperation;

public class Student {
	
	
	public String studentname;	// �л� �̸�
	public int age;				// ����
	public int money;			// ���� ��
	
	// �̸��� ���� ���� �Ű������� �ϴ� ������
	public Student(String studentname, int money) {
		this.studentname = studentname;
		this.money = money;
	}

	// �л��� ������ Ÿ�� �޼���
	public void takeBus(Bus bus) {
		//				Ż ���� ��ȣ
		// �л��� ���� ���� ��ȭ üũ
		this.money -= 1000;
		bus.take(1000); 	// 1000�� �����ϰ� ������ Ÿ�� �޼��带 ȣ��
		
	}
	// �л��� ����ö�� Ÿ�� �޼���
	public void takeSubway(Subway subway) {
		//						Ż ����ö ȣ��
		// �л��� ���� ���� ��ȭ üũ
		this.money -= 1500;
		subway.take(1500); 
	}
	
	public void takeTaxi(Taxi taxi) {
		this.money -= 10000;
		taxi.take(10000);
		
	}
	
	public void printStudentInfo() {
		
		System.out.println(studentname + "�л��� ���� ���� "+money+"���Դϴ�");
		
	}
	
	
	
	
	
	
	
	

}
