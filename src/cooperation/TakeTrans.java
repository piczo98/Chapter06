package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student tomasStudent = new Student("tomas", 5000);	// �л� ����
		Bus bus1004 = new Bus(1004);		// ���� 1004�� ����
		
		tomasStudent.takeBus(bus1004);		// 1004�� ������ �丶�� �л��� ź��.	=
		
		tomasStudent.printStudentInfo();
		bus1004.printBusInfo();
		
		Subway greenLine = new Subway("2ȣ��");
		Student jamesStudent = new Student("james", 10000);
		
		jamesStudent.printStudentInfo();
		greenLine.printSubwayInfo();
		
		jamesStudent.takeSubway(greenLine);	// 2ȣ�� ����ö�� ���ӽ� �л��� ź��.
		
		
		jamesStudent.printStudentInfo();
		greenLine.printSubwayInfo();
		
		Student EdwardStudent = new Student("Edward", 20000);
		
		Taxi taxi123 = new Taxi(123);
		
		EdwardStudent.takeTaxi(taxi123);
		
		EdwardStudent.printStudentInfo();
		taxi123.printTaxiInfo();
		
		
		
		
		
		
		
		
		
	}

}
