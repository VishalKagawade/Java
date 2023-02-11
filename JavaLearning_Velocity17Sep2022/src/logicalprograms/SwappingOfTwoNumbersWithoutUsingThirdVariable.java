package logicalprograms;

public class SwappingOfTwoNumbersWithoutUsingThirdVariable {

	static int a = 10;
	static int b = 20;

	// before swapping printing the numbers

	public static void Before() {

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

	public static void After() {
		a = a + b; // 30
		b = a - b; // 30-20 = 10
		a = a - b; // 30 -10 = 20

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

	public static void main(String[] args) {
		System.out.println("Before Swapping -");
		Before();
		System.out.println(" ");
		System.out.println("After Swapping -");
		After();

	}

}
