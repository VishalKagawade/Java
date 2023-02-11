package practicemock8;

public class PractInhChild1  {
	
	
	// checked exception  or compile time excdeption 
	public static void main(String[] args) throws InterruptedException,ArithmeticException {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		Thread.sleep(5000);
		System.out.println(1/0);
		System.out.println(4);
		System.out.println(5);
	}

	

}
