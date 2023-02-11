package practice1;

public class InheritPract2 extends  InheritPract {
	
	static int a =200;
	int b =400;
	
	
	public void S1() {
		
		System.out.println(InheritPract.a);  
		System.out.println(super.b);     
		
		// when name of non static variable is same in both child class and parent class then to call non static
		// variable from parent class we will use super keyword
		
		
	}
	
	public static void main(String[] args) {
		
		InheritPract2 ob = new InheritPract2();
		ob.S1();
	}

}
