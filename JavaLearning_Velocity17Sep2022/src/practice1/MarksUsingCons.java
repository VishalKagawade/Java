package practice1;

public class MarksUsingCons {
	
	public MarksUsingCons(String name,int PHY, int CHM, int MATHS ) {
		System.out.println("Marks of " + name + " PHY- " + PHY + " CHM- " + CHM + " MATHS- " + MATHS);
		System.out.println(" ");
	}
public static void main(String[] args) {
	new MarksUsingCons("Pappu",88,56,89);
	new MarksUsingCons("Pappu",68,89,86);
	new MarksUsingCons("Pappu",98,96,79);
}
}
