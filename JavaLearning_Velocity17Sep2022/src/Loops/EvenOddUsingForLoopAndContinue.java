package Loops;

public class EvenOddUsingForLoopAndContinue {
	

	public static void main(String[] args) {
		
		System.out.println("1 to 100 even numbers using for loop and continue keyword:");
		
		for(int i = 1; i<=100; i++) 
		{
			
			if (i%2!=0)
				continue;
			
				System.out.print(i + " ");
		 }
		
		System.out.println("\n" + "\n" + "1 to 100 odd numbers using for loop and continue keyword:");
		
		for(int i = 1; i<=100; i++)
		{
			if (i%2==0)
				continue;
			System.out.print(i + " ");
		}
		
		System.out.println("\n" + "\n" + "1 to 100 even numbers using for loop and continue keyword:");
		
		for(int i = 100; i>=1; i--)
		{
			if (i%2!=0)
				continue;
			System.out.print(i + " ");
		}
		
		System.out.println("\n" + "\n" + "100 to 1 odd numbers using for loop and continue keyword:");
		
		for(int i = 100; i>=1; i--)
		{
			if (i%2==0)
				continue;
			System.out.print(i + " ");
		}
		
		}

}
