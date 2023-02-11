package exception;

public class ThrowsPractice {
	
	public static void main(String[] args) throws InterruptedException{
		int a =100;
		int b = 200;
		int c = a + b;
		System.out.println(c);
		Thread.sleep(2000);
		System.out.println(b);
		Thread.sleep(2000);
		System.out.println(a);
		
	}

}
