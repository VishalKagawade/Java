package Loops;

public class EvenOddUsingForLoop {
	
	public static void main(String[] args) {
		
		System.out.println("0 to 100 Even numbers using for loop:");
		for(int i = 0; i<=100; i++) {
			if(i%2==0)
				System.out.print(i + " ");}
		
		System.out.println("\n" + "\n" +"0 to 100 odd numbers using for loop:");
		for(int j = 0; j<=100; j++) {
			if(j%2!=0)
				System.out.print(j + " ");}
		
		System.out.println("\n" + "\n" +"100 to 0 Even numbers using for loop:");
		for(int k = 100; k>=0; k--) {
			if(k%2==0)
				System.out.print(k + " ");}
		
		System.out.println("\n" + "\n" +"100 to 0 odd numbers using for loop:");
		for(int l = 100; l>0; l--) {
			if(l%2!=0)
				System.out.print(l + " ");}
			
		
	}
	
	

}
