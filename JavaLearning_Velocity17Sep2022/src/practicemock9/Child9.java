package practicemock9;

public class Child9  {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(1);
		System.out.println(2);
		Thread.sleep(5000);
		
		System.out.println(3);
		
		try 
		{
		System.out.println(4/0);
		}
		catch(ArithmeticException var) {
			System.out.println("Cannot be devided by zero");
		}
		finally
		{
			System.out.println("No matter finally will always get execute");
		}
		
		System.out.println(5);
	}
	
	


}
