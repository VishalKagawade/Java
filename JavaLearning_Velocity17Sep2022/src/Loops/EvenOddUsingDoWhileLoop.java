package Loops;

public class EvenOddUsingDoWhileLoop {
	
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int a = 100;
		int b = 100;
		
		System.out.println(" 0 to 100 Even numbers using do while loop");
		
		do
		{
			if((x%2)==0)
			{
				System.out.print(x + " ");
				
			}
			x++;
		}
		while(x<=100);
		
		System.out.println("\n" + "\n" + "0 to 100 odd numbers using do while loop");
		do
		{
			if((y%2)!=0)
			{
				System.out.print(y + " ");
			}
			y++;
		}
		while(y<=100);
		
		System.out.println("\n" + "\n" + "100 to 0 Even numbers using do while loop");
		do
		{
			if((a%2)==0)
			{
				System.out.print(a + " ");
			}
			a--;
		}
		while(a>=0);
		
		System.out.println("\n" + "\n" + "100 to 0 Odd numbers using do while loop");
		do
		{
			if((b%2)!=0)
			{
				System.out.print(b + " ");
			}
			b--;
		}
		while(b>=0);

	}
	
	

}
