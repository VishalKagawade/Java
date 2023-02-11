package Package1;

public class PracticeMock3 {

	int a = 10;
	int b = 20;
	int c = 30;
	
	public static void S1() {
		PracticeMock3 ob = new PracticeMock3();
		
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		
		ob.a=45;
		System.out.println(ob.a);
	}
	
	public static void main(String[] args) {
		S1();
	}
	
}
