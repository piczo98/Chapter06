package thisexam;

public class Person {
	String name;
	int age;
	
	//����Ʈ ������ 
	public Person() {
		// �ν��Ͻ� ������ �ʱ�ȭ�� �۾��� ����

//		name = "";	// ������ �ν��Ͻ��� ��� ������ �����Ǳ� ������ ���ɼ��� �����Ƿ�
		//		String test = "test";	
		/*
		name = "����";
		age = 1;
		
		*/
		// ������ ���ο� �� �ٸ� �����ڸ� ȣ���Ͽ� ��� ������ �ʱ�ȭ
		this("����", 1);	// �ݵ�� ù��° �ٿ��� ����ؼ� ������ ���Ѵ�.
		// this�� ����Ű�� �� Person
		// ������������������������������������������������������
	}
	// �Ű����� ������ :  �ʱ�ȭ�� ��� ������ �Ű������� �����ϴ� ������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	// �ڱ��� ��ȯ�ϴ� �޼���
	public Person returnSelf() {
		return this;	// this ���� ���� �ڽ��� �ν��Ͻ� Ÿ������ ����
		
	}
	
	
}
