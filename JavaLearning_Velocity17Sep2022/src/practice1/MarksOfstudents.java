package practice1;

public class MarksOfstudents {
	
	public void general(int PHY, int CHM, int MATHS, String name) {
		System.out.println("Marks of " + name + " PHY- " + PHY + " CHM- " + CHM + " MATHS- " + MATHS);
		System.out.println(" ");
		
	}
	
	public void AllStudents() {
		general(88,87,90,"pappu");
		general(98,82,80,"Aju");
		general(78,77,97,"Gaju");
	}
	
	public static void main(String[] args) {
		MarksOfstudents ob = new MarksOfstudents();
		ob.AllStudents();
	}

}
