package cooperation;

public class Taxi {
	
	int money;
	int passengerCount;
	int carNumber;
	
	public Taxi (int carNumber) {
		this.carNumber = carNumber;
	}
	

	public void take(int money) {
		
		this.money += 10000;
		this.passengerCount++;
		
		
	}
	
	public void printTaxiInfo() {
		System.out.println("택시 번호 "+carNumber+"의 승객은 "+passengerCount+"명이고, 수입 금액은 "+ money+"원입니다.");
	}
	
	
	
	
}
