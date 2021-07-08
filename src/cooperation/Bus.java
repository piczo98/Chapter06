package cooperation;

public class Bus {
	
	int busNumber;	//버스 번호
	int money;	// 수입
	int passengerCount;	//승객 수
	// 버스 번호를 매개변수로 갖는 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 버스가 승객(학생)을 태우는 메서드
	public void take(int money) { // 객체 협력
		// 얼마를 내고 타는 지
		this.money += 1000;		// 학생이 낸 요금을 수입으로 증가
		// 학생이 한 명 탈 때 마다 승객 수는 증가
		this.passengerCount++;	// 승객 수 증가
		
		
	}
	
	//Generate Constructor using field
	
	public void printBusInfo() {
		System.out.println(busNumber+"번 버스의 승객은 "+passengerCount+"명이고, 수입은 "+ money 
				+"원입니다.");
	}
	
	
	
	
}
