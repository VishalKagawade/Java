package Loops;

public class EvenOddUsingWhileLoop {
	
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int a = 100;
		int b = 100;
		
		System.out.println("0 to 100 Even numbers using while loop:");
		while(x<=100)
		{
			if((x%2)==0)
			{
				System.out.print(x + " ");
			}
			x++;
		}
		
		System.out.println("\n"+ "\n" + "0 to 100 odd numbers using while loop:");
		while(y<=100)
		{
			if((y%2)!=0)
			{
				System.out.print(y + " ");
			}
			y++;
		}
		
		System.out.println("\n"+ "\n" + "100 to 0 even numbers using while loop:");
		while(a>=0)
		{
			if((a%2)==0)
			{
				System.out.print(a + " ");
			}
			a--;
		}
		
		System.out.println("\n"+ "\n" + "100 to 0 odd numbers using while loop:");
		while(b>=0)
		{
			if((b%2)!=0)
			{
				System.out.print(b + " ");
			}
			b--;
		}
		

	}

}
