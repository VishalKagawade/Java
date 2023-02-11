package practicemock9;

public class Parent9 {

	private static int salary = 10000;
	
	public static int getsalary() {
		Scanner var = new Scanner(System.in);
		System.out.println("Enter the password");
		String pass = var.nextLine();
		if(pass.equals("vishu0012"))
			return salary;
					
			else return (Integer) null;
		
	}
	
	
}
