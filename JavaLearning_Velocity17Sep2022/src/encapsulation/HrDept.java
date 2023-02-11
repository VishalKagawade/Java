package encapsulation;

import java.util.Scanner;

public class HrDept {
	
	private int salary = 10000;
	
	public int getSalary() {
		Scanner sec = new Scanner(System.in);
		System.out.println("Enter the Password");
		String password = sec.nextLine();
		if(password.equals("Vishal#12"))
	return salary;
		else
			return (Integer) null;
	}

}
