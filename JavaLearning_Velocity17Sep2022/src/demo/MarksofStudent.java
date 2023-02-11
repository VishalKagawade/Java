package demo;

public class MarksofStudent {
	
	int PHS;
	int CHM;
	int MATHS;
	
	public static void Vishal() {
		MarksofStudent ob1 = new MarksofStudent();
		ob1.PHS=80;
		ob1.CHM=85;
		ob1.MATHS=90;
		System.out.println("Marks of Vishal");
		System.out.println("PHS = " + ob1.PHS);
		System.out.println("CHM = " + ob1.CHM);
		System.out.println("MATHS = " + ob1.MATHS);
		System.out.println("");
	}
	
	public static void Ajinkya() {
		MarksofStudent ob1 = new MarksofStudent();
		ob1.PHS=88;
		ob1.CHM=87;
		ob1.MATHS=92;
		System.out.println("Marks of Ajinkya");
		System.out.println("PHS = " + ob1.PHS);
		System.out.println("CHM = " + ob1.CHM);
		System.out.println("MATHS = " + ob1.MATHS);
		System.out.println("");
	}
	
	public static void Pappu() {
		MarksofStudent ob1 = new MarksofStudent();
		ob1.PHS=82;
		ob1.CHM=84;
		ob1.MATHS=80;
		System.out.println("Marks of Pappu");
		System.out.println("PHS = " + ob1.PHS);
		System.out.println("CHM = " + ob1.CHM);
		System.out.println("MATHS = " + ob1.MATHS);
	}
	
	
	
	public static void main(String[] args) {
		Vishal();
		Ajinkya();
		Pappu();
	}

}
