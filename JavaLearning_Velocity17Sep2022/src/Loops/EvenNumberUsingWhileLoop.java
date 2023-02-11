package Loops;

// Write program to find 0 to 100 even number using while loop 

public class EvenNumberUsingWhileLoop {
	
 public static void main(String[] args) {
	 int x = 0;  // local variable 
	 
	 while(x<=100)
	 {
		 if((x%2)==0)
		 {
			 System.out.print(x + "\t");     //(x + " ") can be used to reduce the space between two numbers 
			 
		 }
		 x++;
	
		 
	 }
		
}

}
