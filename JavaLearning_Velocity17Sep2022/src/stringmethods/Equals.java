package stringmethods;

public class Equals {
	
 // equals(object o)
	
	public static void main(String[] args) {
		String s = "power";
		
		String b = new String("power");
		
		System.out.println(s==b);   // == sign compares between two object memory i.e. memory address
		
		System.out.println(s.equals(b));  // .euals compares between content of two objects
	}

}
