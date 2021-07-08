package cooperation;

public class Student {
	
	
	public String studentname;	// 학생 이름
	public int age;				// 나이
	public int money;			// 가진 돈
	
	// 이름과 가진 돈을 매개변수로 하는 생성자
	public Student(String studentname, int money) {
		this.studentname = studentname;
		this.money = money;
	}

	// 학생이 버스를 타는 메서드
	public void takeBus(Bus bus) {
		//				탈 버스 번호
		// 학생이 가진 돈의 변화 체크
		this.money -= 1000;
		bus.take(1000); 	// 1000원 지불하고 버스를 타는 메서드를 호출
		
	}
	// 학생이 지하철을 타는 메서드
	public void takeSubway(Subway subway) {
		//						탈 지하철 호선
		// 학생이 가진 돈의 변화 체크
		this.money -= 1500;
		subway.take(1500); 
	}
	
	public void takeTaxi(Taxi taxi) {
		this.money -= 10000;
		taxi.take(10000);
		
	}
	
	public void printStudentInfo() {
		
		System.out.println(studentname + "학생의 남은 돈은 "+money+"원입니다");
		
	}
	
	
	
	
	
	
	
	

}
