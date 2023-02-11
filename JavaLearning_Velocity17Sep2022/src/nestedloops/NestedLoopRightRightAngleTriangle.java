package nestedloops;

public class NestedLoopRightRightAngleTriangle {
	
	public static void main(String[] args) {
		
		int k =4;
		
		for (int i=1; i<=5; i++) {
			
			for(int sp =1; sp<=k; sp++) {
				System.out.print(" ");
			}
			k--;
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	}
}
