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
		System.out.println("�ý� ��ȣ "+carNumber+"�� �°��� "+passengerCount+"���̰�, ���� �ݾ��� "+ money+"���Դϴ�.");
	}
	
	
	
	
}
