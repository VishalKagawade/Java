package Demo2;

public class PracticeVariables {

	static int a = 20;  // static variable 

	int b = 30;  // non static variable 
	
	int m;
	// calling static variable inside static method
	
	public static void M1() {
		System.out.println(a);
			
	}
	
	// calling static variable inside non static method 
	
	public void V1() {
		System.out.println(a);
		
	}
	
	// calling non static variable inside non static method 
	
	public void A1() {
		System.out.println(b);
	}
	
	// calling non static variable inside static method
	
	public static void P1 () {
		PracticeVariables ob1 = new PracticeVariables();
	    System.out.println(ob1.b);
	    
	}
	    
	    
	    // if name of local variable in static method is same as static variable then to call the static variable
	    
	 
	public static void VK1() {
		int a = 55;
		
		System.out.println(a); // will take local value for variable 'a'
		System.out.println(PracticeVariables.a); // will take the global value for variable 'a'
		
	}
	
	// if name of local variable in non static method is same as static variable then to call the static variable
	
	public void VK2() {
		int a = 65;
		System.out.println(a);
		System.out.println(PracticeVariables.a);
		
	}
	
	// if name of local variable in static method is same as non static variable then to call the non static variable
	
	public static void VK3() {
		int b = 75;
		System.out.println(b);
		PracticeVariables ob2 = new PracticeVariables();
		System.out.println(ob2.b);
		
		
	}
	
	// if name of local variable in non static method is same as non static variable then to call the non static variable
	
	public void VK4() {
		int b = 85;
		System.out.println(b);
	
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		M1();
		PracticeVariables ob = new PracticeVariables();
		ob.V1();
		ob.A1();
		P1();
		VK1();
		ob.VK2();
		VK3();
		ob.VK4();
		System.out.println(ob.m);
	}
}
