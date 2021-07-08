package cooperation.q5;

public class Person {
	
	public String name;
	public int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
		
	}
	
	public void printPersonInfo() {
		
		System.out.println(name + "님의 남은 돈은 "+ money+"원입니다");
		
	}
	
	public void buyBeanCoffee(BeanCoffee beanCoffee, int cost) {
		
		if (this.money > 4500) {
			System.out.println(this.name+"님이 4500원으로 콩다방 라떼를 구입했습니다");
			this.money -= cost;
		} else
			System.out.println(this.name+"님이 "+this.money+"원으로 돈이 부족하여 라떼를 마실 수가 없어요~ ㅠㅠ");
		
		beanCoffee.buy(4500);
		
	}

	public void buyStarCoffee(StarCoffee starCoffee, int cost) {
		// TODO Auto-generated method stub

		if (this.money > 4500) {
			System.out.println(this.name+"님이 4000원으로 별다방 아메리카노를 구입했습니다");
			this.money -= cost;
			
		} else
			System.out.println(this.name+"님이 "+this.money+"원으로 돈이 부족하여 아메리카노를 마실 수가 없어요~ ㅠㅠ");
		
		starCoffee.buy(4000);
	}
	
}
