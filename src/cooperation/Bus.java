package cooperation;

public class Bus {
	
	int busNumber;	//���� ��ȣ
	int money;	// ����
	int passengerCount;	//�°� ��
	// ���� ��ȣ�� �Ű������� ���� ������
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// ������ �°�(�л�)�� �¿�� �޼���
	public void take(int money) { // ��ü ����
		// �󸶸� ���� Ÿ�� ��
		this.money += 1000;		// �л��� �� ����� �������� ����
		// �л��� �� �� Ż �� ���� �°� ���� ����
		this.passengerCount++;	// �°� �� ����
		
		
	}
	
	//Generate Constructor using field
	
	public void printBusInfo() {
		System.out.println(busNumber+"�� ������ �°��� "+passengerCount+"���̰�, ������ "+ money 
				+"���Դϴ�.");
	}
	
	
	
	
}
