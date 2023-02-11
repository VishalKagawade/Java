package Loops;

public class DoWhileLoop {
	
	// do 
	// { 
	//   Action
	//  }
	// while (condition);
	
	public static void main(String[] args) {
		int x = 0; // local variable
		
		do
		{
			System.out.println("do is running");
			x++;
		}
		
		while(x<=5); // 1,2,3,4,5.....6 loop will stop
	}

}
