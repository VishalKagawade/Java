package demo;

public class KarmveerVidyalaya {
	
	public void method(int phy, int chem, int maths, String name) {
		System.out.println("Marks obtain by: " + name + ":- phy- " + phy + ":- chem- " + chem + ":- maths- " + maths);
		System.out.println("");
	}
	public void AllStudents() {
		method(80,85,88,"Pappu");
		method(88,90,90,"Vishal");
		method(87,88,92,"Ajinkya");
	}
	
	public static void main (String[] args) {
		KarmveerVidyalaya ob = new KarmveerVidyalaya();
		ob.AllStudents();
	}
}
