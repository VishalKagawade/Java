package practicemock8;

import java.util.Scanner;

public class PractEncap {
	
	private static int salary =10000;
	
	public static int getsalary() {
		Scanner ob = new Scanner (System.in);
		System.out.println("enter the password");
		String pass = ob.nextLine();
		if(pass.equals("Vishu@8010"))
			return salary;
		
		else
			
			return (Integer) null;
		
		
		
		
	}

}
