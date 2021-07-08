package thisexam;

public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Birthday day1 = new Birthday();
		System.out.println(day1); 	//thisexam.Birthday@7de26db8
		day1.printThis();
		day1.setYear(2000);
		
		
		Birthday day2 = new Birthday();
		System.out.println(day2); 	//thisexam.Birthday@1175e2db
		day2.printThis();
		day2.setYear(1999);
		
		System.out.println(day1.year);
		System.out.println(day2.year);
		
		
		
		
		
		
	}

}
