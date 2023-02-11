package Demo3;

public class ConstructorMarks {
	
	public ConstructorMarks(int PHY, int CHM, int MATHS, String name) {
		System.out.println("marks of " + name + ": PHY-" + PHY + " CHM-" + CHM + " MATHS-" + MATHS + " Toatl marks-" + (PHY+CHM+MATHS));
		System.out.println("");
	}
	
	public static void main(String[] args) {
		new ConstructorMarks(80,82,88,"Pappu");
		new ConstructorMarks(86,89,87,"Aju");
		new ConstructorMarks(88,80,95,"Gaju");
	}
}
