package practice1;

public class practice22 {
	
	public void M1() {
		System.out.println(" without arguement without return");
	}
	
	public int M2() {
		
		return 45;
	}
	
	public void M3(int d) {
		System.out.println(" with arguement without return");
	}
	
	public int M4 (boolean b) {
		System.out.println(" with arguement with return");
		return 98;
	}
	
	public static void main(String[] args) {
		practice22 ob  = new practice22();
		ob.M2();
		int f = ob.M2();
		System.out.println(f);
	}
	
	

}
