package thisexam;

public class AnotherConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person();
		
		System.out.println(person1.name);	// 무명
		System.out.println(person1.age);	// 1
		
		Person person2 = person1.returnSelf();
		System.out.println(person1);	//thisexam.Person@7de26db8
		System.out.println(person2);	//thisexam.Person@7de26db8
		
		System.out.println(person2.name);	// 무명
		System.out.println(person2.age);	// 1
		
		
		
	}

}
