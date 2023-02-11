package Demo2;

public class KBPVidyalaya {
	
	public void general (int PHY, int CHM, int MATHS, String NAME) {
		System.out.println("Marks of " + NAME + ": PHY " + PHY + " CHM " + CHM + " MATHS " + MATHS + " Total " + (PHY+CHM+MATHS));
		System.out.println("");
		
	}
	
	public void AllStudents() {
		general(88,82,80,"Vishal");
		general(81,84,86,"Ajinkya");
		general(84,88,90,"Akshay");
	}
	
	public static void main (String[] args) {
		KBPVidyalaya ob = new KBPVidyalaya();
		ob.AllStudents();
	}
	

}
