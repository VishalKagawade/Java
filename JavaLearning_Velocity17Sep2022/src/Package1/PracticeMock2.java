package Package1;

public class PracticeMock2 {
	
	int a = 10;
	int b ;
	int c ;
	
	public PracticeMock2 (int N, int P, int V) {
		this.a=N;
		this.b=P;
		this.c=V;
		
	}
	
	public static void main(String[] args) {
		PracticeMock2 ob = new PracticeMock2(55,65,85);
		PracticeMock2 ob1 = new PracticeMock2(55,65,75);
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob1.c);
		
	}
}
