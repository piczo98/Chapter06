package cooperation;

public class Subway {
	
	String lineNumber;		// 호선
	int money;				// 수입
	int passengerCount;		// 승객 수
	
	// 호선을 매개 변수로 갖는 생성자 추가
	public Subway(String lineNumber){
		this.lineNumber = lineNumber;	// 매개변수로 입력 => 값 초기화
		
	}
	
	public void printSubwayInfo() {
		System.out.println("지하철 "+lineNumber+" 승객은 "+passengerCount+"명이고, 수입 금액은 "+ money+"원입니다.");
	}

	public void take(int money) {
		this.money += 1500;
		this.passengerCount++;
		
	}
	
	// 안녕하세요 감사해요 잘있어요~ 다시 만나요~
	// 아침 해가 뜨면~
	
	
	
}
