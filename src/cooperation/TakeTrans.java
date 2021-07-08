package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student tomasStudent = new Student("tomas", 5000);	// 학생 생성
		Bus bus1004 = new Bus(1004);		// 버스 1004번 생성
		
		tomasStudent.takeBus(bus1004);		// 1004번 버스를 토마스 학생이 탄다.	=
		
		tomasStudent.printStudentInfo();
		bus1004.printBusInfo();
		
		Subway greenLine = new Subway("2호선");
		Student jamesStudent = new Student("james", 10000);
		
		jamesStudent.printStudentInfo();
		greenLine.printSubwayInfo();
		
		jamesStudent.takeSubway(greenLine);	// 2호선 지하철을 제임스 학생이 탄다.
		
		
		jamesStudent.printStudentInfo();
		greenLine.printSubwayInfo();
		
		Student EdwardStudent = new Student("Edward", 20000);
		
		Taxi taxi123 = new Taxi(123);
		
		EdwardStudent.takeTaxi(taxi123);
		
		EdwardStudent.printStudentInfo();
		taxi123.printTaxiInfo();
		
		
		
		
		
		
		
		
		
	}

}
