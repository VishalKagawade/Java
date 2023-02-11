package logicalprograms;

public class SwappingOfTwoNumbersUsingThirdVariable {
	
	static int a =10;
	static int b =20;
	
	public static void Before() {
		System.out.println("Before Swapping " + " a = " + a + " b = "+b);
		
	}
	
	public static void After() {
		int temp = a;   // temp = 10
		a=b;            // a =20;
		b=temp;         // b=10
		
		System.out.println("After Swapping " + " a = " + a + " b = "+b);
	}
	
	public static void main(String[] args) {
		Before();
		System.out.println(" ");
		After();
	}

}
