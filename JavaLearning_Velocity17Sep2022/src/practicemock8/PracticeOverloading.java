package practicemock8;

public class PracticeOverloading {
	
	public void M1() {
		System.out.println(" M1 is non static ");
		
	}
	
	
	public void M1(int a) {
		System.out.println(" M1 is 2nd non static");
	}
	
	
	public static void main(String[] args) {
		PracticeOverloading ob = new PracticeOverloading();
		ob.M1();
		ob.M1(67);
	}

}
