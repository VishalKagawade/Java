package logicalprograms;

import java.util.Scanner;

public class TableOfAnyNumber {
	
	
	
	public static void Table () {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		System.out.println("Table of " + num);
		
		for ( int i=1; i<=10; i++) {
		
			
			System.out.println(num * i);
			
		}
	}

	public static void main(String[] args) {
		Table();
	}
}
