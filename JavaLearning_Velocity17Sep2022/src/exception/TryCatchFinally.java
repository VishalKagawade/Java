package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		// facebook --> profile 
		///log visbamb
		
		
		try {
		System.out.println(4/2);  // risky line 
		}
		catch (ArithmeticException var) {
			System.out.println(" cannot be devide by zero");
		}
		finally {
			System.out.println("no matters whether exception occcurs or not , finally will always executed");
		}
		
		
		System.out.println(5);
		System.out.println(6);
	}
}
