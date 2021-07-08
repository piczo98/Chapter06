package cooperation.q5;

public class Person {
	
	public String name;
	public int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
		
	}
	
	public void printPersonInfo() {
		
		System.out.println(name + "���� ���� ���� "+ money+"���Դϴ�");
		
	}
	
	public void buyBeanCoffee(BeanCoffee beanCoffee, int cost) {
		
		if (this.money > 4500) {
			System.out.println(this.name+"���� 4500������ ��ٹ� �󶼸� �����߽��ϴ�");
			this.money -= cost;
		} else
			System.out.println(this.name+"���� "+this.money+"������ ���� �����Ͽ� �󶼸� ���� ���� �����~ �Ф�");
		
		beanCoffee.buy(4500);
		
	}

	public void buyStarCoffee(StarCoffee starCoffee, int cost) {
		// TODO Auto-generated method stub

		if (this.money > 4500) {
			System.out.println(this.name+"���� 4000������ ���ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�");
			this.money -= cost;
			
		} else
			System.out.println(this.name+"���� "+this.money+"������ ���� �����Ͽ� �Ƹ޸�ī�븦 ���� ���� �����~ �Ф�");
		
		starCoffee.buy(4000);
	}
	
}
