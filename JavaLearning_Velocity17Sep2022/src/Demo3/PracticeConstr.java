package Demo3;

public class PracticeConstr {
	
	int a;
	int b;
	int c;
	
	public PracticeConstr(int PHY, int CHM, int MATHS, String Name) {
		this.a=PHY;
		this.b=CHM;
		this.c=MATHS;
		System.out.println("marks of "+Name+" PHY- "+PHY+" CHM- "+CHM+" MATHS- "+MATHS+" Total- "+(PHY+CHM+MATHS));
		System.out.println("");
	}
	public static void main (String[] args) {
		new PracticeConstr(80,78,88,"Pappu");
		new PracticeConstr(89,98,78,"Aju");
		new PracticeConstr(88,78,92,"Gaju");
		System.out.println("");
		PracticeConstr ob  = new PracticeConstr(87,90,95,"Vishu");
		System.out.println("Vishu got in PHY- "+ob.a);
	}

}
