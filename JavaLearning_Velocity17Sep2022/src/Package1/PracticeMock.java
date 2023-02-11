package Package1;

public class PracticeMock {
	
	public static void M1() {
		
	}
	
	public  void M2() {
		System.out.println("M2 is non static");
	}
	
	public PracticeMock() {
		System.out.println("without arguement");
		
	}
	
	public PracticeMock(int a) {
		System.out.println("With argument");
		
	}
	
	public PracticeMock(int a, boolean b) {
		this(55);
		System.out.println("2nd with arguement");
		
		
	}
	
	public static void main(String[] args) {
		new PracticeMock(25,true);
		
		 
;	}
	
}


