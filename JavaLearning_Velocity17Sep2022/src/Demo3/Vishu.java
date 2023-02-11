package Demo3;

public class Vishu {
	
	int Pappu;
	int Lalu;
	int Gaju;
	
	public void general() {
		int pappu= 100;
		int lalu= 89;
		int Gaju= 80;
		System.out.println("Pappu- " + pappu);
		System.out.println("Lalu- " + lalu);
		System.out.println("Gaju- " + Gaju);
	}
	public static void AllStudents() {
		Vishu ob = new Vishu();
		ob.general();
	}
	public static void main(String[] args) {
		AllStudents();
	}


}
