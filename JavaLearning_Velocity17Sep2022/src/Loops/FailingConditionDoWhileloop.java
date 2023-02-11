package Loops;

public class FailingConditionDoWhileloop {
	
	public static void main(String[] args) {
		int x = 0;
		
		do
		{
			System.out.println("do is running");
		}
		while(x==15);  
		
		// Here even if condition is failed, minimum 1 time output will occur in do while loop
		// because it is checking condition after the do action 
		
	}

}
