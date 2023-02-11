package practiceMock6_2;

import java.util.Scanner;

public class SwappingOfTwoNumbersWithThirdVariable {

	public static void main(String[] args) {
		
		int a,b, temp;
		System.out.println("Enter the two numbers");
		Scanner ob = new Scanner(System.in);
		a=ob.nextInt();
		b=ob.nextInt();
		
		System.out.println("Numbers before swapping");
		System.out.println(a + " " + b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Numbers before swapping");
		System.out.println(a + " " + b);
		
	}
}
