package Loops;

//Write program to find 0 to 100 even number using do While loop

public class EvenNumberUsingDoWhileLoop {
	
	public static void main(String[] args) {
		int x = 0;
		System.out.println("0 to 100 Even numbers");  //
		
		do 
		{
			if((x%2)==0)
			System.out.print(x + " ");
			x++;
		}
		while(x<=100);		
		
		
	}
}
