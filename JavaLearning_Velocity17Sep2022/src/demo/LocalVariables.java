package demo;

public class LocalVariables {

static int a = 25;
int b = 30;
	
	public static void Stat() {
		int a = 35;
		System.out.println(LocalVariables.a);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Stat();
		LocalVariables ob = new LocalVariables();
		System.out.println(ob.b);
		
	
	}


}
