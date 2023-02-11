package accessspecifiers1;

 public class Test1 {
	 
	final static int a = 10;
	 int b = 20;
	
	 void M1 () {
		System.out.println("M--1 is non-static");
	}
	
	 protected static void M2() {
	Test1 ob = new Test1();
	ob.b=23;
		 System.out.println("M2 is static");
	}

}
