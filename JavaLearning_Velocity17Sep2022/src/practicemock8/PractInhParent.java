package practicemock8;



public class PractInhParent {
	
	// unchecked exception or run time exception
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		try {
		System.out.println(4/2);}
		catch (ArithmeticException var) {
			System.out.println("cannot be devided by zero");
		}
		
		finally {
			System.out.println("No matters what finally will always get execute");
		}
		
		
		System.out.println(5);
	}



}