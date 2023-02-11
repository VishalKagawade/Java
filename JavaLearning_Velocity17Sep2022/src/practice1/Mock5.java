package practice1;

public class Mock5 {
	
	public void general(String name,int PHY, int CHM, int MATHS ) {
		System.out.println("Marks of "+ name + "\n" + " PHY- " + PHY + "\n" + " CHM- " + CHM + "\n" + " MATHS- " + MATHS );
		System.out.println(" ");
	}
	
	public void AllStudents() {
		general("Pappu",88,98,89);
		general("Aju",88,98,89);
	}
	
	
	public static void main(String[] args) {
		Mock5 ob = new Mock5();
		ob.AllStudents();
	
	}
	
	

}
