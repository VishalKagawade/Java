package practiceMock6_2;

import java.util.Scanner;

public class SwappingOftwoNumbers {
	
	public static void main(String[] args) {
		
		int a,b;
		System.out.println(" Enter the two numbers");
		Scanner ob = new Scanner(System.in);
		a=ob.nextInt();
		b=ob.nextInt();
		
		System.out.println("numbers before swapping");
		System.out.println(a + " "+ b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("numbers after swapping");
		System.out.println(a + " "+ b);
		
		
		
		
	}

}
