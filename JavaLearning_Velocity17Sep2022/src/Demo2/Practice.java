package Demo2;

public class Practice {
	int a=12;
	static int b =23;

	//calling static method inside static method 
	
	public static void M1(){
	System.out.println("M1 is a static method");
	}
	
	public static void M2() {
		M1();
	}
	
	//calling static method inside non static method 
	
	public static void V1() {
		System.out.println("V1 is also a static method");
	}
	
	public void V2() { 
		V1();
	}
	
	//calling non static method inside non static method
	
	public void A1() {
		System.out.println("A1 is a non static method");
	}
	
	public void A2() {
		A1();
	}
	
	// calling non static method inside static method 
	
	public void S1() {
		System.out.println("S1 is also a non static method");
	}
	
	public static void S2() {
		Practice obj = new Practice();
		obj.S1();
	}
	public static void main(String[] args) {
		M2();
		V1();
		Practice ob = new Practice();
		ob.A2();
		S2();
	
	}
}
