package practicemock7;

import java.util.Scanner;

public class Child4 {
	
	private int salary = 10000;
	
	public int getsalary() {
		Scanner sec = new Scanner (System.in);
		System.out.println("Enter password");
		String password = sec.nextLine();
		if(password.equals("Vishal@3456"))
			return salary;
		else return(Integer) null;
	}

}
