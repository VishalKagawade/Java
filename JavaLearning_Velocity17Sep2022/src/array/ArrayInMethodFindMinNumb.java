package array;

public class ArrayInMethodFindMinNumb {
	
	public static void M1(int [] a) {
		
		int g = a[0];//2,1
		for(int i = 1; i<a.length; i++) {
			if(g>a[i])
				g=a[i];
		}
		
		System.out.println("lowest value present in array " + g);
	}
	
	public static void main(String[] args) {
		int [] a = { 50,2,1,225,566,55,6};
		M1(a);
	}

}
