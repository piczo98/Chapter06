package thisexam;

public class Birthday {
	
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;	// 자기 자신을 가리키는 this
		
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}
