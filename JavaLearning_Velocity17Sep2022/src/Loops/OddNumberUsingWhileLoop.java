package Loops;

// Write program to find 0 to 100 odd number using while loop

public class OddNumberUsingWhileLoop {
	
	public static void main(String[] args) {
		int x = 0;
		
		while(x<=100)
		{
			if(!((x%2)==0)) 
			{
				System.out.print(x + " ");
			}
			x++;
		}
		
		
	}

}
